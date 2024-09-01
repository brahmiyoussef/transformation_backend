package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field23EType;
import com.backend.domain.entities.mx.CreditTransferTransaction64;
import com.backend.domain.entities.mx.InstructionForCreditorAgent3;
import com.backend.domain.entities.mx.InstructionForNextAgent1;

public class Field23EMapper {
    public static void mapField23EtoCdtTrfTxInf(Field23EType field23E, CreditTransferTransaction64 cdtTrfTxInf) {
        // Vérifier la nature de l'instruction dans le champ 23E pour déterminer à qui elle est destinée
        String instructionCode = field23E.getInstructionCode();

        // Si l'instruction est destinée à l'agent suivant
        if (instructionCode.equals("/SDVA/") || instructionCode.equals("/REPA/") || instructionCode.equals("/INTC/")) {
            InstructionForNextAgent1 instrForNxtAgt = new InstructionForNextAgent1();
            instrForNxtAgt.setInstrInf(instructionCode);

            // Ajouter l'instruction à la liste des instructions pour l'agent suivant
            cdtTrfTxInf.getInstrForNxtAgt().add(instrForNxtAgt);
        }
        // Si l'instruction est destinée à l'agent du créancier
        else if (instructionCode.equals("/PHON/") || instructionCode.equals("/HOLD/") || instructionCode.equals("/CHQB/")) {
            InstructionForCreditorAgent3 instrForCdtrAgt = new InstructionForCreditorAgent3();
            instrForCdtrAgt.setCd(instructionCode);

            // Ajouter l'instruction à la liste des instructions pour l'agent du créancier
            cdtTrfTxInf.getInstrForCdtrAgt().add(instrForCdtrAgt);
        }
        // Cas où l'instruction pourrait ne pas correspondre à l'un ou l'autre (personnalisation possible)
        else {
            // Selon les besoins, vous pouvez ajouter d'autres logiques ou laisser l'instruction non mappée.
            System.out.println("Instruction non mappée : " + instructionCode);
        }
    }
}
