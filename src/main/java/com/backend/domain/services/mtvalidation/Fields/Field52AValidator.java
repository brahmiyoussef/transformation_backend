package com.backend.domain.services.mtvalidation.Fields;

import com.backend.domain.entities.mt.fields.Field52AType;

import java.util.regex.Pattern;
import java.util.logging.Logger;

public class Field52AValidator {

    private static final Logger LOGGER = Logger.getLogger(Field52AValidator.class.getName());

    public boolean validateField52A(Field52AType field52A) {
        if (field52A == null) {
            LOGGER.warning("Field52A is null");
            return false;
        }

        // Validate partyIdentifier (optional, up to 34 alphanumeric characters)
        if (field52A.getPartyIdentifier() != null && !Pattern.matches("\\w{0,34}", field52A.getPartyIdentifier())) {
            LOGGER.warning("Invalid Field52A partyIdentifier. Must be up to 34 alphanumeric characters.");
            return false;
        }

        // Validate identifierCode (required, up to 11 uppercase letters)
        if (field52A.getIdentifierCode() == null || !Pattern.matches("[A-Z]{0,11}", field52A.getIdentifierCode())) {
            LOGGER.warning("Invalid Field52A identifierCode. Must be up to 11 uppercase letters.");
            return false;
        }

        return true;
    }
}
