package com.backend.domain.services.mtvalidation.Fields;

import com.backend.domain.entities.mt.fields.Field59AType;

import java.util.logging.Logger;

public class Field59AValidator {

    private static final Logger LOGGER = Logger.getLogger(Field59AValidator.class.getName());

    public boolean validateField59A(Field59AType field59A) {
        if (field59A == null) {
            LOGGER.warning("Field59A is null");
            return false;
        }

        String accountRegex = "\\w{0,34}";
        String identifierCodeRegex = "[A-Z]{0,11}";

        boolean isAccountValid = field59A.getAccount() == null || field59A.getAccount().matches(accountRegex);
        if (!isAccountValid) {
            LOGGER.warning("Invalid Field59A account");
            return false;
        }

        boolean isIdentifierCodeValid = field59A.getIdentifierCode() != null && field59A.getIdentifierCode().matches(identifierCodeRegex);
        if (!isIdentifierCodeValid) {
            LOGGER.warning("Invalid Field59A identifierCode");
            return false;
        }

        return true;
    }
}
