package com.backend.domain.services.mtvalidation.Test;

import com.backend.domain.services.mtvalidation.MTvalidator;


public class MTValidatorTest {

    public static void main(String[] args) {
        MTvalidator validator = new MTvalidator();

        // Test valid message
        String validMessage = "{1:F01BANKBEBBAXXX0000000000}{2:I103SOGEFRPPZXXXU3003}{3:{103:TGT}{108:OPTUSERREF16CHAR}}{4:\n" +
                ":20:1234567890\n:23B:CRED\n:32A:240828EUR1000,\n:50K:/12345678901234567890\n" +
                "JOHN DOE\n1 MAIN STREET\nBRUSSELS\n:59:/98765432109876543210\nJANE SMITH\n2 HIGH STREET\n" +
                "BERLIN\n:71A:SHA\n-}";

        testValidateMessage(validator, validMessage, true, "Valid Message Test");
/*
        // Test invalid message (bad structure)
        String invalidMessage = "{1:...}{2:...}{4:...}"; // Missing block 3
        testValidateMessage(validator, invalidMessage, false, "Invalid Structure Test");

        // Test invalid fields
        String invalidFieldsMessage = "{1:...}{2:...}{3:{103:TGT}{108:INVALID}}{4:...}";
        testValidateMessage(validator, invalidFieldsMessage, false, "Invalid Fields Test");
*/
    }


    private static void testValidateMessage(MTvalidator validator, String message, boolean expectedResult, String testName) {
        boolean result = validator.validateMessage(message);
        if (result == expectedResult) {
            System.out.println(testName + " passed.");
        } else {
            System.out.println(testName + " failed. Expected: " + expectedResult + ", but got: " + result);
        }
    }
}
