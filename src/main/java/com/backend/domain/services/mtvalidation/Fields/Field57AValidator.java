package com.backend.domain.services.mtvalidation.Fields;

import com.backend.domain.entities.mt.fields.Field57AType;

import java.util.logging.Logger;

public class Field57AValidator {

    private static final Logger LOGGER = Logger.getLogger(Field57AValidator.class.getName());

    public boolean validateField57A(Field57AType field57A) {
        if (field57A == null) {
            LOGGER.warning("Field57A is null");
            return false;
        }

        String partyIdentifierRegex = "\\w{0,34}";
        String identifierCodeRegex = "[A-Z]{0,11}";

        boolean isPartyIdentifierValid = field57A.getPartyIdentifier() == null || field57A.getPartyIdentifier().matches(partyIdentifierRegex);
        if (!isPartyIdentifierValid) {
            LOGGER.warning("Invalid Field57A partyIdentifier");
            return false;
        }

        boolean isIdentifierCodeValid = field57A.getIdentifierCode() != null && field57A.getIdentifierCode().matches(identifierCodeRegex);
        if (!isIdentifierCodeValid) {
            LOGGER.warning("Invalid Field57A identifierCode");
            return false;
        }

        return true;
    }
}
