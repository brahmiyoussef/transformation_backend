package com.backend.domain.services.mtvalidation.Fields.Validators;

import com.backend.domain.entities.mt.fields.Field56DType;

import java.util.logging.Logger;

public class Field56DValidator {

    private static final Logger LOGGER = Logger.getLogger(Field56DValidator.class.getName());

    public boolean validateField56D(Field56DType field56D) {
        if (field56D == null) {
            LOGGER.warning("Field56D is null");
            return false;
        }

        String partyIdentifierRegex = "\\w{0,34}";
        String numberAddressRegex = "[\\d\\w\\s,.-]{0,34}";

        boolean isPartyIdentifierValid = field56D.getPartyIdentifier() != null && field56D.getPartyIdentifier().matches(partyIdentifierRegex);
        if (!isPartyIdentifierValid) {
            LOGGER.warning("Invalid Field56D partyIdentifier");
            return false;
        }

        boolean isNumberAddressValid = field56D.getnumberAddress() != null && field56D.getnumberAddress().matches(numberAddressRegex);
        if (!isNumberAddressValid) {
            LOGGER.warning("Invalid Field56D numberAddress");
            return false;
        }

        return true;
    }
}
