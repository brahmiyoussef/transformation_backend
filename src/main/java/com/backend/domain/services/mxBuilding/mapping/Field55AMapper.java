package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field55AType;
import com.backend.domain.entities.mx.BranchAndFinancialInstitutionIdentification8;
import com.backend.domain.entities.mx.BranchData5;

public class Field55AMapper {

    // Map Field55AType to an existing BranchAndFinancialInstitutionIdentification8 instance
    public static void mapField55AToBranchAndFinInstId(Field55AType field55A, BranchAndFinancialInstitutionIdentification8 branchAndFinInstId) {
        // Check if the FinInstnId is already initialized
        if (branchAndFinInstId.getFinInstnId() != null) {
            // Set the identifier code directly in the existing BranchAndFinancialInstitutionIdentification8 instance
            branchAndFinInstId.getFinInstnId().setBICFI(field55A.getIdentifierCode());
        } else {
            // Handle the case where FinInstnId is null (e.g., log a warning, throw an exception, or provide an alternative handling)
            System.out.println("Financial Institution Identification is not initialized.");
            return;
        }

        // If partyIdentifier is present, map it to the BranchData5 object
        if (field55A.getPartyIdentifier() != null && !field55A.getPartyIdentifier().isEmpty()) {
            BranchData5 branchData = new BranchData5();
            branchData.setId(field55A.getPartyIdentifier()); // Set the partyIdentifier as the branch ID
            branchAndFinInstId.setBrnchId(branchData); // Assign the branch data to the BranchAndFinancialInstitutionIdentification8 instance
        }
    }
}
