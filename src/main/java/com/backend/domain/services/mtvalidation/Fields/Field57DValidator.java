package com.backend.domain.services.mtvalidation.Fields;

import com.backend.domain.entities.mt.fields.Field57DType;

import java.util.logging.Logger;

public class Field57DValidator {

    private static final Logger LOGGER = Logger.getLogger(Field57DValidator.class.getName());

    public boolean validateField57D(Field57DType field57D) {
        if (field57D == null) {
            LOGGER.warning("Field57D is null");
            return false;
        }

        String partyIdentifierRegex = "\\w{0,34}";
        String numberAddressRegex = "[\\w\\s,.-]{0,34}";

        boolean isPartyIdentifierValid = field57D.getPartyIdentifier() == null || field57D.getPartyIdentifier().matches(partyIdentifierRegex);
        if (!isPartyIdentifierValid) {
            LOGGER.warning("Invalid Field57D partyIdentifier");
        }

        boolean isNumberAddressValid = true;
        if (field57D.getnumberAddress() != null) {
            String[] addresses = field57D.getnumberAddress().split("\n");
            if (addresses.length > 4) {
                LOGGER.warning("Invalid Field57D numberAddress: more than 4 lines");
                isNumberAddressValid = false;
            } else {
                for (String address : addresses) {
                    if (!address.matches(numberAddressRegex)) {
                        LOGGER.warning("Invalid Field57D numberAddress line");
                        isNumberAddressValid = false;
                        break;
                    }
                }
            }
        }

        return isPartyIdentifierValid && isNumberAddressValid;
    }
}
