package com.backend.domain.services.mtvalidation.Fields.Validators;

import com.backend.domain.entities.mt.fields.Field50FType;

import java.util.regex.Pattern;
import java.util.logging.Logger;

public class Field50FValidator {

    private static final Logger LOGGER = Logger.getLogger(Field50FValidator.class.getName());

    public boolean validateField50F(Field50FType field50F) {
        if (field50F == null) {
            LOGGER.warning("Field50F is null");
            return false;
        }

        // Validate the account (optional, up to 35 alphanumeric characters)
        if (field50F.getAccount() != null && !Pattern.matches("\\w{0,35}", field50F.getAccount())) {
            LOGGER.warning("Invalid Field50F account. Must be up to 35 alphanumeric characters.");
            return false;
        }

        // Validate the codePart (optional, 6 alphabetic characters followed by up to 27 alphanumeric characters)
        if (field50F.getCodePart() != null && !Pattern.matches("[A-Za-z]{6}\\w{0,27}", field50F.getCodePart())) {
            LOGGER.warning("Invalid Field50F codePart. Must be 6 alphabetic characters followed by up to 27 alphanumeric characters.");
            return false;
        }

        // Validate the numberAddress (optional, up to 4 occurrences of 34 alphanumeric characters)
        if (field50F.getNumberAddress() != null) {
            String[] addresses = field50F.getNumberAddress().split(",");
            if (addresses.length > 4) {
                LOGGER.warning("Field50F numberAddress can have a maximum of 4 occurrences.");
                return false;
            }
            for (String address : addresses) {
                if (!Pattern.matches("[\\w\\s,]{0,34}", address.trim())) {
                    LOGGER.warning("Invalid Field50F numberAddress. Each occurrence must be up to 34 alphanumeric characters.");
                    return false;
                }
            }
        }

        // If all validations passed
        return true;
    }
}
