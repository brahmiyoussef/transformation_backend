package com.backend.domain.services.mtvalidation;

public class MTvalidator {
    private final MTstructure structureValidator;
    private final MTfields fieldsValidator;

    public MTvalidator() {
        this.structureValidator = new MTstructure();
        this.fieldsValidator = new MTfields();
    }

    public boolean validateMessage(String message) {
        return structureValidator.validateStructure(message) &&
                fieldsValidator.validateFields(message);
    }
}

