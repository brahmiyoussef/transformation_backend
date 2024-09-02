// Field23EMapper.java
package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field23EType;
import com.backend.domain.entities.mx.InstructionForCreditorAgent3;
import com.backend.domain.entities.mx.InstructionForNextAgent1;
import com.backend.domain.entities.mx.Instruction4Code;

public class Field23EMapper {

    public static void mapField23E(Field23EType field23E, Object target) {
        if (field23E == null || target == null) {
            throw new IllegalArgumentException("Field23EType or target cannot be null");
        }

        String instructionCode = field23E.getInstructionCode();
        String additionalInfo = field23E.getAdditionalInformation();


        if (target instanceof InstructionForNextAgent1) {
            if (instructionCode.equals("PHOA") || instructionCode.equals("TELA")) {
                InstructionForNextAgent1 nextAgentInstr = (InstructionForNextAgent1) target;
                try {
                    // Convert instructionCode to Instruction4Code enum
                    Instruction4Code codeEnum = Instruction4Code.fromValue(instructionCode);
                    nextAgentInstr.setCd(codeEnum);
                } catch (IllegalArgumentException e) {
                    System.err.println("Invalid instruction code for InstructionForNextAgent1: " + instructionCode);
                }
                nextAgentInstr.setInstrInf(additionalInfo);
            } else {
                throw new IllegalArgumentException("Instruction code does not match expected values for InstructionForNextAgent1");
            }
        } else if (target instanceof InstructionForCreditorAgent3) {
            if (!(instructionCode.equals("PHOA") || instructionCode.equals("TELA"))) {
                InstructionForCreditorAgent3 creditorAgentInstr = (InstructionForCreditorAgent3) target;
                creditorAgentInstr.setCd(instructionCode); // Directly set string as no conversion needed
                creditorAgentInstr.setInstrInf(additionalInfo);
            } else {
                throw new IllegalArgumentException("Instruction code does not match expected values for InstructionForCreditorAgent3");
            }
        } else {
            throw new IllegalArgumentException("Target object must be either InstructionForNextAgent1 or InstructionForCreditorAgent3");
        }


    }
}
