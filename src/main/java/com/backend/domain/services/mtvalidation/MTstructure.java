package com.backend.domain.services.mtvalidation;

import com.backend.domain.entities.mt.message.Message;
import com.backend.domain.services.mtvalidation.Structure.Block1StructureValidation;
import com.backend.domain.services.mtvalidation.Structure.Block2StructureValidation;
import com.backend.domain.services.mtvalidation.Structure.Block3StructureValidation;
import com.backend.domain.services.mtvalidation.Structure.Block4StructureValidation;
import com.backend.domain.services.mtparsing.parser;

public class MTstructure {

    private static Block1StructureValidation block1Validator = new Block1StructureValidation();
    private static Block2StructureValidation block2Validator = new Block2StructureValidation();
    private static Block3StructureValidation block3Validator = new Block3StructureValidation();
    private static Block4StructureValidation block4Validator = new Block4StructureValidation();

    /**
     * Validates the structure of the entire MT message.
     * This method parses the MT message and then validates each block's structure.
     *
     * @param mtMessage The raw MT message as a string.
     * @return true if all blocks are valid, false otherwise.
     */
    public static boolean validateStructure(String mtMessage) {
        parser mtMessageParser = new parser();

        // Parse the message into its blocks and fields
        Message parsedMessage = mtMessageParser.parseMtMessage(mtMessage);

        System.out.println("Parsed Message: " + parsedMessage);

        // Validate each block's structure
        boolean block1Valid = validateBlock1Structure(parsedMessage);
        System.out.println("Block 1 validation: " + block1Valid);

        boolean block2Valid = validateBlock2Structure(parsedMessage);
        System.out.println("Block 2 validation: " + block2Valid);

        // Comment or uncomment the block 3 validation if you're testing other parts
        boolean block3Valid = validateBlock3Structure(parsedMessage);
        System.out.println("Block 3 validation: " + block3Valid);

        boolean block4Valid = validateBlock4Structure(parsedMessage);
        System.out.println("Block 4 validation: " + block4Valid);

        return block1Valid && block2Valid && block3Valid && block4Valid;
    }

    private static boolean validateBlock1Structure(Message message) {
        return block1Validator.validateBlock1Structure(message.getBlock1());
    }

    private static boolean validateBlock2Structure(Message message) {
        return block2Validator.validateBlock2Structure(message.getBlock2());
    }

    private static boolean validateBlock3Structure(Message message) {
        return block3Validator.validateBlock3Structure(message.getBlock3());
    }

    private static boolean validateBlock4Structure(Message message) {
        return block4Validator.validateBlock4Structure(message.getBlock4());
    }
}
