package com.backend.domain.services.mtvalidation.Fields.Validators;

import com.backend.domain.entities.mt.fields.Field53BType;

import java.util.regex.Pattern;
import java.util.logging.Logger;

public class Field53BValidator {

    private static final Logger LOGGER = Logger.getLogger(Field53BValidator.class.getName());

    public boolean validateField53B(Field53BType field53B) {
        if (field53B == null) {
            LOGGER.warning("Field53B is null");
            return false;
        }

        // Validate partyIdentifier (optional, up to 34 alphanumeric characters)
        if (field53B.getPartyIdentifier() != null && !Pattern.matches("\\w{0,34}", field53B.getPartyIdentifier())) {
            LOGGER.warning("Invalid Field53B partyIdentifier (must be up to 34 alphanumeric characters)");
            return false;
        }

        // Validate location (optional, up to 35 characters)
        if (field53B.getLocation() != null && !Pattern.matches("[\\w\\s,.-]{0,35}", field53B.getLocation())) {
            LOGGER.warning("Invalid Field53B location (must be up to 35 characters with letters, digits, spaces, commas, periods, and hyphens)");
            return false;
        }

        return true;
    }
}
