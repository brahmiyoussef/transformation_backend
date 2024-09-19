package com.backend.domain.services.mtvalidation.Fields;

import com.backend.domain.entities.mt.fields.Field32AType;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class Field32AValidator {

    private static final Logger LOGGER = Logger.getLogger(Field32AValidator.class.getName());

    // Forbidden currency codes (commodities)
    private static final Set<String> FORBIDDEN_CURRENCY_CODES = new HashSet<>();
    static {
        FORBIDDEN_CURRENCY_CODES.add("XAU");
        FORBIDDEN_CURRENCY_CODES.add("XAG");
        FORBIDDEN_CURRENCY_CODES.add("XPD");
        FORBIDDEN_CURRENCY_CODES.add("XPT");
    }

    // Date format
    private static final String DATE_FORMAT = "yyMMdd";

    public boolean validateField32A(Field32AType field32A) {
        if (field32A == null) {
            LOGGER.warning("Field32A is null");
            return false;
        }

        String valueDate = field32A.getDate();
        String currency = field32A.getCurrency();
        String amount = field32A.getAmount();

        // Validate date
        if (!validateDate(valueDate)) {
            LOGGER.warning("Invalid date: " + valueDate);
            return false;
        }

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

    private boolean validateDate(String date) {
        if (date == null || date.length() != 6) {
            return false;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        sdf.setLenient(false);
        try {
            sdf.parse(date);
            return true;
        } catch (ParseException e) {
            LOGGER.warning("Date parsing failed: " + e.getMessage());
            return false;
        }
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
