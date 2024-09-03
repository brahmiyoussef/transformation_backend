package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field55BType;
import com.backend.domain.entities.mx.BranchAndFinancialInstitutionIdentification8;
import com.backend.domain.entities.mx.BranchData5;

public class Field55BMapper {

    // Map Field55BType to an existing BranchAndFinancialInstitutionIdentification8 instance
    public static void mapField55BToBranchAndFinInstId(Field55BType field55B, BranchAndFinancialInstitutionIdentification8 branchAndFinInstId) {
        // Initialize the FinancialInstitutionIdentification23 object if it's not already set
        if (branchAndFinInstId.getFinInstnId() != null) {
            // Set the identifier code directly in the existing BranchAndFinancialInstitutionIdentification8 instance
            branchAndFinInstId.getFinInstnId().setBICFI(field55B.getLocation());
        } else {
            // Handle the case where FinInstnId is null (e.g., log a warning, throw an exception, or provide alternative handling)
            System.out.println("Financial Institution Identification is not initialized.");
            return;
        }

        // If partyIdentifier is present, map it to the BranchData5 object
        if (field55B.getPartyIdentifier() != null && !field55B.getPartyIdentifier().isEmpty()) {
            BranchData5 branchData = new BranchData5();
            branchData.setId(field55B.getPartyIdentifier()); // Set the partyIdentifier as the branch ID
            branchAndFinInstId.setBrnchId(branchData); // Assign the branch data to the BranchAndFinancialInstitutionIdentification8 instance
        }
    }
}
