package com.backend.domain.services.mtvalidation.Fields;

import com.backend.domain.entities.mt.blocks.Block4;
import com.backend.domain.entities.mt.fields.*;


import java.util.logging.Logger;
import java.util.regex.Pattern;

public class Block4FieldsValidation {

    private final Field13CValidator field13CValidator;
    private final Field23EValidator field23ECValidator;
    private final Field32AValidator field32AValidator;
    private final Field33BValidator field33BValidator;
    private final Field70Validator field70Validator;
    private final Field71FValidator field71FValidator;



    private static final Logger LOGGER = Logger.getLogger(Block4FieldsValidation.class.getName());

    public Block4FieldsValidation() {
        this.field13CValidator = new Field13CValidator();
        this.field23ECValidator = new Field23EValidator();
        this.field32AValidator = new Field32AValidator();
        this.field33BValidator = new Field33BValidator();
        this.field70Validator = new Field70Validator();
        this.field71FValidator = new Field71FValidator();
    }

    public boolean validateBlock4Field13C(Field13CType field13C) {
        return field13CValidator.validateField13C(field13C);
    }

    public boolean validateBlock4Field23E(Field23EType field23E) {
        return field23ECValidator.validateField23E(field23E);
    }

    public boolean validateBlock4Field32A(Field32AType field32A) {
        return field32AValidator.validateField32A(field32A);
    }

    public boolean validateBlock4Field33B(Field33BType field33B){
        return field33BValidator.validateField33B(field33B);
    }

    public boolean validateBlock4Field70(Field70Type field70){
        return field70Validator.validateField70(field70);
    }

    public boolean validateBlock4Field71F(Field71FType field71){
        return field71FValidator.validateField71F(field71);
    }

