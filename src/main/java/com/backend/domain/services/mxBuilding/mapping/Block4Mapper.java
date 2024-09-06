package com.backend.domain.services.mxBuilding.mapping;
import com.backend.domain.entities.mt.fields.Field56CType;
import com.backend.domain.entities.mt.fields.Field57CType;
import com.backend.domain.entities.mt.fields.Field70Type;
import com.backend.domain.entities.mt.secondaryentities.PartyIdentifierType;
import com.backend.domain.entities.mx.*;
import com.backend.domain.entities.mt.blocks.Block4;

import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class Block4Mapper{

        // Map the field20 from Block4 to MsgId in GroupHeader113
        public static void mapField20ToMsgId(String field20, GroupHeader113 groupHeader) {

            groupHeader.setMsgId(field20);

        }




        public static void mapField23BToMndtRltdInf(String field23B, CreditTransferMandateData1 MndtRltdInf) {

            MndtRltdInf.setMndtId(field23B);

        }



        public static void mapField56CToBrnch(String field56C, BranchAndFinancialInstitutionIdentification8 branch) {


            if (branch.getBrnchId() == null) {
                branch.setBrnchId(new BranchData5());
            }

            String partyIdentifier = field56C;

            // Si partyIdentifier n'est pas nul, assignez-le à l'ID de BranchData5
            if (partyIdentifier != null) {
                // Supposons que partyIdentifier est de type String ou peut être converti en String
                branch.getBrnchId().setId(partyIdentifier.toString());
            } else {
                // Gérer le cas où partyIdentifier est nul si nécessaire
                System.err.println("PartyIdentifierType is null");
            }
        }



        public static void mapField57CToBrnch(Field57CType field57C, BranchAndFinancialInstitutionIdentification8 branch) {


            if (branch.getBrnchId() == null) {
                branch.setBrnchId(new BranchData5());
            }

            String partyIdentifier = field57C.getPartyIdentifier();

            // Si partyIdentifier n'est pas nul, assignez-le à l'ID de BranchData5
            if (partyIdentifier != null) {
                // Supposons que partyIdentifier est de type String ou peut être converti en String
                branch.getBrnchId().setId(partyIdentifier.toString());
            } else {
                // Gérer le cas où partyIdentifier est nul si nécessaire
                System.err.println("PartyIdentifierType is null");
            }

        }


        public static void mapField70ToRmtInf(Field70Type field70, RemittanceInformation22 rmtInf) {


            // Initialize the RemittanceInformation22 object
            List<String> ustrdList = new ArrayList<>();

            // Map the narrative lines to unstructured remittance information
            ustrdList.addAll(field70.getNarrativeLine());


            rmtInf.setUstrd(ustrdList);
        }


        public static void  mapField71AToChrgBr(String field71A , ChargeBearerType1Code ChrgBr) {

            ChargeBearerType1Code.valueOf(field71A);

        }

}
