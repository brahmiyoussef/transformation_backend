package com.backend.domain.services.mtvalidation.Fields.Validators;

import com.backend.domain.entities.mt.fields.Field33BType;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class Field33BValidator {

    private static final Logger LOGGER = Logger.getLogger(Field33BValidator.class.getName());

    // Forbidden currency codes (commodities)
    private static final Set<String> FORBIDDEN_CURRENCY_CODES = new HashSet<>();
    static {
        FORBIDDEN_CURRENCY_CODES.add("XAU");
        FORBIDDEN_CURRENCY_CODES.add("XAG");
        FORBIDDEN_CURRENCY_CODES.add("XPD");
        FORBIDDEN_CURRENCY_CODES.add("XPT");
    }

    public boolean validateField33B(Field33BType field33B) {
        if (field33B == null) {
            LOGGER.warning("Field33B is null");
            return false;
        }

        String currency = field33B.getCurrency();
        String amount = String.valueOf(field33B.getAmount());

        // Validate currency
        if (!validateCurrency(currency)) {
            LOGGER.warning("Invalid or forbidden currency code: " + currency);
            return false;
        }

        // Validate amount
        if (!validateAmount(amount, currency)) {
            LOGGER.warning("Invalid amount: " + amount);
            return false;
        }

        return true;
    }

    private boolean validateCurrency(String currency) {
        if (currency == null || currency.length() != 3) {
            return false;
        }

        try {
            Currency isoCurrency = Currency.getInstance(currency);
            // Check if the currency is forbidden
            return !FORBIDDEN_CURRENCY_CODES.contains(currency);
        } catch (IllegalArgumentException e) {
            LOGGER.warning("Currency parsing failed: " + e.getMessage());
            return false;
        }
    }

    private boolean validateAmount(String amountStr, String currencyCode) {
        if (amountStr == null || !amountStr.contains(",")) {
            return false; // Decimal comma is mandatory
        }

        // Split the amount into integer and fractional parts
        String[] parts = amountStr.split(",");
        if (parts.length != 2 || parts[0].isEmpty() || parts[1].isEmpty()) {
            return false; // Must have both integer and decimal parts
        }

        try {
            BigDecimal amount = new BigDecimal(amountStr.replace(",", "."));
            int fractionDigits = parts[1].length();
            Currency currency = Currency.getInstance(currencyCode);

            // Check that the fractional part does not exceed the currency's fraction digits
            if (fractionDigits > currency.getDefaultFractionDigits()) {
                LOGGER.warning("Invalid number of decimal places for currency: " + currencyCode);
                return false;
            }

            return true;
        } catch (NumberFormatException e) {
            LOGGER.warning("Amount parsing failed: " + e.getMessage());
            return false;
        }
    }
}