    public boolean validateAllBlock4Fields(Block4 block4) {
        boolean isValid = true;
        StringBuilder errorMessages = new StringBuilder();

        // Validate each field
        if (block4.getField13C() != null && !validateBlock4Field13C(block4.getField13C())) {
            isValid = false;
            errorMessages.append("Field 13C is invalid. ");
        }

        if (block4.getField23E() != null && !validateBlock4Field23E(block4.getField23E())) {
            isValid = false;
            errorMessages.append("Field 23E is invalid. ");
        }

        if (block4.getField32A() != null && !validateBlock4Field32A(block4.getField32A())) {
            isValid = false;
            errorMessages.append("Field 32A is invalid. ");
        }

        if (block4.getField33B() != null && !validateBlock4Field33B(block4.getField33B())) {
            isValid = false;
            errorMessages.append("Field 33B is invalid. ");
        }

        if (block4.getField50A() != null && !validateField50A(block4.getField50A())) {
            isValid = false;
            errorMessages.append("Field 50A is invalid. ");
        }

        if (block4.getField50F() != null && !validateField50F(block4.getField50F())) {
            isValid = false;
            errorMessages.append("Field 50F is invalid. ");
        }

        if (block4.getField50K() != null && !validateField50K(block4.getField50K())) {
            isValid = false;
            errorMessages.append("Field 50K is invalid. ");
        }

        if (block4.getField51A() != null && !validateField51A(block4.getField51A())) {
            isValid = false;
            errorMessages.append("Field 51A is invalid. ");
        }

        if (block4.getField52A() != null && !validateField52A(block4.getField52A())) {
            isValid = false;
            errorMessages.append("Field 52A is invalid. ");
        }

        if (block4.getField52D() != null && !validateField52D(block4.getField52D())) {
            isValid = false;
            errorMessages.append("Field 52D is invalid. ");
        }

        if (block4.getField53A() != null && !validateField53A(block4.getField53A())) {
            isValid = false;
            errorMessages.append("Field 53A is invalid. ");
        }

        if (block4.getField53B() != null && !validateField53A(block4.getField53B())) {
            isValid = false;
            errorMessages.append("Field 53B is invalid. ");
        }

        if (block4.getField53D() != null && !validateField53A(block4.getField53D())) {
            isValid = false;
            errorMessages.append("Field 53D is invalid. ");
        }

        if (block4.getField54A() != null && !validateField54A(block4.getField54A())) {
            isValid = false;
            errorMessages.append("Field 54A is invalid. ");
        }

        if (block4.getField54B() != null && !validateField54A(block4.getField54B())) {
            isValid = false;
            errorMessages.append("Field 54B is invalid. ");
        }

        if (block4.getField54D() != null && !validateField54A(block4.getField54D())) {
            isValid = false;
            errorMessages.append("Field 54D is invalid. ");
        }

        if (block4.getField55A() != null && !validateField55A(block4.getField55A())) {
            isValid = false;
            errorMessages.append("Field 55A is invalid. ");
        }

        if (block4.getField55B() != null && !validateField55A(block4.getField55B())) {
            isValid = false;
            errorMessages.append("Field 55B is invalid. ");
        }

        if (block4.getField55D() != null && !validateField55A(block4.getField55D())) {
            isValid = false;
            errorMessages.append("Field 55D is invalid. ");
        }

        if (block4.getField56A() != null && !validateField56A(block4.getField56A())) {
            isValid = false;
            errorMessages.append("Field 56A is invalid. ");
        }

        if (block4.getField56C() != null && !validateField56C(block4.getField56C())) {
            isValid = false;
            errorMessages.append("Field 56C is invalid. ");
        }

        if (block4.getField56D() != null && !validateField56D(block4.getField56D())) {
            isValid = false;
            errorMessages.append("Field 56D is invalid. ");
        }

        if (block4.getField57A() != null && !validateField57A(block4.getField57A())) {
            isValid = false;
            errorMessages.append("Field 57A is invalid. ");
        }

        if (block4.getField57B() != null && !validateField57B(block4.getField57B())) {
            isValid = false;
            errorMessages.append("Field 57B is invalid. ");
        }

        if (block4.getField57C() != null && !validateField57C(block4.getField57C())) {
            isValid = false;
            errorMessages.append("Field 57C is invalid. ");
        }

        if (block4.getField57D() != null && !validateField57D(block4.getField57D())) {
            isValid = false;
            errorMessages.append("Field 57D is invalid. ");
        }

        if (block4.getField59A() != null && !validateField59A(block4.getField59A())) {
            isValid = false;
            errorMessages.append("Field 59A is invalid. ");
        }

        if (block4.getField59F() != null && !validateField59F(block4.getField59F())) {
            isValid = false;
            errorMessages.append("Field 59F is invalid. ");
        }

        if (block4.getField59() != null && !validateField59(block4.getField59())) {
            isValid = false;
            errorMessages.append("Field 59 is invalid. ");
        }

        if (block4.getField70() != null && !validateBlock4Field70(block4.getField70())) {
            isValid = false;
            errorMessages.append("Field 70 is invalid. ");
        }

        if (block4.getField71F() != null && !validateBlock4Field71F(block4.getField71F())) {
            isValid = false;
            errorMessages.append("Field 71F is invalid. ");
        }

        if (block4.getField71G() != null && !validateField71G(block4.getField71G())) {
            isValid = false;
            errorMessages.append("Field 71G is invalid. ");
        }

        if (block4.getField72() != null && !validateField72(block4.getField72())) {
            isValid = false;
            errorMessages.append("Field 72 is invalid. ");
        }

        if (block4.getField77B() != null && !validateField77B(block4.getField77B())) {
            isValid = false;
            errorMessages.append("Field 77B is invalid. ");
        }

        if (!isValid) {
            LOGGER.warning("Block 4 validation failed: " + errorMessages.toString());
        }

        return isValid;
    }

    //////////////////////////////////////:





