package com.backend.domain.services.mtvalidation.Fields;

import java.util.logging.Logger;

public class Field72Validator {

    private static final Logger LOGGER = Logger.getLogger(Field72Validator.class.getName());

    public boolean validateField72(String field72) {
        if (field72 == null) {
            LOGGER.warning("Field72 is null");
            return false;
        }

        String[] lines = field72.split("\n");

        if (lines.length > 6 || lines.length == 0) {
            LOGGER.warning("Field72 has an invalid number of lines");
            return false;
        }

        if (!lines[0].matches("^/\\d{2}[A-Z]/.*$")) {
            LOGGER.warning("Invalid format for the first line in Field72");
            return false;
        }

        for (String line : lines) {
            if (line.length() > 35) {
                LOGGER.warning("Line in Field72 exceeds 35 characters");
                return false;
            }

            if (!line.matches("^[\\p{Print}]{1,35}$")) {
                LOGGER.warning("Line in Field72 contains invalid characters");
                return false;
            }
        }

        return true;
    }
}
