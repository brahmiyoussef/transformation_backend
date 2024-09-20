package com.backend.domain.services.mtvalidation.Fields.Validators;

import com.backend.domain.entities.mt.fields.Field55AType;

import java.util.logging.Logger;

public class Field55AValidator {

    private static final Logger LOGGER = Logger.getLogger(Field55AValidator.class.getName());

    public boolean validateField55A(Field55AType field55A) {
        if (field55A == null) {
            LOGGER.warning("Field55A is null");
            return false;
        }

        // Validation regex for partyIdentifier (up to 34 alphanumeric characters)
        String partyIdentifierRegex = "\\w{0,34}";
        // Validation regex for identifierCode (up to 11 uppercase letters)
        String identifierCodeRegex = "[A-Z]{0,11}";

        boolean isPartyIdentifierValid = field55A.getPartyIdentifier() != null && field55A.getPartyIdentifier().matches(partyIdentifierRegex);
        if (!isPartyIdentifierValid) {
            LOGGER.warning("Invalid Field55A partyIdentifier");
            return false;
        }

        boolean isIdentifierCodeValid = field55A.getIdentifierCode() != null && field55A.getIdentifierCode().matches(identifierCodeRegex);
        if (!isIdentifierCodeValid) {
            LOGGER.warning("Invalid Field55A identifierCode");
            return false;
        }

        return true;
    }
}
