package com.backend.domain.services.mtvalidation.Fields.Validators;

import com.backend.domain.entities.mt.fields.Field70Type;

import java.util.*;
import java.util.logging.Logger;

public class Field70Validator {

    private static final Logger LOGGER = Logger.getLogger(Field70Validator.class.getName());

    // Valid Codes
    private static final Set<String> VALID_CODES = new HashSet<>(Arrays.asList(
            "INV", "IPI", "RFB", "ROC", "TSU"
    ));

    /**
     * Validates the entire Field70 structure.
     *
     * @param field70 the Field70Type object containing the narrative lines.
     * @return true if the field is valid, false otherwise.
     */
    public boolean validateField70(Field70Type field70) {
        if (field70 == null) {
            LOGGER.warning("Field70 is null");
            return false;
        }

        List<String> narrativeLines = field70.getNarrativeLine();
        if (narrativeLines == null || narrativeLines.isEmpty()) {
            LOGGER.warning("Narrative lines are empty");
            return false;
        }

        // Validate each narrative line (up to 4 lines)
        for (String narrativeLine : narrativeLines) {
            if (!validateNarrativeLine(narrativeLine)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Validates each individual narrative line.
     *
     * @param narrativeLine the individual narrative line to validate.
     * @return true if the narrative line is valid, false otherwise.
     */
    private boolean validateNarrativeLine(String narrativeLine) {
        if (narrativeLine == null || narrativeLine.isEmpty()) {
            LOGGER.warning("Narrative line is empty");
            return false;
        }

        // Split references by double slash (//) separator
        String[] references = narrativeLine.split("//");

        for (String reference : references) {
            if (!validateReference(reference)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Validates a reference within a narrative line.
     *
     * @param reference the reference within a narrative line.
     * @return true if the reference is valid, false otherwise.
     */
    private boolean validateReference(String reference) {
        if (!reference.startsWith("/")) {
            LOGGER.warning("Reference does not start with a slash (/): " + reference);
            return false;
        }

        // Extract code and value
        String[] parts = reference.split("/", 3);
        if (parts.length < 2) {
            LOGGER.warning("Reference format is invalid: " + reference);
            return false;
        }

        String code = parts[1];
        String value = parts.length == 3 ? parts[2] : "";

        // Validate code
        if (!VALID_CODES.contains(code)) {
            LOGGER.warning("Invalid code: " + code);
            return false;
        }

        // Additional validation based on the specific code
        switch (code) {
            case "INV":
                return validateInvoice(value);
            case "IPI":
                return validateMaxLength(value, 20, "IPI");
            case "RFB":
                return validateMaxLength(value, 16, "RFB");
            case "ROC":
                return !value.isEmpty();
            case "TSU":
                return validateTSU(value);
            default:
                return true;
        }
    }

    private boolean validateInvoice(String value) {
        // Invoice can contain date, reference, and details.
        return !value.isEmpty();
    }

    private boolean validateMaxLength(String value, int maxLength, String code) {
        if (value.length() > maxLength) {
            LOGGER.warning(code + " value exceeds max length: " + value);
            return false;
        }
        return true;
    }

    private boolean validateTSU(String value) {
        // TSU format: /TSU/<TSU ID>/<Invoice Number>/<Amount>
        String[] tsuParts = value.split("/");
        if (tsuParts.length < 3) {
            LOGGER.warning("Invalid TSU format: " + value);
            return false;
        }

        return !tsuParts[0].isEmpty() && !tsuParts[1].isEmpty() && !tsuParts[2].isEmpty();
    }
}
