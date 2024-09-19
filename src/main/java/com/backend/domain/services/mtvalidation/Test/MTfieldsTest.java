package com.backend.domain.services.mtvalidation.Test;


import com.backend.domain.entities.mt.blocks.Block1Type;
import com.backend.domain.entities.mt.blocks.Block2Type;
import com.backend.domain.entities.mt.blocks.Block3Type;
import com.backend.domain.entities.mt.blocks.Block4;
import com.backend.domain.entities.mt.message.Message;
import com.backend.domain.services.mtparsing.parser;
import com.backend.domain.services.mtvalidation.MTfields;
public class MTfieldsTest {

    public static void main(String[] args) {
        // Create an instance of MTfields
        MTfields mtFields = new MTfields();

        // Example message for testing purposes
        String testMessage = "{1:F01BANKBEBBAXXX0000000000}{2:O2021345160418SOGEFRPPAXXX00897254971604181345N}{3:{103:TGT}{108:OPTUSERREF16CHAR}}{4:\n" +
                ":20:1234567890\n:23B:CRED\n:32A:240828EUR1000\n:50A:12345678901234567890BANKUS33XXX\n" +
                ":59A:12345678901234567890BANKUS33XXX\n:59:/98765432109876543210\nJANE SMITH\n2 HIGH STREET\n" +
                "BERLIN\n:71A:SHA\n-}";

        parser mtMessageParser = new parser();
        // Parse the message into its blocks and fields
        Message parsedMessage = mtMessageParser.parseMtMessage(testMessage);

        // Perform validation
        //boolean isValid = mtFields.validateFields(testMessage);

        // Print the result
        //System.out.println("Is the message valid? " + isValid);



        // Test each block individually if needed
        boolean isBlock1Valid = mtFields.validateBlock1(parsedMessage.getBlock1());
        boolean isBlock2Valid = mtFields.validateBlock2(parsedMessage.getBlock2());
        //boolean isBlock3Valid = mtFields.validateBlock3(parsedMessage.getBlock3());
        //boolean isBlock4Valid = mtFields.validateBlock4(parsedMessage.getBlock4());

        System.out.println("Is Block 1 valid? " + isBlock1Valid);
        System.out.println("Is Block 2 valid? " + isBlock2Valid);


    }
}