    public boolean validateField50A(Field50AType field50A) {
        if (field50A == null) {
            LOGGER.warning("Field50A is null");
            return false;
        }

        // Validate account (optional, can be null or have up to 34 alphanumeric characters)
        if (field50A.getAccount() != null && !Pattern.matches("\\w{0,34}", field50A.getAccount())) {
            LOGGER.warning("Invalid Field50A account (must be up to 34 alphanumeric characters)");
            return false;
        }

        // Validate identifierCode (required, must be between 0 and 11 uppercase letters)
        if (field50A.getIdentifierCode() == null || !Pattern.matches("[A-Z]{0,11}", field50A.getIdentifierCode())) {
            LOGGER.warning("Invalid Field50A identifierCode (must be up to 11 uppercase letters)");
            return false;
        }

        // If all validations passed
        return true;
    }

    public boolean validateField50F(Field50FType field50F) {
        if (field50F == null) {
            LOGGER.warning("Field50F is null");
            return false;
        }

        // Validate account (optional, up to 35 alphanumeric characters)
        if (field50F.getAccount() != null && !Pattern.matches("\\w{0,35}", field50F.getAccount())) {
            LOGGER.warning("Invalid Field50F account (must be up to 35 alphanumeric characters)");
            return false;
        }

        // Validate codePart (optional, 6 alphabetic characters followed by up to 27 alphanumeric characters)
        if (field50F.getCodePart() != null && !Pattern.matches("[A-Za-z]{6}\\w{0,27}", field50F.getCodePart())) {
            LOGGER.warning("Invalid Field50F codePart (must be 6 alphabetic characters followed by up to 27 alphanumeric characters)");
            return false;
        }

        // Validate numberAddress (optional, up to 4 occurrences of 34 alphanumeric characters)
        if (field50F.getNumberAddress() != null) {
            String[] addresses = field50F.getNumberAddress().split(",");
            if (addresses.length > 4) {
                LOGGER.warning("Field50F numberAddress can have a maximum of 4 occurrences");
                return false;
            }
            for (String address : addresses) {
                if (!Pattern.matches("[\\w\\s,]{0,34}", address.trim())) {
                    LOGGER.warning("Invalid Field50F numberAddress (must be up to 34 alphanumeric characters)");
                    return false;
                }
            }
        }

        return true;
    }

    public boolean validateField50K(Field50KType field50K) {
        if (field50K == null) {
            LOGGER.warning("Field50K is null");
            return false;
        }

        // Validate account (optional, up to 35 alphanumeric characters)
        if (field50K.getAccount() != null && !Pattern.matches("\\w{0,35}", field50K.getAccount())) {
            LOGGER.warning("Invalid Field50K account (must be up to 35 alphanumeric characters)");
            return false;
        }

        // Validate numberAddress (optional, up to 4 occurrences of 34 alphanumeric characters, including spaces and punctuation)
        if (field50K.getNumberAddress() != null) {
            String[] addresses = field50K.getNumberAddress().split(",");
            if (addresses.length > 4) {
                LOGGER.warning("Field50K numberAddress can have a maximum of 4 occurrences");
                return false;
            }
            for (String address : addresses) {
                if (!Pattern.matches("[\\w\\s,.-]{0,34}", address.trim())) {
                    LOGGER.warning("Invalid Field50K numberAddress (must be up to 34 alphanumeric characters, including spaces and punctuation)");
                    return false;
                }
            }
        }

        return true;
    }

    public boolean validateField51A(Field51AType field51A) {
        if (field51A == null) {
            LOGGER.warning("Field51A is null");
            return false;
        }

        // Validate partyIdentifier (optional, up to 34 alphanumeric characters)
        if (field51A.getPartyIdentifier() != null && !Pattern.matches("\\w{0,34}", field51A.getPartyIdentifier())) {
            LOGGER.warning("Invalid Field51A partyIdentifier (must be up to 34 alphanumeric characters)");
            return false;
        }

        // Validate identifierCode (required, up to 11 uppercase letters)
        if (!Pattern.matches("[A-Z]{0,11}", field51A.getIdentifierCode())) {
            LOGGER.warning("Invalid Field51A identifierCode (must be up to 11 uppercase letters)");
            return false;
        }

        return true;
    }

