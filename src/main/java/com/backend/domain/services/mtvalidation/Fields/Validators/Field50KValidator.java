package com.backend.domain.services.mtvalidation.Fields.Validators;

import com.backend.domain.entities.mt.fields.Field50KType;

import java.util.regex.Pattern;
import java.util.logging.Logger;

public class Field50KValidator {

    private static final Logger LOGGER = Logger.getLogger(Field50KValidator.class.getName());

    public boolean validateField50K(Field50KType field50K) {
        if (field50K == null) {
            LOGGER.warning("Field50K is null");
            return false;
        }

        // Validate the account (optional, up to 35 alphanumeric characters)
        if (field50K.getAccount() != null && !Pattern.matches("\\w{0,35}", field50K.getAccount())) {
            LOGGER.warning("Invalid Field50K account. Must be up to 35 alphanumeric characters.");
            return false;
        }

        // Validate the numberAddress (optional, up to 4 occurrences of 34 alphanumeric characters, including spaces and punctuation)
        if (field50K.getNumberAddress() != null) {
            String[] addresses = field50K.getNumberAddress().split(",");
            if (addresses.length > 4) {
                LOGGER.warning("Field50K numberAddress can have a maximum of 4 occurrences.");
                return false;
            }
            for (String address : addresses) {
                if (!Pattern.matches("[\\w\\s,.-]{0,34}", address.trim())) {
                    LOGGER.warning("Invalid Field50K numberAddress. Each occurrence must be up to 34 alphanumeric characters, including spaces and punctuation.");
                    return false;
                }
            }
        }

        // If all validations passed
        return true;
    }
}
