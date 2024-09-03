package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field54AType;
import com.backend.domain.entities.mx.BranchAndFinancialInstitutionIdentification8;
import com.backend.domain.entities.mx.BranchData5;
import com.backend.domain.entities.mx.FinancialInstitutionIdentification23;

public class Field54AMapper {

    // Map Field54AType to an existing BranchAndFinancialInstitutionIdentification8 instance
    public static void mapField54AToBranchAndFinInstId(Field54AType field54A, BranchAndFinancialInstitutionIdentification8 branchAndFinInstId) {
        // Initialize the FinancialInstitutionIdentification23 object if it's null
        if (branchAndFinInstId.getFinInstnId() == null) {
            branchAndFinInstId.setFinInstnId(new FinancialInstitutionIdentification23());
        }

        // Set the identifier code directly in the existing BranchAndFinancialInstitutionIdentification8 instance
        branchAndFinInstId.getFinInstnId().setBICFI(field54A.getIdentifierCode());

        // If partyIdentifier is present, map it to the BranchData5 object
        if (field54A.getPartyIdentifier() != null && !field54A.getPartyIdentifier().isEmpty()) {
            BranchData5 branchData = new BranchData5();
            branchData.setId(field54A.getPartyIdentifier()); // Set the partyIdentifier as the branch ID
            branchAndFinInstId.setBrnchId(branchData); // Assign the branch data to the BranchAndFinancialInstitutionIdentification8 instance
        }
    }
}
