package com.backend.infrastructure.WatchingRepo;

import com.backend.domain.entities.mt.message.Message;
import com.backend.domain.services.mtparsing.BlockExtractor;
import com.backend.domain.services.mtparsing.parser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.*;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class FileMonitorService {

    @Autowired
    private parser mtMessageService;

    @Value("${file.monitor.directory}")
    private String directoryPathString;

    private Path directoryPath;

    @EventListener(org.springframework.context.event.ContextRefreshedEvent.class)
    @Order(0)
    public void onApplicationEvent() {
        directoryPath = Paths.get(directoryPathString);
        createDirectoryIfNotExists(directoryPath);
        processExistingFiles();  // Process existing files on startup
        Thread monitorThread = new Thread(this::monitorDirectory);
        monitorThread.setDaemon(true);
        monitorThread.start();
    }

    private void createDirectoryIfNotExists(Path path) {
        if (!Files.exists(path)) {
            try {
                Files.createDirectory(path);
                System.out.println("Directory created: " + path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void processExistingFiles() {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(directoryPath)) {
            for (Path filePath : stream) {
                if (Files.isRegularFile(filePath)) {
                    readFileContent(filePath);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void monitorDirectory() {
        try (WatchService watchService = FileSystems.getDefault().newWatchService()) {
            directoryPath.register(watchService, StandardWatchEventKinds.ENTRY_CREATE);

            while (true) {
                WatchKey key;
                try {
                    key = watchService.take();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }

                for (WatchEvent<?> event : key.pollEvents()) {
                    if (event.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
                        Path filePath = directoryPath.resolve((Path) event.context());
                        readFileContent(filePath);
                    }
                }

                boolean valid = key.reset();
                if (!valid) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readFileContent(Path filePath) {
        try {
            String content = Files.lines(filePath)
                    .collect(Collectors.joining("\n"));
            Message message = mtMessageService.parseMtMessage(content);
            System.out.println(message);
            // You can replace this print statement with calls to other services
            // For example: fileProcessingService.process(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
