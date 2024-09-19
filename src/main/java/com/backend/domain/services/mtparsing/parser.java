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
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Service
public class parser {
    /**
     * Validates the basic structure of the MT message (block presence).
     *
     * @param mtMessage The raw MT message as a string.
     * @return true if the message contains the correct structure, false otherwise.
     */
    public boolean isValidMTMessageFormat(String mtMessage) {
        // Define a regular expression to check for mandatory blocks: {1:}, {2:}, and {4:}
        String mtRegex = "\\{1:.*\\}\\{2:.*\\}(\\{3:.*\\})?\\{4:.*\\}";

        // Use a regex pattern matcher to validate the format
        Pattern pattern = Pattern.compile(mtRegex, Pattern.DOTALL);
        Matcher matcher = pattern.matcher(mtMessage);

        return matcher.matches(); // Returns true if the MT message matches the expected format
    }

    /**
     * Parses the MT message, extracts blocks, and returns a populated Message object.
     *
     * @param mtMessage The raw MT message as a string.
     * @return Message object containing the parsed blocks.
     */

    public Message parseMtMessage(String mtMessage) {
        // Step 1: Validate MT message format before parsing
        if (!isValidMTMessageFormat(mtMessage)) {
            throw new IllegalArgumentException("Invalid MT message format.");
        }
        // Extract blocks from the MT message, parse, and populate the Message object
        BlockExtractor blockExtractor= new BlockExtractor();
        String[] blocks = BlockExtractor.extractBlocks(mtMessage); // Extract string message (mt)
         ObjectFactory objectFactory= new ObjectFactory();
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
            Block3Type block3 = objectFactory.createBlock3Type();
            if (block3.parse(blocks[2])) {
                message.setBlock3(block3);
            }

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
        // Logic to parse the message and populate blocks
        System.out.println("Parsed Block1: " + message.getBlock1());
        System.out.println("Parsed Block2: " + message.getBlock2());
        System.out.println("Parsed Block3: " + message.getBlock3());
        System.out.println("Parsed Block4: " + message.getBlock4());
        return message;
    }
}
