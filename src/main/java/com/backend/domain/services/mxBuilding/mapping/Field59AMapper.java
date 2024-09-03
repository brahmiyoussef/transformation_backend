package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field59AType;
import com.backend.domain.entities.mx.BranchAndFinancialInstitutionIdentification8;
import com.backend.domain.entities.mx.BranchData5;
import com.backend.domain.entities.mx.FinancialInstitutionIdentification23;

public class Field59AMapper {

    // Map Field59AType to an existing BranchAndFinancialInstitutionIdentification8 instance
    public static void mapField59AToBranchAndFinInstId(Field59AType field59A, BranchAndFinancialInstitutionIdentification8 branchAndFinInstId) {
        // Check if FinancialInstitutionIdentification23 is initialized
        if (branchAndFinInstId.getFinInstnId() == null) {
            System.out.println("Financial Institution Identification is not initialized.");
            return;
        }

        // Set the identifier code (BICFI) in FinInstnId
        if (field59A.getIdentifierCode() != null && !field59A.getIdentifierCode().isEmpty()) {
            branchAndFinInstId.getFinInstnId().setBICFI(field59A.getIdentifierCode());
        }

        // Check if account is present and not null
        if (field59A.getAccount() != null && !field59A.getAccount().isEmpty()) {
            BranchData5 branchData = new BranchData5();
            branchData.setId(field59A.getAccount());  // Set the account as the branch ID
            branchAndFinInstId.setBrnchId(branchData);  // Assign the branch data to BranchAndFinancialInstitutionIdentification8 instance
        }
    }
}
