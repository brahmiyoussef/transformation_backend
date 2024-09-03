package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field53AType;
import com.backend.domain.entities.mx.BranchAndFinancialInstitutionIdentification8;
import com.backend.domain.entities.mx.BranchData5;
import com.backend.domain.entities.mx.FinancialInstitutionIdentification23;

public class Field53AMapper {

    // Map Field53AType to an existing BranchAndFinancialInstitutionIdentification8 instance
    public static void mapField53AToBranchAndFinInstId(Field53AType field53A, BranchAndFinancialInstitutionIdentification8 branchAndFinInstId) {
        // Ensure that FinInstnId is not null before setting the BICFI
        if (branchAndFinInstId.getFinInstnId() == null) {
            branchAndFinInstId.setFinInstnId(new FinancialInstitutionIdentification23());
        }

        // Set the identifier code directly in the existing BranchAndFinancialInstitutionIdentification8 instance
        branchAndFinInstId.getFinInstnId().setBICFI(field53A.getIdentifierCode());

        // If partyIdentifier is present, map it to the BranchData5 object
        if (field53A.getPartyIdentifier() != null && !field53A.getPartyIdentifier().isEmpty()) {
            BranchData5 branchData = new BranchData5();
            branchData.setId(field53A.getPartyIdentifier()); // Set the partyIdentifier as the branch ID
            branchAndFinInstId.setBrnchId(branchData); // Assign the branch data to the BranchAndFinancialInstitutionIdentification8 instance
        }
    }
}