    public boolean validateField52A(Field52AType field52A) {
        if (field52A == null) {
            LOGGER.warning("Field52A is null");
            return false;
        }

        // Validate partyIdentifier (optional, up to 34 alphanumeric characters)
        if (field52A.getPartyIdentifier() != null && !Pattern.matches("\\w{0,34}", field52A.getPartyIdentifier())) {
            LOGGER.warning("Invalid Field52A partyIdentifier (must be up to 34 alphanumeric characters)");
            return false;
        }

        // Validate identifierCode (required, up to 11 uppercase letters)
        if (!Pattern.matches("[A-Z]{0,11}", field52A.getIdentifierCode())) {
            LOGGER.warning("Invalid Field52A identifierCode (must be up to 11 uppercase letters)");
            return false;
        }

        return true;
    }

    public boolean validateField52D(Field52DType field52D) {
        if (field52D == null) {
            LOGGER.warning("Field52D is null");
            return false;
        }

        // Validate partyIdentifier (optional, up to 34 alphanumeric characters)
        if (field52D.getPartyIdentifier() != null && !Pattern.matches("\\w{0,34}", field52D.getPartyIdentifier())) {
            LOGGER.warning("Invalid Field52D partyIdentifier (must be up to 34 alphanumeric characters)");
            return false;
        }

        // Validate numberAddress (optional, up to 34 alphanumeric characters and spaces)
        if (field52D.getNumberAddress() != null && !Pattern.matches("[\\w\\s,.-]{0,34}", field52D.getNumberAddress())) {
            LOGGER.warning("Invalid Field52D numberAddress (must be up to 34 alphanumeric characters and spaces)");
            return false;
        }

        return true;
    }

    public boolean validateField53A(Field53AType field53A) {
        if (field53A == null) {
            LOGGER.warning("Field53A is null");
            return false;
        }

        // Validate partyIdentifier (optional, up to 34 alphanumeric characters)
        if (field53A.getPartyIdentifier() != null && !Pattern.matches("\\w{0,34}", field53A.getPartyIdentifier())) {
            LOGGER.warning("Invalid Field53A partyIdentifier (must be up to 34 alphanumeric characters)");
            return false;
        }

        // Validate identifierCode (required, alphanumeric with a length of up to 11 characters)
        if (!Pattern.matches("[A-Z0-9]{1,11}", field53A.getIdentifierCode())) {
            LOGGER.warning("Invalid Field53A identifierCode (must be up to 11 alphanumeric characters)");
            return false;
        }

        return true;
    }

    public boolean validateField53B(Field53BType field53B) {
        if (field53B == null) {
            LOGGER.warning("Field53B is null");
            return false;
        }

        // Validate partyIdentifier (optional, up to 34 alphanumeric characters)
        if (field53B.getPartyIdentifier() != null && !Pattern.matches("\\w{0,34}", field53B.getPartyIdentifier())) {
            LOGGER.warning("Invalid Field53B partyIdentifier (must be up to 34 alphanumeric characters)");
            return false;
        }

        // Validate location (optional, up to 35 characters)
        if (field53B.getLocation() != null && !Pattern.matches("[\\w\\s,.-]{0,35}", field53B.getLocation())) {
            LOGGER.warning("Invalid Field53B location (must be up to 35 characters with letters, digits, spaces, commas, periods, and hyphens)");
            return false;
        }

        return true;
    }

    public boolean validateField53D(Field53DType field53D) {
        if (field53D == null) {
            LOGGER.warning("Field53D is null");
            return false;
        }

        // Validate partyIdentifier (optional, up to 34 alphanumeric characters)
        if (field53D.getPartyIdentifier() != null && !Pattern.matches("\\w{0,34}", field53D.getPartyIdentifier())) {
            LOGGER.warning("Invalid Field53D partyIdentifier (must be up to 34 alphanumeric characters)");
            return false;
        }

        // Validate numberAddress (optional, up to 34 characters)
        if (field53D.getnumberAddress() != null && !Pattern.matches("[\\w\\s,.-]{0,34}", field53D.getnumberAddress())) {
            LOGGER.warning("Invalid Field53D numberAddress (must be up to 34 characters with letters, digits, spaces, commas, periods, and hyphens)");
            return false;
        }

        return true;
    }

