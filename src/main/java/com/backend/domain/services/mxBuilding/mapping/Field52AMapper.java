package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field52AType;
import com.backend.domain.entities.mx.BranchAndFinancialInstitutionIdentification8;
import com.backend.domain.entities.mx.BranchData5;
import com.backend.domain.entities.mx.FinancialInstitutionIdentification23;

public class Field52AMapper {

    // Map Field52AType to an existing BranchAndFinancialInstitutionIdentification8 instance
    public static void mapField52AToBranchAndFinInstId(Field52AType field52A, BranchAndFinancialInstitutionIdentification8 branchAndFinInstId) {
        // Ensure that FinInstnId is not null before setting values
        if (branchAndFinInstId.getFinInstnId() == null) {
            branchAndFinInstId.setFinInstnId(new FinancialInstitutionIdentification23());
        }
        System.out.println("52A"+field52A.getIdentifierCode());
        // Map the identifierCode to BICFIIdentifier (BIC)
        if (field52A.getIdentifierCode() != null && !field52A.getIdentifierCode().isEmpty()) {
            branchAndFinInstId.getFinInstnId().setBICFI(field52A.getIdentifierCode()); // Set the identifierCode as the BICFI
        }

        // If partyIdentifier is present, map it to the BranchData5 object
        if (field52A.getPartyIdentifier() != null && !field52A.getPartyIdentifier().isEmpty()) {
            BranchData5 branchData = new BranchData5();
            branchData.setId(field52A.getPartyIdentifier()); // Set the partyIdentifier as the branch ID
            branchAndFinInstId.setBrnchId(branchData); // Assign the branch data to the BranchAndFinancialInstitutionIdentification8 instance
        }
    }
}
