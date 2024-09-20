package com.backend.domain.services.mtvalidation.Fields.Validators;

import com.backend.domain.entities.mt.fields.Field57BType;

import java.util.logging.Logger;

public class Field57BValidator {

    private static final Logger LOGGER = Logger.getLogger(Field57BValidator.class.getName());

    public boolean validateField57B(Field57BType field57B) {
        if (field57B == null) {
            LOGGER.warning("Field57B is null");
            return false;
        }

        String partyIdentifierRegex = "\\w{0,34}";
        String locationRegex = "[\\d\\w\\s,.-]{0,34}";

        boolean isPartyIdentifierValid = field57B.getPartyIdentifier() == null || field57B.getPartyIdentifier().matches(partyIdentifierRegex);
        if (!isPartyIdentifierValid) {
            LOGGER.warning("Invalid Field57B partyIdentifier");
            return false;
        }

        boolean isLocationValid = field57B.getLocation() == null || field57B.getLocation().matches(locationRegex);
        if (!isLocationValid) {
            LOGGER.warning("Invalid Field57B location");
            return false;
        }

        return true;
    }
}