    public boolean validateField54A(Field54AType field54A) {
        // Validation regex for partyIdentifier (up to 34 alphanumeric characters)
        String partyIdentifierRegex = "\\w{0,34}";
        // Validation regex for identifierCode (up to 11 uppercase letters)
        String identifierCodeRegex = "[A-Z]{0,11}";

        boolean isPartyIdentifierValid = field54A.getPartyIdentifier() != null && field54A.getPartyIdentifier().matches(partyIdentifierRegex);
        boolean isIdentifierCodeValid = field54A.getIdentifierCode() != null && field54A.getIdentifierCode().matches(identifierCodeRegex);

        return isPartyIdentifierValid && isIdentifierCodeValid;
    }

    public boolean validateField54B(Field54BType field54B) {
        // Validation regex for partyIdentifier (up to 34 alphanumeric characters)
        String partyIdentifierRegex = "\\w{0,34}";
        // Validation regex for location (up to 35 alphanumeric characters and allowed symbols)
        String locationRegex = "[\\w\\s,.-]{0,35}";

        boolean isPartyIdentifierValid = field54B.getPartyIdentifier() != null && field54B.getPartyIdentifier().matches(partyIdentifierRegex);
        boolean isLocationValid = field54B.getLocation() != null && field54B.getLocation().matches(locationRegex);

        return isPartyIdentifierValid && isLocationValid;
    }

    public boolean validateField54D(Field54DType field54D) {
        // Validation regex for partyIdentifier (up to 34 alphanumeric characters)
        String partyIdentifierRegex = "\\w{0,34}";
        // Validation regex for numberAddress (up to 34 alphanumeric characters and allowed symbols)
        String numberAddressRegex = "[\\d\\w\\s,.-]{0,34}";

        boolean isPartyIdentifierValid = field54D.getPartyIdentifier() != null && field54D.getPartyIdentifier().matches(partyIdentifierRegex);
        boolean isNumberAddressValid = field54D.getnumberAddress() != null && field54D.getnumberAddress().matches(numberAddressRegex);

        return isPartyIdentifierValid && isNumberAddressValid;
    }

    public boolean validateField55A(Field55AType field55A) {
        // Validation regex for partyIdentifier (up to 34 alphanumeric characters)
        String partyIdentifierRegex = "\\w{0,34}";
        // Validation regex for identifierCode (up to 11 uppercase letters)
        String identifierCodeRegex = "[A-Z]{0,11}";

        // Validate partyIdentifier
        boolean isPartyIdentifierValid = field55A.getPartyIdentifier() != null && field55A.getPartyIdentifier().matches(partyIdentifierRegex);
        // Validate identifierCode
        boolean isIdentifierCodeValid = field55A.getIdentifierCode() != null && field55A.getIdentifierCode().matches(identifierCodeRegex);

        // Return true if both are valid
        return isPartyIdentifierValid && isIdentifierCodeValid;
    }

    public boolean validateField55B(Field55BType field55B) {
        // Validation regex for partyIdentifier (up to 34 alphanumeric characters)
        String partyIdentifierRegex = "\\w{0,34}";
        // Validation regex for location (alphanumeric and punctuation, up to 35 characters)
        String locationRegex = "[\\d\\w\\s,.-]{0,35}";

        // Validate partyIdentifier
        boolean isPartyIdentifierValid = field55B.getPartyIdentifier() != null && field55B.getPartyIdentifier().matches(partyIdentifierRegex);
        // Validate location
        boolean isLocationValid = field55B.getLocation() != null && field55B.getLocation().matches(locationRegex);

        // Return true if both are valid
        return isPartyIdentifierValid && isLocationValid;
    }

