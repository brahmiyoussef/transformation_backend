package com.backend.domain.services.mtvalidation.Fields;

import com.backend.domain.entities.mt.blocks.Block2Type;

public class Block2FieldsValidation {

    public boolean validateBlock2Fields(Block2Type block2) {
        if (block2 == null) {
            return false;
        }

        // Validate input or output based on I_O_id
        if ("I".equals(block2.getI_O_id())) {
            return validateInputFields(block2);
        } else if ("O".equals(block2.getI_O_id())) {
            return validateOutputFields(block2);
        }

        return false;
    }

    // Validation logic for input fields
    private boolean validateInputFields(Block2Type block2) {
        return validateIOId(block2.getI_O_id()) &&
                validateMessageType(block2.getMessageType()) &&
                validateReceiverAddress(block2.getReceiverAddress()) &&
                validateMessagePriority(block2.getMessagePriority()) &&
                validateDeliveryMonitoring(block2.getDeliveryMonitoring()) &&
                validateObsolescencePeriod(block2.getObsolescencePeriod());
    }

    // Validation logic for output fields
    private boolean validateOutputFields(Block2Type block2) {
        return validateIOId(block2.getI_O_id()) &&
                validateMessageType(block2.getMessageType()) &&
                validateReceiverAddress(block2.getReceiverAddress()) &&
                validateInputTime(block2.getInputTime()) &&
                validateMir(block2.getMir()) &&
                validateOutputDate(block2.getOutputDate()) &&
                validateOutputTime(block2.getOutputTime()) &&
                validateMessagePriority(block2.getMessagePriority());
    }

    // Field validation methods

    private boolean validateIOId(String ioId) {
        return ioId != null && ioId.matches("[I,O]");
    }

    private boolean validateMessageType(String messageType) {
        return messageType != null && messageType.matches("\\d{3}");
    }

    private boolean validateReceiverAddress(String receiverAddress) {
        return receiverAddress != null && receiverAddress.matches("[A-Z0-9]{12}");
    }

    private boolean validateMessagePriority(String messagePriority) {
        return messagePriority == null || messagePriority.matches("[SUN]");
    }

    private boolean validateDeliveryMonitoring(String deliveryMonitoring) {
        return deliveryMonitoring == null || deliveryMonitoring.matches("[123]");
    }

    private boolean validateObsolescencePeriod(String obsolescencePeriod) {
        return obsolescencePeriod == null || obsolescencePeriod.matches("(020|003)");
    }

    private boolean validateInputTime(String inputTime) {
        return inputTime != null && inputTime.matches("\\d{4}");
    }

    private boolean validateMir(String mir) {
        return mir != null && mir.matches("[0-9]{6}[A-Z0-9]{12}[0-9]{4}[0-9]{6}");
    }

    private boolean validateOutputDate(String outputDate) {
        return outputDate != null && outputDate.matches("\\d{6}");
    }

    private boolean validateOutputTime(String outputTime) {
        return outputTime != null && outputTime.matches("\\d{4}");
    }
}
