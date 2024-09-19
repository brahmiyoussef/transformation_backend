package com.backend.domain.services.mtvalidation;

import com.backend.domain.entities.mt.blocks.Block1Type;
import com.backend.domain.entities.mt.blocks.Block2Type;
import com.backend.domain.entities.mt.blocks.Block3Type;
import com.backend.domain.entities.mt.blocks.Block4;
import com.backend.domain.entities.mt.message.Message;
import com.backend.domain.services.mtparsing.parser;
import com.backend.domain.services.mtvalidation.Fields.Block1FieldsValidation;
import com.backend.domain.services.mtvalidation.Fields.Block2FieldsValidation;
import com.backend.domain.services.mtvalidation.Fields.Block3FieldsValidation;
import com.backend.domain.services.mtvalidation.Fields.Block4FieldsValidation;

import java.util.Map;

public class MTfields {

    private final Block1FieldsValidation block1Validator = new Block1FieldsValidation();
    private final Block2FieldsValidation block2Validator = new Block2FieldsValidation();
    private final Block3FieldsValidation block3Validator = new Block3FieldsValidation();
    private final Block4FieldsValidation block4Validator = new Block4FieldsValidation();

    public boolean validateFields(String message) {
        parser mtMessageParser = new parser();
        // Parse the message into its blocks and fields
        Message parsedMessage = mtMessageParser.parseMtMessage(message);
        // Validate fields of each block
        return validateBlock1(parsedMessage.getBlock1()) &&
                validateBlock2(parsedMessage.getBlock2()) &&
                validateBlock3(parsedMessage.getBlock3()) &&
                validateBlock4(parsedMessage.getBlock4());
    }

    public boolean validateBlock1(Block1Type block1) {
        return block1Validator.validateBlock1Fields(block1);
    }

    public boolean validateBlock2(Block2Type block2) {
        return block2Validator.validateBlock2Fields(block2);
    }

    public boolean validateBlock3(Block3Type block3) {
        return block3Validator.validateAllBlock3Fields(block3);
    }

    public boolean validateBlock4(Block4 block4) {
        return block4Validator.validateAllBlock4Fields(block4);
    }
}