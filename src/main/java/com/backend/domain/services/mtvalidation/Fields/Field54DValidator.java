package com.backend.domain.services.mtvalidation.Fields;

import com.backend.domain.entities.mt.fields.Field54DType;

import java.util.logging.Logger;
import java.util.regex.Pattern;

public class Field54DValidator {

    private static final Logger LOGGER = Logger.getLogger(Field54DValidator.class.getName());

    public boolean validateField54D(Field54DType field54D) {
        if (field54D == null) {
            LOGGER.warning("Field54D is null");
            return false;
        }

        // Validation regex for partyIdentifier (up to 34 alphanumeric characters)
        String partyIdentifierRegex = "\\w{0,34}";
        // Validation regex for numberAddress (up to 34 characters, alphanumeric and symbols)
        String numberAddressRegex = "[\\d\\w\\s,.-]{0,34}";

        boolean isPartyIdentifierValid = field54D.getPartyIdentifier() != null && field54D.getPartyIdentifier().matches(partyIdentifierRegex);
        if (!isPartyIdentifierValid) {
            LOGGER.warning("Invalid Field54D partyIdentifier");
            return false;
        }

        boolean isNumberAddressValid = field54D.getnumberAddress() != null && field54D.getnumberAddress().matches(numberAddressRegex);
        if (!isNumberAddressValid) {
            LOGGER.warning("Invalid Field54D numberAddress");
            return false;
        }

        return true;
    }
}
