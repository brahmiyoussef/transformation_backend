package com.backend.domain.services.mtvalidation.Fields.Validators;

import com.backend.domain.entities.mt.fields.Field54AType;

import java.util.logging.Logger;

public class Field54AValidator {

    private static final Logger LOGGER = Logger.getLogger(Field54AValidator.class.getName());

    public boolean validateField54A(Field54AType field54A) {
        if (field54A == null) {
            LOGGER.warning("Field54A is null");
            return false;
        }

        // Validation regex for partyIdentifier (optional, up to 34 alphanumeric characters)
        String partyIdentifierRegex = "\\w{0,34}";
        if (field54A.getPartyIdentifier() != null && !field54A.getPartyIdentifier().matches(partyIdentifierRegex)) {
            LOGGER.warning("Invalid Field54A partyIdentifier (must be up to 34 alphanumeric characters)");
            return false;
        }

        // Validation regex for identifierCode (required, up to 11 uppercase letters)
        String identifierCodeRegex = "[A-Z]{1,11}";
        if (field54A.getIdentifierCode() == null || !field54A.getIdentifierCode().matches(identifierCodeRegex)) {
            LOGGER.warning("Invalid Field54A identifierCode (must be up to 11 uppercase letters)");
            return false;
        }

        return true;
    }
}
