package com.backend.domain.services.mtvalidation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MTValidatorTest {

    @Test
    public void testValidMessage() {
        MTvalidator validator = new MTvalidator();

        // Test valid message
        String validMessage = "{1:F01BANKBEBBAXXX0000000000}{2:I103SOGEFRPPZXXXU3003}{3:{103:TGT}{108:OPTUSERREF16CHAR}}{4:\n" +
                ":20:1234567890\n:23B:CRED\n:32A:240828EUR1000,\n:50K:/12345678901234567890\n" +
                "JOHN DOE\n1 MAIN STREET\nBRUSSELS\n:59:/98765432109876543210\nJANE SMITH\n2 HIGH STREET\n" +
                "BERLIN\n:71A:SHA\n-}";

        boolean result = validator.validateMessage(validMessage);
        Assert.assertTrue(result, "Valid Message Test failed.");
    }

    @Test
    public void testInvalidMessageStructure() {
        MTvalidator validator = new MTvalidator();

        // Test invalid message (bad structure)
        String invalidMessage = "{1:...}{2:...}{4:...}"; // Missing block 3

        boolean result = validator.validateMessage(invalidMessage);
        Assert.assertFalse(result, "Invalid Structure Test failed. Expected: false, but got: " + result);
    }

    @Test
    public void testInvalidMessageFields() {
        MTvalidator validator = new MTvalidator();

        // Test invalid fields
        String invalidFieldsMessage = "{1:...}{2:...}{3:{103:TGT}{108:INVALID}}{4:...}";

        boolean result = validator.validateMessage(invalidFieldsMessage);
        Assert.assertFalse(result, "Invalid Fields Test failed. Expected: false, but got: " + result);
    }
}
