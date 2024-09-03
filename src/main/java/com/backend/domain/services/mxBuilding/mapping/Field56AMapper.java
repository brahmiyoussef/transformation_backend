package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field56AType;
import com.backend.domain.entities.mx.BranchAndFinancialInstitutionIdentification8;
import com.backend.domain.entities.mx.BranchData5;

public class Field56AMapper {

    // Map Field56AType to an existing BranchAndFinancialInstitutionIdentification8 instance
    public static void mapField56AToBranchAndFinInstId(Field56AType field56A, BranchAndFinancialInstitutionIdentification8 branchAndFinInstId) {
        // Initialize the FinancialInstitutionIdentification23 object if it's not already set
        if (branchAndFinInstId.getFinInstnId() != null) {
            // Set the identifier code directly in the existing BranchAndFinancialInstitutionIdentification8 instance
            branchAndFinInstId.getFinInstnId().setBICFI(field56A.getIdentifierCode());
        } else {
            // Handle the case where FinInstnId is null (e.g., log a warning, throw an exception, or provide alternative handling)
            System.out.println("Financial Institution Identification is not initialized.");
            return;
        }

        // If partyIdentifier is present, map it to the BranchData5 object
        if (field56A.getPartyIdentifier() != null && !field56A.getPartyIdentifier().isEmpty()) {
            BranchData5 branchData = new BranchData5();
            branchData.setId(field56A.getPartyIdentifier()); // Set the partyIdentifier as the branch ID
            branchAndFinInstId.setBrnchId(branchData); // Assign the branch data to the BranchAndFinancialInstitutionIdentification8 instance
        }
    }
}
