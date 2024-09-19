package com.backend.domain.services.mtvalidation.Fields;

import com.backend.domain.entities.mt.fields.Field23EType;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class Field23EValidator {

    private static final Logger LOGGER = Logger.getLogger(Field23EValidator.class.getName());

    // Valid Instruction Codes
    private static final Set<String> VALID_CODES = new HashSet<>(Arrays.asList(
            "CHQB", "CORT", "HOLD", "INTC", "PHOB", "PHOI", "PHON", "REPA", "SDVA", "TELB", "TELE", "TELI"
    ));

    // Codes that allow additional information
    private static final Set<String> ALLOW_ADDITIONAL_INFO = new HashSet<>(Arrays.asList(
            "PHON", "PHOB", "PHOI", "TELE", "TELB", "TELI", "HOLD", "REPA"
    ));

    // Forbidden combinations
    private static final Set<String> FORBIDDEN_COMBINATIONS = new HashSet<>(Arrays.asList(
            "SDVA_HOLD", "SDVA_CHQB", "INTC_HOLD", "INTC_CHQB", "REPA_HOLD", "REPA_CHQB", "REPA_CORT",
            "CORT_HOLD", "CORT_CHQB", "HOLD_CHQB", "PHOB_TELB", "PHON_TELE", "PHOI_TELI"
    ));

    public boolean validateField23E(Field23EType field23E) {
        if (field23E == null) {
            LOGGER.warning("Field23E is null");
            return false;
        }

        String instructionCode = field23E.getInstructionCode();
        String additionalInformation = field23E.getAdditionalInformation();

        // Validate Instruction Code
        if (!VALID_CODES.contains(instructionCode)) {
            LOGGER.warning("Invalid Instruction Code: " + instructionCode);
            return false;
        }

        // Validate Additional Information
        if (additionalInformation != null && !additionalInformation.isEmpty() && !ALLOW_ADDITIONAL_INFO.contains(instructionCode)) {
            LOGGER.warning("Additional Information not allowed for Instruction Code: " + instructionCode);
            return false;
        }

        return true;
    }

    public boolean validateCombination(Field23EType... fields) {
        if (fields == null || fields.length == 0) {
            LOGGER.warning("No fields provided for combination validation");
            return false;
        }

        Set<String> codes = new HashSet<>();
        for (Field23EType field : fields) {
            if (field != null) {
                codes.add(field.getInstructionCode());
            }
        }

        // Check forbidden combinations
        for (String combination : FORBIDDEN_COMBINATIONS) {
            String[] forbidden = combination.split("_");
            if (codes.contains(forbidden[0]) && codes.contains(forbidden[1])) {
                LOGGER.warning("Invalid combination: " + forbidden[0] + " with " + forbidden[1]);
                return false;
            }
        }

        return true;
    }
}
