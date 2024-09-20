package com.backend.domain.services.mtvalidation.Fields;

import com.backend.domain.entities.mt.fields.Field55DType;

import java.util.logging.Logger;

public class Field55DValidator {

    private static final Logger LOGGER = Logger.getLogger(Field55DValidator.class.getName());

    public boolean validateField55D(Field55DType field55D) {
        if (field55D == null) {
            LOGGER.warning("Field55D is null");
            return false;
        }

        // Validation regex for partyIdentifier (up to 34 alphanumeric characters)
        String partyIdentifierRegex = "\\w{0,34}";
        // Validation regex for numberAddress (up to 34 characters, alphanumeric and symbols)
        String numberAddressRegex = "[\\d\\w\\s,.-]{0,34}";

        boolean isPartyIdentifierValid = field55D.getPartyIdentifier() != null && field55D.getPartyIdentifier().matches(partyIdentifierRegex);
        if (!isPartyIdentifierValid) {
            LOGGER.warning("Invalid Field55D partyIdentifier");
            return false;
        }

        boolean isNumberAddressValid = field55D.getnumberAddress() != null && field55D.getnumberAddress().matches(numberAddressRegex);
        if (!isNumberAddressValid) {
            LOGGER.warning("Invalid Field55D numberAddress");
            return false;
        }

        return true;
    }
}
