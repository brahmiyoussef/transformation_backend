package com.backend.domain.services.mtvalidation.Fields;

import com.backend.domain.entities.mt.blocks.Block1Type;

public class Block1FieldsValidation {

    public boolean validateBlock1Fields(Block1Type block1) {
        // Ensure block1 is not null before validation
        if (block1 == null) {
            return false;
        }

        return validateApplicationId(block1.getApplicationId()) &&
                validateServiceId(block1.getServiceId()) &&
                validateLogicalTerminal(block1.getLogicalTerminal()) &&
                validateSessionNumber(block1.getSessionNumber()) &&
                validateSequenceNumber(block1.getSequenceNumber());
    }

    private boolean validateApplicationId(String applicationId) {
        return applicationId != null && applicationId.matches("[A-Z]{1}");
    }

    private boolean validateServiceId(String serviceId) {
        return serviceId != null && serviceId.matches("\\d{2}");
    }

    private boolean validateLogicalTerminal(String logicalTerminal) {
        return logicalTerminal != null && logicalTerminal.matches("[A-Z0-9]{1,12}");
    }

    private boolean validateSessionNumber(String sessionNumber) {
        return sessionNumber != null && sessionNumber.matches("\\d{1,6}");
    }

    private boolean validateSequenceNumber(String sequenceNumber) {
        return sequenceNumber != null && sequenceNumber.matches("\\d{1,9}");
    }
}
