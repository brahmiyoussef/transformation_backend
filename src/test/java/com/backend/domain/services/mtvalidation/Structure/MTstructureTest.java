package com.backend.domain.services.mtvalidation.Structure;

import com.backend.domain.services.mtvalidation.MTstructure;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MTstructureTest {

    // Test for a valid MT message structure
    @Test
    public void testValidMTMessage() {
        String validMTMessage = "{1:F01BCMAMAMCXXXX0000000000}{2:O2021345160418BCMAMAMCXXXX00897254971604181345N}{3:{103:TGT}{108:OPTUSERREF16CHAR}}{4:\n" +
                ":20:1234567890\n:23B:CRED\n:32A:240828EUR1000\n:50A:12345678901234567890BANKUS33XXX\n" +
                ":59A:12345678901234567890BANKUS33XXX\n:59:/98765432109876543210\nJANE SMITH\n2 HIGH STREET\n" +
                "BERLIN\n:71A:SHA\n-}";

        boolean result = MTstructure.validateStructure(validMTMessage);

        // Use Assert to validate the result
        Assert.assertTrue(result, "The valid MT message structure test failed.");
    }
}
