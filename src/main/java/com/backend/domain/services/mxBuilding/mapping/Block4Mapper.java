package com.backend.domain.services.mxBuilding.mapping;
import com.backend.domain.entities.mx.CreditTransferMandateData1;
import com.backend.domain.entities.mx.CreditTransferTransaction64;
import com.backend.domain.entities.mx.GroupHeader113;
import com.backend.domain.entities.mt.blocks.Block4;

import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;


public class Block4Mapper{

        // Map the field20 from Block4 to MsgId in GroupHeader113
        public static void mapField20ToMsgId(Block4 block4, GroupHeader113 groupHeader) {

            groupHeader.setMsgId(block4.getField20());

        }




    // Map the field23B from Block4 to MndtRltdInf in CreditTransferTransaction64
        /* public static void mapField23BToMndtRltdInf(Block4 block4, CreditTransferTransaction64 cdtTrfTxInf) {

            CreditTransferMandateData1 mndtRltdInf = new CreditTransferMandateData1();

            // Extrait les informations de field23B
            String field23B = block4.getField23B();
                // Exemple de mapping : définir le MndtId selon le type de paiement
                mndtRltdInf.setMndtId(field23B); // Si `field23B` est un code de type de paiement, ici, on l'assigne directement



            // Assigner la valeur à MndtRltdInf dans CreditTransferTransaction64
            cdtTrfTxInf.setMndtRltdInf(mndtRltdInf);
        }


          */

}
