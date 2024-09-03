package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field56DType;
import com.backend.domain.entities.mx.BranchAndFinancialInstitutionIdentification8;
import com.backend.domain.entities.mx.BranchData5;

public class Field56DMapper {

    // Map Field56DType to an existing BranchAndFinancialInstitutionIdentification8 instance
    public static void mapField56DToBranchAndFinInstId(Field56DType field56D, BranchAndFinancialInstitutionIdentification8 branchAndFinInstId) {
        // Check if FinancialInstitutionIdentification23 is initialized
        if (branchAndFinInstId.getFinInstnId() == null) {
            System.out.println("Financial Institution Identification is not initialized.");
            return;
        }

        // Check if partyIdentifier is present and not null
        if (field56D.getPartyIdentifier() != null && !field56D.getPartyIdentifier().isEmpty()) {
            // Retrieve the partyIdentifier value from Field56DType
            String identifierValue = field56D.getPartyIdentifier();

            // If identifierValue is not empty, set it in BranchData5
            if (!identifierValue.isEmpty()) {
                BranchData5 branchData = new BranchData5();
                branchData.setId(identifierValue);  // Set the partyIdentifier as the branch ID
                branchAndFinInstId.setBrnchId(branchData);  // Assign the branch data to BranchAndFinancialInstitutionIdentification8 instance
            }
        }

        // Check if numberAddress is present and not null
        if (field56D.getnumberAddress() != null && !field56D.getnumberAddress().isEmpty()) {
            // Since we don't know where to map numberAddress, let's assume we just print it for now
            System.out.println("Mapped Number Address: " + field56D.getnumberAddress());
        }
    }
}
