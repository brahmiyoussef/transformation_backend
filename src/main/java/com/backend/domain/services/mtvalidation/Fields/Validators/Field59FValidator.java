package com.backend.domain.services.mtvalidation.Fields.Validators;

import com.backend.domain.entities.mt.fields.Field59FType;

import java.util.logging.Logger;

public class Field59FValidator {

    private static final Logger LOGGER = Logger.getLogger(Field59FValidator.class.getName());

    public boolean validateField59F(Field59FType field59F) {
        if (field59F == null) {
            LOGGER.warning("Field59F is null");
            return false;
        }

        String accountRegex = "\\w{0,35}";
        String numberAddressRegex = "[\\w\\s,.-]{0,34}";

        boolean isAccountValid = field59F.getAccount() != null && field59F.getAccount().matches(accountRegex);
        if (!isAccountValid) {
            LOGGER.warning("Invalid Field59F account");
            return false;
        }

        boolean isNumberAddressValid = field59F.getNumberAddress() != null && field59F.getNumberAddress().matches(numberAddressRegex);
        if (!isNumberAddressValid) {
            LOGGER.warning("Invalid Field59F numberAddress");
            return false;
        }

        return true;
    }
}
