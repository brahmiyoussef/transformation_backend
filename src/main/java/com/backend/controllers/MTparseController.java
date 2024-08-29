package com.backend.controllers;

import com.backend.domain.entities.mt.message.Message;
import com.backend.domain.services.mtparsing.parser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MTparseController {

    @Autowired
    private parser mtMessageService;

    @GetMapping("/parsemt")
    public Message parseMtMessage(@RequestParam String mtMessage) {
        // Call the MtMessageService to parse the message
        Message message = mtMessageService.parseMtMessage(mtMessage);
        // Return the resulting Message object
        return message;
    }
}
