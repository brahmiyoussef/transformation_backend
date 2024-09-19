package com.backend.domain.services.mtvalidation.Structure;

import com.backend.domain.entities.mt.blocks.Block1Type;

public class Block1StructureValidation {

    public boolean validateBlock1Structure(Block1Type block1) {
        // Check the structure of Block1: ensure all mandatory fields are present and valid
        return block1 != null &&
                block1.getApplicationId() != null &&
                block1.getServiceId() != null &&
                block1.getLogicalTerminal() != null &&
                block1.getSessionNumber() != null &&
                block1.getSequenceNumber() != null;
    }
}
