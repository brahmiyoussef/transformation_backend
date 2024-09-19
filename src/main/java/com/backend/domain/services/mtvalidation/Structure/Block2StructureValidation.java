package com.backend.domain.services.mtvalidation.Structure;

import com.backend.domain.entities.mt.blocks.Block2Type;

public class Block2StructureValidation {

    public boolean validateBlock2Structure(Block2Type block2) {
        if (block2 == null || block2.getI_O_id() == null) {
            return false;
        }

        // Check if it's an input or output message
        if (block2.getI_O_id().equals("I")) {
            // For input messages, validate mandatory fields
            return block2.getMessageType() != null &&
                    block2.getReceiverAddress() != null;
        } else if (block2.getI_O_id().equals("O")) {
            // For output messages, validate mandatory fields
            return block2.getMessageType() != null &&
                    block2.getReceiverAddress() != null &&
                    block2.getInputTime() != null &&
                    block2.getMir() != null &&
                    block2.getOutputDate() != null &&
                    block2.getOutputTime() != null;
        }

        return false;
    }
}
