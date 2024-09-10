package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field52DType;
import com.backend.domain.entities.mx.BranchAndFinancialInstitutionIdentification8;
import com.backend.domain.entities.mx.BranchData5;
import com.backend.domain.entities.mx.FinancialInstitutionIdentification23;

public class Field52DMapper {

    // Map Field52DType to an existing BranchAndFinancialInstitutionIdentification8 instance
    public static void mapField52DToBranchAndFinInstId(Field52DType field52D, BranchAndFinancialInstitutionIdentification8 branchAndFinInstId) {
        // Ensure that FinInstnId is not null before setting values
        if (branchAndFinInstId.getFinInstnId() == null) {
            branchAndFinInstId.setFinInstnId(new FinancialInstitutionIdentification23());
        }

        // If partyIdentifier is present, map it to the BranchData5 object
        if (field52D.getPartyIdentifier() != null && !field52D.getPartyIdentifier().isEmpty()) {
            BranchData5 branchData = new BranchData5();
            branchData.setId(field52D.getPartyIdentifier()); // Set the partyIdentifier as the branch ID
            branchAndFinInstId.setBrnchId(branchData); // Assign the branch data to the BranchAndFinancialInstitutionIdentification8 instance
        }

    }
}
