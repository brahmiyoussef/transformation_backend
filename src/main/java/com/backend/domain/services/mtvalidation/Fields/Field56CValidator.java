package com.backend.domain.services.mtvalidation.Fields;

import java.util.logging.Logger;

public class Field56CValidator {

    private static final Logger LOGGER = Logger.getLogger(Field56CValidator.class.getName());

    public boolean validateField56C(String field56C) {
        if (field56C == null) {
            LOGGER.warning("Field56C is null");
            return false;
        }

        String bicRegex = "^[A-Z]{6}[A-Z2-9][A-NP-Z0-9]([A-Z0-9]{3})?$";
        boolean isValidBIC = field56C.matches(bicRegex);
        if (!isValidBIC) {
            LOGGER.warning("Invalid Field56C BIC");
        }

        return isValidBIC;
    }
}
