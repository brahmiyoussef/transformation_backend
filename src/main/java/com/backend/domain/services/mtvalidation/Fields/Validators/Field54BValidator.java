package com.backend.domain.services.mtvalidation.Fields.Validators;

import com.backend.domain.entities.mt.fields.Field54BType;

import java.util.logging.Logger;
import java.util.regex.Pattern;

public class Field54BValidator {

    private static final Logger LOGGER = Logger.getLogger(Field54BValidator.class.getName());

    public boolean validateField54B(Field54BType field54B) {
        if (field54B == null) {
            LOGGER.warning("Field54B is null");
            return false;
        }

        // Validation regex for partyIdentifier (up to 34 alphanumeric characters)
        String partyIdentifierRegex = "\\w{0,34}";
        // Validation regex for location (up to 35 alphanumeric characters and allowed symbols)
        String locationRegex = "[\\w\\s,.-]{0,35}";

        boolean isPartyIdentifierValid = field54B.getPartyIdentifier() != null && field54B.getPartyIdentifier().matches(partyIdentifierRegex);
        if (!isPartyIdentifierValid) {
            LOGGER.warning("Invalid Field54B partyIdentifier");
            return false;
        }

        boolean isLocationValid = field54B.getLocation() != null && field54B.getLocation().matches(locationRegex);
        if (!isLocationValid) {
            LOGGER.warning("Invalid Field54B location");
            return false;
        }

        return true;
    }
}
