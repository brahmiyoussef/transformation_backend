package com.backend;

import com.backend.controllers.MTparseController;
import com.backend.domain.entities.mt.blocks.Block4;
import com.backend.domain.entities.mt.fields.Field23EType;
import com.backend.domain.entities.mt.fields.Field32AType;
import com.backend.domain.entities.mt.message.Message;
import com.backend.domain.entities.mt.message.ObjectFactory;

import com.backend.domain.services.mtparsing.BlockExtractor;
import com.backend.domain.services.mtparsing.parser;


import java.lang.reflect.Field;
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

        parser mtMessageService = new parser();

        Message message = mtMessageService.parseMtMessage(mt103Message);

        System.out.println("Le msg est: " + message);

    }

}
