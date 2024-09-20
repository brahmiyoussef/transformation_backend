package com.backend.domain.services.mtvalidation.Fields;

import com.backend.domain.entities.mt.fields.Field50AType;

import java.util.regex.Pattern;
import java.util.logging.Logger;

public class Field50AValidator {

    private static final Logger LOGGER = Logger.getLogger(Field50AValidator.class.getName());

    public boolean validateField50A(Field50AType field50A) {
        if (field50A == null) {
            LOGGER.warning("Field50A is null");
            return false;
        }

        // Validate the account (optional, up to 34 alphanumeric characters)
        if (field50A.getAccount() != null && !Pattern.matches("[0-9]{0,34}", field50A.getAccount())) {
            LOGGER.warning("Invalid Field50A account. Must be up to 34 alphanumeric characters.");
            return false;
        }

        // Validate the identifierCode (required, must be between 0 and 11 uppercase letters)
        if (field50A.getIdentifierCode() == null || !Pattern.matches("[A-Z]{0,11}", field50A.getIdentifierCode())) {
            LOGGER.warning("Invalid Field50A identifierCode. Must be up to 11 uppercase letters.");
            return false;
        }

        // If all validations passed
        return true;
    }
}
