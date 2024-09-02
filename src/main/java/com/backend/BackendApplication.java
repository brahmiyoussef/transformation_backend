package com.backend;

import com.backend.domain.entities.mt.blocks.Block4;
import com.backend.domain.entities.mt.fields.Field23EType;
import com.backend.domain.entities.mt.fields.Field32AType;
import com.backend.domain.entities.mt.fields.Field70Type;
import com.backend.domain.entities.mt.fields.Field72Type;
import com.backend.domain.entities.mx.*;
import com.backend.domain.services.mtparsing.BlockExtractor;
import com.backend.domain.services.mxBuilding.mapping.*;

import java.util.ArrayList;
import java.util.List;

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
        Field70Type field70 = new Field70Type();
        Field72Type field72 = new Field72Type();
        Block4 block4 = new Block4(); // Créez une instance de Block4

        // Parsing du champ 32A à partir du contenu du block 4
        field32A.setDate("280824");
        field32A.setAmount("1000");
        field32A.setCurrency("EUR");
        field23E.setInstructionCode("PHOA"); // Example value for testing
        field23E.setAdditionalInformation("Test Info");
        List<String> narrativeLines = new ArrayList<>();
        narrativeLines.add("Payment");
        narrativeLines.add("Additional Info");
        field70.setNarrativeLine(narrativeLines);
        field72.setCode("12345 ");
        block4.setField20("1234567890");

        // Affichage des valeurs des champs
        System.out.println("La valeur de Date est: " + field32A.getDate());
        System.out.println("La valeur de Amount est: " + field32A.getAmount());
        System.out.println("La valeur de Currency est: " + field32A.getCurrency());
        System.out.println("La valeur de InstructionCode est: " + field23E.getInstructionCode());
        System.out.println("La valeur de AdditionalInformation est: " + field23E.getAdditionalInformation());
        System.out.println("La valeur de Field20 est: " + block4.getField20());
        System.out.println("La valeur de Remittance est: " + field70.getNarrativeLine());

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

        // Mapper le field70 au RemittanceInformation22
        RemittanceInformation22 rmtInf = new RemittanceInformation22();
        Block4Mapper.mapField70ToRmtInf(field70, rmtInf);
        System.out.println("Le Remittance Information est: " + rmtInf.getUstrd());

        // Mapper le field72 au SupplementaryData1
        SupplementaryData1 splmtryData = new SupplementaryData1();
        Field72Mapper.mapField72ToSplmtryData(field72, splmtryData);
        System.out.println("Le Supplementary Data est: " + splmtryData.getEnvlp().getAny());

        // Test pour Field23E avec InstructionForNextAgent1 et InstructionForCreditorAgent3
        testField23EMapping();
    }

    private static void testField23EMapping() {
        Field23EType field23E = new Field23EType();
        field23E.setAdditionalInformation("Test Info");

        // Test avec InstructionForNextAgent1
        field23E.setInstructionCode("PHOA");
        InstructionForNextAgent1 nextAgentInstr = new InstructionForNextAgent1();
        Field23EMapper.mapField23E(field23E, nextAgentInstr);
        System.out.println("InstructionForNextAgent1: Cd = " + nextAgentInstr.getCd() +
                ", InstrInf = " + nextAgentInstr.getInstrInf());

        // Test avec InstructionForCreditorAgent3
        field23E.setInstructionCode("jnij");
        InstructionForCreditorAgent3 creditorAgentInstr = new InstructionForCreditorAgent3();
        Field23EMapper.mapField23E(field23E, creditorAgentInstr);
        System.out.println("InstructionForCreditorAgent3: Cd = " + creditorAgentInstr.getCd() +
                ", InstrInf = " + creditorAgentInstr.getInstrInf());
    }
}
