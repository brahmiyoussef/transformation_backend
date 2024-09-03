package com.backend;

import com.backend.controllers.MTparseController;
import com.backend.domain.entities.mt.blocks.Block4;
import com.backend.domain.entities.mt.fields.Field23EType;
import com.backend.domain.entities.mt.fields.Field32AType;
import com.backend.domain.entities.mt.message.Message;
import com.backend.domain.entities.mt.message.ObjectFactory;
import com.backend.domain.entities.mx.ActiveCurrencyAndAmount;
import com.backend.domain.entities.mx.CreditTransferTransaction64;
import com.backend.domain.entities.mx.GroupHeader113;
import com.backend.domain.entities.mx.InstructionForCreditorAgent3;
import com.backend.domain.services.mtparsing.BlockExtractor;
import com.backend.domain.services.mtparsing.parser;
import com.backend.domain.services.mxBuilding.mapping.Block4Mapper;
import com.backend.domain.services.mxBuilding.mapping.Field23EMapper;
import com.backend.domain.services.mxBuilding.mapping.Field32AMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import com.backend.domain.services.mtparsing.parser;

import java.util.Map;

public class BackendApplication {

    public static void main(String[] args) {
        // Create an instance of BlockExtractor
        BlockExtractor blockExtractor = new BlockExtractor();

        // Example MT 103 message
        String mt103Message = "{1:F01BANKBEBBAXXX0000000000}{2:I103SOGEFRPPZXXXU3003}{4:\n" +
                ":20:1234567890\n:23B:CRED\n:32A:240828EUR1000,\n:50K:/12345678901234567890\n" +
                "JOHN DOE\n1 MAIN STREET\nBRUSSELS\n:59:/98765432109876543210\nJANE SMITH\n2 HIGH STREET\n" +
                "BERLIN\n:71A:SHA\n-}";

        // Extract blocks
        String[] blocks = blockExtractor.extractBlocks(mt103Message);

        // Print the blocks
        for (int i = 0; i < blocks.length; i++) {
            System.out.println("Block " + (i + 1) + ":");
            System.out.println(blocks[i]);
            System.out.println();
        }


        ObjectFactory objectFactory = new ObjectFactory();
        parser mtMessageService = new parser();
        Message message = mtMessageService.parseMtMessage(mt103Message);

        System.out.println("Le msg est: " + message);

        String block4Content = blocks[3];
        Map<String, String> block4Map = null;
        if (block4Content != null && !block4Content.isEmpty()) {
            System.out.println("Block 4 Content:");
            System.out.println(block4Content);

            // Call splitBlock4 method
            block4Map = blockExtractor.splitBlock4(block4Content);

            // Print the results of splitBlock4
            System.out.println("Parsed Block 4:");
            for (Map.Entry<String, String> entry : block4Map.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        } else {
            System.out.println("Block 4 content is empty or null.");
        }
        Block4 block4 = objectFactory.createBlock4();
    try {
        block4.populateBlock4(block4Map);
        System.out.println("block4populated");
        System.out.println("Field20: " + block4.getField20());
        System.out.println("Field23E: " + block4.getField23E());
        System.out.println("Field36: " + block4.getField36());
    }
    catch (NullPointerException e) {
        // Handle or log the specific exception
        System.err.println("An error occurred while populating block4: " + e.getMessage());
       // Optional: prints stack trace to help diagnose the problem
    }
    catch (IllegalArgumentException e) {
        // Handle or log another specific exception
        System.err.println("A different error occurred: " + e.getMessage());
        e.printStackTrace(); // Optional
    }
    catch (Exception e) {
        System.err.println("An unexpected error occurred: " + e.getMessage());
        e.printStackTrace();
    }

    }



    }
