package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field51AType;
import com.backend.domain.entities.mx.BranchAndFinancialInstitutionIdentification8;
import com.backend.domain.entities.mx.BranchData5;
import com.backend.domain.entities.mx.FinancialInstitutionIdentification23;

public class Field51AMapper {

    // Map Field51AType to an existing BranchAndFinancialInstitutionIdentification8 instance
    public static void mapField51AToBranchAndFinInstId(Field51AType field51A, BranchAndFinancialInstitutionIdentification8 branchAndFinInstId) {
        // Ensure that FinInstnId is not null before setting the identifier code
        if (branchAndFinInstId.getFinInstnId() == null) {
            branchAndFinInstId.setFinInstnId(new FinancialInstitutionIdentification23());
        }

        // Set the identifier code directly in the existing BranchAndFinancialInstitutionIdentification8 instance
        branchAndFinInstId.getFinInstnId().setBICFI(field51A.getIdentifierCode());

        // If partyIdentifier is present, map it to the BranchData5 object
        if (field51A.getPartyIdentifier() != null && !field51A.getPartyIdentifier().isEmpty()) {
            BranchData5 branchData = new BranchData5();
            branchData.setId(field51A.getPartyIdentifier()); // Set the partyIdentifier as the branch ID
            branchAndFinInstId.setBrnchId(branchData); // Assign the branch data to the BranchAndFinancialInstitutionIdentification8 instance
        }
    }
}
