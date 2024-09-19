package com.backend.domain.services.mtparsing;

import com.backend.domain.entities.mt.message.Message;
import org.testng.annotations.Test;

public class ParserTest {

    // Test parsing of a valid MT message and printing the blocks
    @Test
    public void testParseMtMessage_validMessage() {
        // Ensure the parser class follows naming conventions
        parser parserService = new parser();

        // Example MT103 message
        String mtMessageO = "{1:F01BANKBEBBAXXX0000000000}{2:O2021345160418SOGEFRPPAXXX00897254971604181345N}{3:{103:TGT}{108:OPTUSERREF16CHAR}}{4:\n" +
                ":20:1234567890\n:23B:CRED\n:32A:240828EUR1000,\n:50K:/12345678901234567890\n" +
                "JOHN DOE\n1 MAIN STREET\nBRUSSELS\n:59:/98765432109876543210\nJANE SMITH\n2 HIGH STREET\n" +
                "BERLIN\n:71A:SHA\n-}";

        try {
            Message message = parserService.parseMtMessage(mtMessageO);

            // Validate parsed message content
            assert message.getBlock1() != null : "Block1 is null";
            assert message.getBlock2() != null : "Block2 is null";
            assert message.getBlock3() != null : "Block3 is null";
            assert message.getBlock4() != null : "Block4 is null";

            System.out.println("testParseMtMessage_validMessage passed.");

        } catch (Exception e) {
            System.out.println("testParseMtMessage_validMessage failed with exception: " + e.getMessage());
            assert false : "Exception occurred: " + e.getMessage();
        }
    }
}
