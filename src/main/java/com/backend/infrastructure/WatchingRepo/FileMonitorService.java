package com.backend.infrastructure.WatchingRepo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Collectors;

@Service
public class FileMonitorService {

    @Value("${file.monitor.directory}")
    private String directoryPathString;

    private Path directoryPath;

    @EventListener(org.springframework.context.event.ContextRefreshedEvent.class)
    @Order(0)
    public void onApplicationEvent() {
        directoryPath = Paths.get(directoryPathString);
        createDirectoryIfNotExists(directoryPath);
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
            System.out.println("File content: " + content);

            // You can replace this print statement with calls to other services
            // For example: fileProcessingService.process(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
