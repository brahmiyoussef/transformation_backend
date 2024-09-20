package com.backend.domain.services.mtvalidation.Fields;

import com.backend.domain.entities.mt.fields.Field51AType;

import java.util.regex.Pattern;
import java.util.logging.Logger;

public class Field51AValidator {

    private static final Logger LOGGER = Logger.getLogger(Field51AValidator.class.getName());

    public boolean validateField51A(Field51AType field51A) {
        if (field51A == null) {
            LOGGER.warning("Field51A is null");
            return false;
        }

        // Validate partyIdentifier (optional, up to 34 alphanumeric characters)
        if (field51A.getPartyIdentifier() != null && !Pattern.matches("\\w{0,34}", field51A.getPartyIdentifier())) {
            LOGGER.warning("Invalid Field51A partyIdentifier. Must be up to 34 alphanumeric characters.");
            return false;
        }

        // Validate identifierCode (required, up to 11 uppercase letters)
        if (field51A.getIdentifierCode() == null || !Pattern.matches("[A-Z]{0,11}", field51A.getIdentifierCode())) {
            LOGGER.warning("Invalid Field51A identifierCode. Must be up to 11 uppercase letters.");
            return false;
        }

        return true;
    }
}
