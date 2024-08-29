package com.backend.domain.services.mxBuilding;

import com.backend.domain.entities.mt.blocks.Block1Type;
import com.backend.domain.entities.mt.blocks.Block2Type;
import com.backend.domain.entities.mt.message.Message;
import com.backend.domain.entities.mx.FIToFICustomerCreditTransferV12;
import com.backend.domain.entities.mx.GroupHeader113;

import java.time.Instant;

public class MTToMXMappingService {

    public FIToFICustomerCreditTransferV12 mapMTToMX(Message mtMessage) {
        FIToFICustomerCreditTransferV12 mxMessage = new FIToFICustomerCreditTransferV12();

        // Mapping du bloc 1
        if (mtMessage.getBlock1() != null) {
            Block1Type block1 = mtMessage.getBlock1();
            GroupHeader113 groupHeader = new GroupHeader113();
            groupHeader.setMsgId(block1.getLogicalTerminal() + block1.getSessionNumber() + block1.getSequenceNumber());

            // Conversion de la date actuelle en XMLGregorianCalendar
            groupHeader.setCreDtTm(DateConversionUtil.toXMLGregorianCalendar(Instant.now()));

            // Ajoutez d'autres mappings ici pour le bloc 1 si nécessaire

            mxMessage.setGrpHdr(groupHeader);
        }

        // Mapping du bloc 2
        if (mtMessage.getBlock2() != null) {
            Block2Type block2 = mtMessage.getBlock2();
            // Vous pouvez utiliser les informations du block 2 pour mapper à d'autres éléments du message MX si nécessaire

            // Exemple d'utilisation des données du bloc 2
            // groupHeader.setSomeOtherField(block2.getSomeField());

            // Ajoutez d'autres mappings ici pour le bloc 2 si nécessaire
        }

        // Retourne le message MX mappé
        return mxMessage;
    }
}
