package com.backend.domain.services.mtvalidation.Fields.Validators;

import com.backend.domain.entities.mt.fields.Field55BType;

import java.util.logging.Logger;

public class Field55BValidator {

    private static final Logger LOGGER = Logger.getLogger(Field55BValidator.class.getName());

    public boolean validateField55B(Field55BType field55B) {
        if (field55B == null) {
            LOGGER.warning("Field55B is null");
            return false;
        }

        // Validation regex for partyIdentifier (up to 34 alphanumeric characters)
        String partyIdentifierRegex = "\\w{0,34}";
        // Validation regex for location (alphanumeric and punctuation, up to 35 characters)
        String locationRegex = "[\\d\\w\\s,.-]{0,35}";

        boolean isPartyIdentifierValid = field55B.getPartyIdentifier() != null && field55B.getPartyIdentifier().matches(partyIdentifierRegex);
        if (!isPartyIdentifierValid) {
            LOGGER.warning("Invalid Field55B partyIdentifier");
            return false;
        }

        boolean isLocationValid = field55B.getLocation() != null && field55B.getLocation().matches(locationRegex);
        if (!isLocationValid) {
            LOGGER.warning("Invalid Field55B location");
            return false;
        }

        return true;
    }
}
