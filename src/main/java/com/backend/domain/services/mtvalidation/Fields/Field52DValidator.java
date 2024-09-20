package com.backend.domain.services.mtvalidation.Fields;

import com.backend.domain.entities.mt.fields.Field52DType;

import java.util.regex.Pattern;
import java.util.logging.Logger;

public class Field52DValidator {

    private static final Logger LOGGER = Logger.getLogger(Field52DValidator.class.getName());

    public boolean validateField52D(Field52DType field52D) {
        if (field52D == null) {
            LOGGER.warning("Field52D is null");
            return false;
        }

        // Validate partyIdentifier (optional, up to 34 alphanumeric characters)
        if (field52D.getPartyIdentifier() != null && !Pattern.matches("\\w{0,34}", field52D.getPartyIdentifier())) {
            LOGGER.warning("Invalid Field52D partyIdentifier. Must be up to 34 alphanumeric characters.");
            return false;
        }

        // Validate numberAddress (optional, up to 34 alphanumeric characters, spaces, and punctuation)
        if (field52D.getNumberAddress() != null && !Pattern.matches("[\\w\\s,.-]{0,34}", field52D.getNumberAddress())) {
            LOGGER.warning("Invalid Field52D numberAddress. Must be up to 34 alphanumeric characters, spaces, and punctuation.");
            return false;
        }

        return true;
    }
}
