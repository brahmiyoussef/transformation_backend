package com.backend.domain.services.mtvalidation.Fields.Validators;

import java.util.logging.Logger;

public class Field77BValidator {

    private static final Logger LOGGER = Logger.getLogger(Field77BValidator.class.getName());

    public boolean validateField77B(String field77B) {
        if (field77B == null) {
            LOGGER.warning("Field77B is null");
            return false;
        }

        String[] lines = field77B.split("\n");

        if (lines.length > 3 || lines.length == 0) {
            LOGGER.warning("Field77B has an invalid number of lines");
            return false;
        }

        for (String line : lines) {
            if (line.length() > 35) {
                LOGGER.warning("Line in Field77B exceeds 35 characters");
                return false;
            }

            if (!line.matches("^[\\p{Print}]{1,35}$")) {
                LOGGER.warning("Line in Field77B contains invalid characters");
                return false;
            }
        }

        return true;
    }
}
