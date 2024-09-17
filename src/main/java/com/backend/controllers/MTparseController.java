package com.backend.controllers;

import com.backend.domain.entities.mt.message.Message;
import com.backend.domain.entities.mx.CreditTransferTransaction64;
import com.backend.domain.entities.mx.Document;
import com.backend.domain.entities.mx.GroupHeader113;
import com.backend.domain.services.mtparsing.parser;
import com.backend.domain.services.mxBuilding.MTtoMXMappingService;
import com.backend.domain.services.mxBuilding.PACS008XMLBuilder;
import com.backend.domain.services.mxBuilding.mapping.Field32AMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController

public class MTparseController {

    @Autowired
    private parser mtMessageService;

    @Autowired
    private MTtoMXMappingService mtToMxMappingService;  // Inject the new service
    @Autowired
    private PACS008XMLBuilder xmlBuilder;
    @GetMapping("/parsemt")
    public Message parseMtMessage(@RequestParam String mtMessage) {
        // Call the MtMessageService to parse the message
        Message message = mtMessageService.parseMtMessage(mtMessage);

        // Delegate the mapping to the MTtoMXMappingService
        Document document = mtToMxMappingService.mapMTtoMX(message);
        System.out.println("Document Content: " + document.getFIToFICstmrCdtTrf().getGrpHdr());
        // Similarly, print other fields inside the document
        // Check if the list is not empty
        if (!document.getFIToFICstmrCdtTrf().getCdtTrfTxInf().isEmpty()) {
            // Iterate over the list of CreditTransferTransaction64 objects
            for (CreditTransferTransaction64 txInf : document.getFIToFICstmrCdtTrf().getCdtTrfTxInf()) {
                // Access individual fields inside each CreditTransferTransaction64 object
                System.out.println("Exchange Rate: " + txInf.getChrgsInf());
                // Add more fields as necessary
            }
        } else {
            System.out.println("No Credit Transfer Transactions found.");
        }

        // Set the output path for the XML file in the "output1" folder
        String outputDirectory = "output1";
        String outputFilePath = outputDirectory + File.separator + "pacs008.xml";
        System.out.println("Document object: " + document);

        // Ensure the directory exists or create it
        File outputDir = new File(outputDirectory);
        if (!outputDir.exists()) {
            outputDir.mkdirs();  // Create the directory if it doesn't exist
        }

        // Build the XML using the PACS008XMLBuilder
        xmlBuilder.buildXML(document, outputFilePath);

        return message;
    }

}