package com.backend.controllers;
import com.backend.domain.services.mtparsing.MTFieldMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mt")
public class MTFieldController {

    private final MTFieldMapperService mtFieldMapperService;

    @Autowired
    public MTFieldController(MTFieldMapperService mtFieldMapperService) {
        this.mtFieldMapperService = mtFieldMapperService;
    }

    @PostMapping("/process")
    public String processMTMessage(@RequestBody String block4) {
        try {
            mtFieldMapperService.processMTMessage(block4);
            return "MT message processed successfully.";
        } catch (Exception e) {
            // Log the exception (optional)
            return "Error processing MT message: " + e.getMessage();
        }
    }
}