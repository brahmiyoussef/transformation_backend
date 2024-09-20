package com.backend.domain.services.mtvalidation.Fields;

import com.backend.domain.entities.mt.fields.Field56AType;

import java.util.logging.Logger;

public class Field56AValidator {

    private static final Logger LOGGER = Logger.getLogger(Field56AValidator.class.getName());

    public boolean validateField56A(Field56AType field56A) {
        if (field56A == null) {
            LOGGER.warning("Field56A is null");
            return false;
        }

        String partyIdentifierRegex = "\\w{0,34}";
        String identifierCodeRegex = "[A-Z]{0,11}";

        boolean isPartyIdentifierValid = field56A.getPartyIdentifier() != null && field56A.getPartyIdentifier().matches(partyIdentifierRegex);
        if (!isPartyIdentifierValid) {
            LOGGER.warning("Invalid Field56A partyIdentifier");
            return false;
        }

        boolean isIdentifierCodeValid = field56A.getIdentifierCode() != null && field56A.getIdentifierCode().matches(identifierCodeRegex);
        if (!isIdentifierCodeValid) {
            LOGGER.warning("Invalid Field56A identifierCode");
            return false;
        }

        return true;
    }
}
