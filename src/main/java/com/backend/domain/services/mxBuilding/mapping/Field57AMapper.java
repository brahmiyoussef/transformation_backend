package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field57AType;
import com.backend.domain.entities.mx.BranchAndFinancialInstitutionIdentification8;
import com.backend.domain.entities.mx.BranchData5;

public class Field57AMapper {

    // Map Field57AType to an existing BranchAndFinancialInstitutionIdentification8 instance
    public static void mapField57AToBranchAndFinInstId(Field57AType field57A, BranchAndFinancialInstitutionIdentification8 branchAndFinInstId) {
        // Check if FinancialInstitutionIdentification23 is initialized
        if (branchAndFinInstId.getFinInstnId() == null) {
            System.out.println("Financial Institution Identification is not initialized.");
            return;
        }
        System.out.println("Financial Institution Identification Code is: " + field57A.getPartyIdentifier());
        // Set the identifierCode in the existing BranchAndFinancialInstitutionIdentification8 instance
        if (field57A.getIdentifierCode() != null) {
            System.out.println("Financial Institution Identification Code is: " + field57A.getIdentifierCode());
            branchAndFinInstId.getFinInstnId().setBICFI(field57A.getIdentifierCode());
        }

        // If partyIdentifier is present, map it to the BranchData5 object
        if (field57A.getPartyIdentifier() != null && !field57A.getPartyIdentifier().isEmpty()) {
            BranchData5 branchData = new BranchData5();
            branchData.setId(field57A.getPartyIdentifier());  // Set the partyIdentifier as the branch ID
            branchAndFinInstId.setBrnchId(branchData);  // Assign the branch data to the BranchAndFinancialInstitutionIdentification8 instance
        }
    }
}