    public boolean validateField55D(Field55DType field55D) {
        String partyIdentifierRegex = "\\w{0,34}";
        String numberAddressRegex = "[\\d\\w\\s,.-]{0,34}";

        boolean isPartyIdentifierValid = field55D.getPartyIdentifier() != null && field55D.getPartyIdentifier().matches(partyIdentifierRegex);
        boolean isNumberAddressValid = field55D.getnumberAddress() != null && field55D.getnumberAddress().matches(numberAddressRegex);

        return isPartyIdentifierValid && isNumberAddressValid;
    }

    public boolean validateField56A(Field56AType field56A) {
        String partyIdentifierRegex = "\\w{0,34}";
        String identifierCodeRegex = "[A-Z]{0,11}";

        boolean isPartyIdentifierValid = field56A.getPartyIdentifier() != null && field56A.getPartyIdentifier().matches(partyIdentifierRegex);
        boolean isIdentifierCodeValid = field56A.getIdentifierCode() != null && field56A.getIdentifierCode().matches(identifierCodeRegex);

        return isPartyIdentifierValid && isIdentifierCodeValid;
    }

    public boolean validateField56C(String field56C) {
        if (field56C == null) {
            return false;
        }

        // Field 56C should contain a valid BIC (Bank Identifier Code)
        // BIC format: 8 or 11 characters, only letters and numbers
        String bicRegex = "^[A-Z]{6}[A-Z2-9][A-NP-Z0-9]([A-Z0-9]{3})?$";
        return field56C.matches(bicRegex);
    }


    public boolean validateField56D(Field56DType field56D) {
        String partyIdentifierRegex = "\\w{0,34}";
        String numberAddressRegex = "[\\d\\w\\s,.-]{0,34}";

        boolean isPartyIdentifierValid = field56D.getPartyIdentifier() != null && field56D.getPartyIdentifier().matches(partyIdentifierRegex);
        boolean isNumberAddressValid = field56D.getnumberAddress() != null && field56D.getnumberAddress().matches(numberAddressRegex);

        return isPartyIdentifierValid && isNumberAddressValid;
    }

    public boolean validateField57A(Field57AType field57A) {
        String partyIdentifierRegex = "\\w{0,34}";
        String identifierCodeRegex = "[A-Z]{0,11}";

        boolean isPartyIdentifierValid = field57A.getPartyIdentifier() == null || field57A.getPartyIdentifier().matches(partyIdentifierRegex);
        boolean isIdentifierCodeValid = field57A.getIdentifierCode() != null && field57A.getIdentifierCode().matches(identifierCodeRegex);

        return isPartyIdentifierValid && isIdentifierCodeValid;
    }

    public boolean validateField57B(Field57BType field57B) {
        String partyIdentifierRegex = "\\w{0,34}";
        String locationRegex = "[\\d\\w\\s,.-]{0,34}";

        boolean isPartyIdentifierValid = field57B.getPartyIdentifier() == null || field57B.getPartyIdentifier().matches(partyIdentifierRegex);
        boolean isLocationValid = field57B.getLocation() == null || field57B.getLocation().matches(locationRegex);

        return isPartyIdentifierValid && isLocationValid;
    }

    public boolean validateField57C(String field57C) {
        if (field57C == null || field57C.isEmpty()) {
            return false;
        }

        // Field 57C typically contains a party identifier
        // Let's assume it should be alphanumeric and up to 34 characters
        String partyIdentifierRegex = "^[A-Za-z0-9]{1,34}$";
        return field57C.matches(partyIdentifierRegex);
    }

