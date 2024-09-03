package com.backend;

import com.backend.controllers.MTparseController;
import com.backend.domain.entities.mt.blocks.Block4;
import com.backend.domain.entities.mt.fields.Field23EType;
import com.backend.domain.entities.mt.fields.Field32AType;
import com.backend.domain.entities.mt.message.Message;
import com.backend.domain.entities.mx.ActiveCurrencyAndAmount;
import com.backend.domain.entities.mx.CreditTransferTransaction64;
import com.backend.domain.entities.mx.GroupHeader113;
import com.backend.domain.entities.mx.InstructionForCreditorAgent3;
import com.backend.domain.services.mtparsing.BlockExtractor;
import com.backend.domain.services.mtparsing.parser;
import com.backend.domain.services.mxBuilding.mapping.Block4Mapper;
import com.backend.domain.services.mxBuilding.mapping.Field23EMapper;
import com.backend.domain.services.mxBuilding.mapping.Field32AMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import com.backend.domain.services.mtparsing.parser;

public class BackendApplication {

    public static void main(String[] args) {
        // Exemple de message MT 103
        String mt103Message = "{1:F01BANKBEBBAXXX0000000000}{2:I103SOGEFRPPZXXXU3003}{4:\n" +
                ":20:1234567890\n:23B:CRED\n:32A:240828EUR1000,\n:50K:/12345678901234567890\n" +
                "JOHN DOE\n1 MAIN STREET\nBRUSSELS\n:59:/98765432109876543210\nJANE SMITH\n2 HIGH STREET\n" +
                "BERLIN\n:71A:SHA\n-}";



        parser mtMessageService = new parser();
        Message message = mtMessageService.parseMtMessage(mt103Message);

        System.out.println("Le msg est: " + message);

    }


    }
