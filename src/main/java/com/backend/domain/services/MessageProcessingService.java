package com.backend.domain.services;

import com.backend.domain.services.mtparsing.parser;
import com.backend.domain.services.mxBuilding.MTtoMXMappingService;
import com.backend.domain.services.mxBuilding.PACS008XMLBuilder;
import com.backend.domain.entities.mt.message.Message;
import com.backend.domain.entities.mx.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageProcessingService {

    @Autowired
    private parser parserService;

    @Autowired
    private MTtoMXMappingService mappingService;

    @Autowired
    private PACS008XMLBuilder xmlBuilder;

    public void processMessage(String mtMessage, String outputPath) {
        // Parse the MT message
        Message message = parserService.parseMtMessage(mtMessage);

        // Map MT message to MX document
        Document document = mappingService.mapMTtoMX(message);

        // Build XML file
        xmlBuilder.buildXML(document, outputPath);
    }
}
