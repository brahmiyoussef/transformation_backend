package com.backend;

import com.backend.domain.services.MessageProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

    @Autowired
    private MessageProcessingService messageProcessingService;

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Exemple de message MT103
        String mtMessage = "{1:F01BANKBEBBAXXX0000000000}{2:I103BANKBEBBXXXXN}{3:{108:1234567890}}{4:\n" +
                ":20:123456789\n" +
                ":23B:CRED\n" +
                ":32A:240914EUR123456,78\n" +
                ":50K:/1234567890\n" +
                "TEST CUSTOMER\n" +
                ":59:/0987654321\n" +
                "RECEIVER CUSTOMER\n" +
                ":71A:OUR\n" +
                ":72:/BNF/1234\n" +
                "-}";

        // Spécifiez le chemin du fichier de sortie
        String outputPath = "output/pacs008.xml";

        // Appel du service pour traiter le message
        messageProcessingService.processMessage(mtMessage, outputPath);

        System.out.println("Le fichier XML a été généré avec succès à l'emplacement: " + outputPath);

        // Affichage du contenu du fichier XML
        try {
            String xmlContent = new String(Files.readAllBytes(Paths.get(outputPath)));
            System.out.println("Contenu du fichier XML généré:");
            System.out.println(xmlContent);
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier XML: " + e.getMessage());
        }
    }
}
