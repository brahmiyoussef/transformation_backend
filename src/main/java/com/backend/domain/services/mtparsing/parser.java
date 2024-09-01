package com.backend.domain.services.mtparsing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import com.backend.domain.entities.mt.message.Message;
import com.backend.domain.entities.mt.message.ObjectFactory;
import com.backend.domain.entities.mt.blocks.Block1Type;
import com.backend.domain.entities.mt.blocks.Block2Type;
import com.backend.domain.entities.mt.blocks.Block3Type;
import com.backend.domain.entities.mt.blocks.Block4;
import java.util.Map;

@Service
public class parser {

    @Autowired
    private BlockExtractor blockExtractor;

    @Autowired
    private ObjectFactory objectFactory;

    public Message parseMtMessage(String mtMessage) {
        // Extract blocks from the MT message
        String[] blocks = blockExtractor.extractBlocks(mtMessage);
        // Create a new Message instance using the ObjectFactory
        Message message = objectFactory.createMessage();

        // Parse each block and populate the Message instance
        if (blocks[0] != null) {
            Block1Type block1 = objectFactory.createBlock1Type();
            if (block1.parse(blocks[0])) {
                message.setBlock1(block1);
            }
        }
        if (blocks[1] != null) {
            Block2Type block2 = objectFactory.createBlock2Type();
            if (block2.parse(blocks[1])) {
                message.setBlock2(block2);
            }
        }
        if (blocks[2] != null) {

            message.setBlock3(blocks[2]);

        }
        if (blocks[3] != null) {
            Block4 block4 = objectFactory.createBlock4();
            Map<String, String> block4Map = BlockExtractor.splitBlock4(blocks[3]);
            try {
                block4.populateBlock4(block4Map);
            } catch (Exception e) {
                // Log the exception and handle it as needed
                System.err.println("Error populating Block4: " + e.getMessage());
                e.printStackTrace();
                // Optionally, you can decide to set block4 to null or handle the error in another way
                // message.setBlock4(null);
            }            message.setBlock4(block4);
        }
        return message;
    }
}
