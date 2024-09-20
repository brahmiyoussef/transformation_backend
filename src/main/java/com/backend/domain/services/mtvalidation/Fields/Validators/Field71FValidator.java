package com.backend.domain.services.mtvalidation.Fields.Validators;

import com.backend.domain.entities.mt.fields.Field71FType;

import java.math.BigDecimal;
import java.util.*;
import java.util.logging.Logger;
import java.util.regex.Pattern;
public class Field71FValidator {

    private static final Logger LOGGER = Logger.getLogger(Field71FValidator.class.getName());

    // Regex pattern to validate amount format (integer part must have at least one digit, followed by a comma and decimal digits)
    private static final Pattern AMOUNT_PATTERN = Pattern.compile("\\d+,\\d{1,3}");

    // Example list of valid ISO 4217 currency codes (for simplicity, we'll list just a few, but it should cover all)
    private static final Set<String> VALID_CURRENCIES = new HashSet<>(Arrays.asList("EUR", "USD", "GBP", "JPY", "CHF"));

    /**
     * Validates a single Field71FType object.
     *
     * @param field71F Field71FType object.
     * @return true if the field is valid, false otherwise.
     */
    public boolean validateField71F(Field71FType field71F) {
        if (field71F == null) {
            LOGGER.warning("Field71F is null");
            return false;
        }

        // Validate currency and amount
        return validateCurrency(field71F.getCurrency()) && validateAmount(field71F.getAmount().toPlainString());
    }

    private boolean validateCurrency(String currency) {
        if (currency == null || currency.isEmpty()) {
            LOGGER.warning("Currency is null or empty");
            return false;
        }

        if (!VALID_CURRENCIES.contains(currency)) {
            LOGGER.warning("Invalid currency code: " + currency);
            return false;
        }

        return true;
    }

    private boolean validateAmount(String amount) {
        if (amount == null || amount.isEmpty()) {
            LOGGER.warning("Amount is null or empty");
            return false;
        }

        // Validate format: at least one digit before the comma and up to three decimal digits after
        if (!AMOUNT_PATTERN.matcher(amount).matches()) {
            LOGGER.warning("Invalid amount format: " + amount);
            return false;
        }

        try {
            BigDecimal decimalAmount = new BigDecimal(amount.replace(",", "."));
            if (decimalAmount.scale() > 2) {
                LOGGER.warning("Amount exceeds allowed number of decimal places: " + amount);
                return false;
            }
        } catch (NumberFormatException e) {
            LOGGER.warning("Amount is not a valid number: " + amount);
            return false;
        }

        return true;
    }

}