    public boolean validateField57D(Field57DType field57D) {
        if (field57D == null) {
            return false;
        }

        String partyIdentifierRegex = "\\w{0,34}";
        String numberAddressRegex = "[\\w\\s,.-]{0,34}";

        boolean isPartyIdentifierValid = field57D.getPartyIdentifier() == null ||
                field57D.getPartyIdentifier().matches(partyIdentifierRegex);

        boolean isNumberAddressValid = true;
        if (field57D.getnumberAddress() != null) {
            String[] addresses = field57D.getnumberAddress().split("\n");
            if (addresses.length > 4) {
                isNumberAddressValid = false;
            } else {
                for (String address : addresses) {
                    if (!address.matches(numberAddressRegex)) {
                        isNumberAddressValid = false;
                        break;
                    }
                }
            }
        }

        return isPartyIdentifierValid && isNumberAddressValid;
    }

    public boolean validateField59A(Field59AType field59A) {
        String accountRegex = "\\w{0,34}";
        String identifierCodeRegex = "[A-Z]{0,11}";

        boolean isAccountValid = field59A.getAccount() == null || field59A.getAccount().matches(accountRegex);
        boolean isIdentifierCodeValid = field59A.getIdentifierCode() != null && field59A.getIdentifierCode().matches(identifierCodeRegex);

        return isAccountValid && isIdentifierCodeValid;
    }

    public boolean validateField59F(Field59FType field59F) {
        String accountRegex = "\\w{0,35}";
        String numberAddressRegex = "[\\w\\s,.-]{0,34}";

        boolean isAccountValid = field59F.getAccount() != null && field59F.getAccount().matches(accountRegex);
        boolean isNumberAddressValid = field59F.getNumberAddress() != null && field59F.getNumberAddress().matches(numberAddressRegex);

        return isAccountValid && isNumberAddressValid;
    }

    public boolean validateField59(Field59Type field59) {
        String accountRegex = "\\w{0,35}";
        String numberAddressRegex = "[\\w\\s,.-]{0,34}";

        boolean isAccountValid = field59.getAccount() != null && field59.getAccount().matches(accountRegex);
        boolean isNumberAddressValid = field59.getNumberAddress() != null && field59.getNumberAddress().matches(numberAddressRegex);

        return isAccountValid && isNumberAddressValid;
    }





    public boolean validateField71G(Field71GType field71G) {
        // Define regex patterns for currency and amount
        String currencyRegex = "\\w{3}";  // Example: USD, EUR, JPY
        String amountRegex = "\\d{1,15}";  // Up to 15 digits for amount

        // Validate currency
        if (field71G.getCurrency() == null || !field71G.getCurrency().matches(currencyRegex)) {
            return false;  // Return false if currency is invalid
        }

        // Validate amount
        if (field71G.getAmount() == null || !field71G.getAmount().toString().matches(amountRegex)) {
            return false;  // Return false if amount is invalid
        }

        return true;  // Return true if both currency and amount are valid
    }

    public boolean validateField72(String field72) {
        if (field72 == null) {
            return false;
        }

        // Field 72 typically contains sender to receiver information
        // It can have up to 6 lines, each up to 35 characters
        // The first line should start with a code (usually 2 digits followed by a letter)
        String[] lines = field72.split("\n");
        if (lines.length > 6 || lines.length == 0) {
            return false;
        }

        // Check the format of the first line (code)
        if (!lines[0].matches("^/\\d{2}[A-Z]/.*$")) {
            return false;
        }

        for (String line : lines) {
            if (line.length() > 35) {
                return false;
            }
            // Each line should only contain printable characters
            if (!line.matches("^[\\p{Print}]{1,35}$")) {
                return false;
            }
        }

        return true;
    }

    public boolean validateField77B(String field77B) {
        if (field77B == null) {
            return false;
        }

        // Field 77B typically contains Regulatory Reporting information
        // It can have up to 3 lines, each up to 35 characters
        String[] lines = field77B.split("\n");
        if (lines.length > 3 || lines.length == 0) {
            return false;
        }

        for (String line : lines) {
            if (line.length() > 35) {
                return false;
            }
            // Each line should only contain printable characters
            if (!line.matches("^[\\p{Print}]{1,35}$")) {
                return false;
            }
        }

        return true;
    }

















































}
