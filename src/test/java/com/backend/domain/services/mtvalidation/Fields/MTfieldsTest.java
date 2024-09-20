package com.backend.domain.services.mtvalidation.Fields;

import com.backend.domain.entities.mt.message.Message;
import com.backend.domain.services.mtparsing.parser;
import com.backend.domain.services.mtvalidation.MTfields;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MTfieldsTest {

    @Test
    public void testMTMessageValidation() {
        // Create an instance of MTfields
        MTfields mtFields = new MTfields();

        // Example message for testing purposes
        String testMessage = "{1:F01BANKBEBBAXXX0000000000}{2:O2021345160418SOGEFRPPAXXX00897254971604181345N}{3:{103:TGT}{108:OPTUSERREF16CHAR}}{4:\n" +
                ":20:1234567890\n:23B:CRED\n:32A:240828EUR1000,00\n:50A:123456789BANKUSXXX\n" +
                ":59A:12345678901234567890BANKUS33XXX\n:59:/98765432109876543210\nJANE SMITH\n2 HIGH STREET\n" +
                "BERLIN\n:71A:SHA\n-}";

        parser mtMessageParser = new parser();
        // Parse the message into its blocks and fields
        Message parsedMessage = mtMessageParser.parseMtMessage(testMessage);

        // Validate each block
        boolean isBlock1Valid = mtFields.validateBlock1(parsedMessage.getBlock1());
        boolean isBlock2Valid = mtFields.validateBlock2(parsedMessage.getBlock2());
        boolean isBlock3Valid = mtFields.validateBlock3(parsedMessage.getBlock3());
        boolean isBlock4Valid = mtFields.validateBlock4(parsedMessage.getBlock4());

        // Assert that each block is valid
        Assert.assertTrue(isBlock1Valid, "Block 1 validation failed.");
        Assert.assertTrue(isBlock2Valid, "Block 2 validation failed.");
        Assert.assertTrue(isBlock3Valid, "Block 3 validation failed.");
        Assert.assertTrue(isBlock4Valid, "Block 4 validation failed.");
    }
}
