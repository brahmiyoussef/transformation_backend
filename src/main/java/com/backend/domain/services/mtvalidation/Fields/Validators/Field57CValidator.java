package com.backend.domain.services.mtvalidation.Fields.Validators;

import java.util.logging.Logger;

public class Field57CValidator {

    private static final Logger LOGGER = Logger.getLogger(Field57CValidator.class.getName());

    public boolean validateField57C(String field57C) {
        if (field57C == null || field57C.isEmpty()) {
            LOGGER.warning("Field57C is null or empty");
            return false;
        }

        String partyIdentifierRegex = "^[A-Za-z0-9]{1,34}$";
        boolean isValid = field57C.matches(partyIdentifierRegex);
        if (!isValid) {
            LOGGER.warning("Invalid Field57C partyIdentifier");
        }

        return isValid;
    }
}
