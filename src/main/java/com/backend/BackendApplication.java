package com.backend;

import com.backend.domain.entities.mt.blocks.Block4;
import com.backend.domain.entities.mt.fields.Field23EType;
import com.backend.domain.entities.mt.fields.Field32AType;
import com.backend.domain.entities.mx.ActiveCurrencyAndAmount;
import com.backend.domain.entities.mx.CreditTransferTransaction64;
import com.backend.domain.entities.mx.GroupHeader113;
import com.backend.domain.entities.mx.InstructionForCreditorAgent3;
import com.backend.domain.services.mtparsing.BlockExtractor;
import com.backend.domain.services.mxBuilding.mapping.Block4Mapper;
import com.backend.domain.services.mxBuilding.mapping.Field23EMapper;
import com.backend.domain.services.mxBuilding.mapping.Field32AMapper;

public class BackendApplication {

    public static void main(String[] args) {
        // Exemple de message MT 103
        String mt103Message = "{1:F01BANKBEBBAXXX0000000000}{2:I103SOGEFRPPZXXXU3003}{4:\n" +
                ":20:1234567890\n:23B:CRED\n:32A:240828EUR1000,\n:50K:/12345678901234567890\n" +
                "JOHN DOE\n1 MAIN STREET\nBRUSSELS\n:59:/98765432109876543210\nJANE SMITH\n2 HIGH STREET\n" +
                "BERLIN\n:71A:SHA\n-}";

        // Créez une instance de BlockExtractor pour extraire les blocs
        BlockExtractor blockExtractor = new BlockExtractor();
        String[] blocks = blockExtractor.extractBlocks(mt103Message);

        // Extraction du Block 4
        String block4Str = blocks[3];
        System.out.println("Le block 4: " + block4Str);

        // Initialisation des objets Field et des blocs
        Field32AType field32A = new Field32AType();
        Field23EType field23E = new Field23EType();
        CreditTransferTransaction64 cdtTrfTxInf = new CreditTransferTransaction64();
        Block4 block4 = new Block4(); // Créez une instance de Block4

        // Parsing du champ 32A à partir du contenu du block 4
        field32A.setDate("280824");
        field32A.setAmount("1000");
        field32A.setCurrency("EUR");
        field23E.setInstructionCode("SDVA");
        field23E.setAdditionalInformation("Additional info");

        block4.setField20("1234567890");

        // Affichage des valeurs des champs
        System.out.println("La valeur de Date est: " + field32A.getDate());
        System.out.println("La valeur de Amount est: " + field32A.getAmount());
        System.out.println("La valeur de Currency est: " + field32A.getCurrency());
        System.out.println("La valeur de InstructionCode est: " + field23E.getInstructionCode());
        System.out.println("La valeur de AdditionalInformation est: " + field23E.getAdditionalInformation());
        System.out.println("La valeur de Field20 est: " + block4.getField20());

        // Création de l'objet GroupHeader113
        GroupHeader113 grpHdr = new GroupHeader113();

        // Mapping du field32A au grpHdr
        Field32AMapper.mapField32AtoGrpHdr(field32A, grpHdr);

        // Affichage des résultats du mappage
        ActiveCurrencyAndAmount amt = grpHdr.getTtlIntrBkSttlmAmt();
        System.out.println("Le montant total interbancaire de règlement (TtlIntrBkSttlmAmt): " +
                (amt != null ? amt.getValue() + " " + amt.getCcy() : "Non défini"));

        // Affichage de la date de règlement interbancaire
        System.out.println("La date de règlement interbancaire (IntrBkSttlmDt): " +
                (grpHdr.getIntrBkSttlmDt() != null ? grpHdr.getIntrBkSttlmDt() : "Non définie"));



        // Mapper le champ 20 du Block4 au MsgId du GroupHeader113
        Block4Mapper.mapField20ToMsgId(block4, grpHdr);

        // Afficher les résultats du mappage
        System.out.println("Le MsgId dans GroupHeader113 est: " + grpHdr.getMsgId());
    }
}
