package com.backend.domain.services.mtvalidation.Fields.Validators;

import com.backend.domain.entities.mt.fields.Field53AType;

import java.util.regex.Pattern;
import java.util.logging.Logger;

public class Field53AValidator {

    private static final Logger LOGGER = Logger.getLogger(Field53AValidator.class.getName());

    public boolean validateField53A(Field53AType field53A) {
        if (field53A == null) {
            LOGGER.warning("Field53A is null");
            return false;
        }

        // Validate partyIdentifier (optional, up to 34 alphanumeric characters)
        if (field53A.getPartyIdentifier() != null && !Pattern.matches("\\w{0,34}", field53A.getPartyIdentifier())) {
            LOGGER.warning("Invalid Field53A partyIdentifier. Must be up to 34 alphanumeric characters.");
            return false;
        }

        // Validate identifierCode (required, alphanumeric with a length of 1 to 11 characters)
        if (field53A.getIdentifierCode() == null || !Pattern.matches("[A-Z0-9]{1,11}", field53A.getIdentifierCode())) {
            LOGGER.warning("Invalid Field53A identifierCode. Must be up to 11 alphanumeric characters.");
            return false;
        }

        return true;
    }
}
