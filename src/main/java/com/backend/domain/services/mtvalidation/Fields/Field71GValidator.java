package com.backend.domain.services.mtvalidation.Fields;

import com.backend.domain.entities.mt.fields.Field71GType;

import java.util.logging.Logger;

public class Field71GValidator {

    private static final Logger LOGGER = Logger.getLogger(Field71GValidator.class.getName());

    public boolean validateField71G(Field71GType field71G) {
        if (field71G == null) {
            LOGGER.warning("Field71G is null");
            return false;
        }

        String currencyRegex = "\\w{3}";  // Example: USD, EUR, JPY
        String amountRegex = "\\d{1,15}";  // Up to 15 digits for amount

        boolean isCurrencyValid = field71G.getCurrency() != null && field71G.getCurrency().matches(currencyRegex);
        boolean isAmountValid = field71G.getAmount() != null && field71G.getAmount().toString().matches(amountRegex);

        if (!isCurrencyValid) {
            LOGGER.warning("Invalid currency in Field71G");
            return false;
        }

        if (!isAmountValid) {
            LOGGER.warning("Invalid amount in Field71G");
            return false;
        }

        return true;
    }
}
