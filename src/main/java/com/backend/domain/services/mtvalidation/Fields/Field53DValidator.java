package com.backend.domain.services.mtvalidation.Fields;

import com.backend.domain.entities.mt.fields.Field53DType;

import java.util.regex.Pattern;
import java.util.logging.Logger;

public class Field53DValidator {

    private static final Logger LOGGER = Logger.getLogger(Field53DValidator.class.getName());

    public boolean validateField53D(Field53DType field53D) {
        if (field53D == null) {
            LOGGER.warning("Field53D is null");
            return false;
        }

        // Validate partyIdentifier (optional, up to 34 alphanumeric characters)
        if (field53D.getPartyIdentifier() != null && !Pattern.matches("\\w{0,34}", field53D.getPartyIdentifier())) {
            LOGGER.warning("Invalid Field53D partyIdentifier (must be up to 34 alphanumeric characters)");
            return false;
        }

        // Validate numberAddress (optional, up to 34 characters)
        if (field53D.getnumberAddress() != null && !Pattern.matches("[\\w\\s,.-]{0,34}", field53D.getnumberAddress())) {
            LOGGER.warning("Invalid Field53D numberAddress (must be up to 34 characters with letters, digits, spaces, commas, periods, and hyphens)");
            return false;
        }

        return true;
    }
}
