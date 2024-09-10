package com.backend.controllers;

import com.backend.domain.entities.mt.message.Message;
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

        // Build XML file


        String output = "output/pacs008.xml";
        xmlBuilder.buildXML(document, output);

        return message;
    }
}