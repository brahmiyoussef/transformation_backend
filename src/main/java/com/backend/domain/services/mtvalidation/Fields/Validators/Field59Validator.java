package com.backend.domain.services.mtvalidation.Fields.Validators;

import com.backend.domain.entities.mt.fields.Field59Type;

import java.util.logging.Logger;

public class Field59Validator {

    private static final Logger LOGGER = Logger.getLogger(Field59Validator.class.getName());

    public boolean validateField59(Field59Type field59) {
        if (field59 == null) {
            LOGGER.warning("Field59 is null");
            return false;
        }

        String accountRegex = "\\w{0,35}";
        String numberAddressRegex = "[\\w\\s,.-]{0,34}";

        boolean isAccountValid = field59.getAccount() != null && field59.getAccount().matches(accountRegex);
        if (!isAccountValid) {
            LOGGER.warning("Invalid Field59 account");
            return false;
        }

        boolean isNumberAddressValid = field59.getNumberAddress() != null && field59.getNumberAddress().matches(numberAddressRegex);
        if (!isNumberAddressValid) {
            LOGGER.warning("Invalid Field59 numberAddress");
            return false;
        }

        return true;
    }
}
