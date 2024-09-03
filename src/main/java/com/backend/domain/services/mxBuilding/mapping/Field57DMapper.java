package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field57DType;
import com.backend.domain.entities.mx.BranchAndFinancialInstitutionIdentification8;
import com.backend.domain.entities.mx.BranchData5;

public class Field57DMapper {

    // Map Field57DType to an existing BranchAndFinancialInstitutionIdentification8 instance
    public static void mapField57DToBranchAndFinInstId(Field57DType field57D, BranchAndFinancialInstitutionIdentification8 branchAndFinInstId) {
        // Check if FinancialInstitutionIdentification23 is initialized
        if (branchAndFinInstId.getFinInstnId() == null) {
            System.out.println("Financial Institution Identification is not initialized.");
            return;
        }

        // Check if partyIdentifier is present and not null
        if (field57D.getPartyIdentifier() != null && !field57D.getPartyIdentifier().isEmpty()) {
            // Set the partyIdentifier in BranchData5
            BranchData5 branchData = new BranchData5();
            branchData.setId(field57D.getPartyIdentifier());  // Set the partyIdentifier as the branch ID

            // Check if numberAddress is present and not null, set it if available
            if (field57D.getnumberAddress() != null && !field57D.getnumberAddress().isEmpty()) {
                branchData.setNm(field57D.getnumberAddress());  // Assuming 'Nm' field can be used for numberAddress
            }

            // Assign the branch data to BranchAndFinancialInstitutionIdentification8 instance
            branchAndFinInstId.setBrnchId(branchData);
        }
    }
}
