package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field59FType;
import com.backend.domain.entities.mx.BranchAndFinancialInstitutionIdentification8;
import com.backend.domain.entities.mx.BranchData5;

public class Field59FMapper {

    // Map Field59FType to an existing BranchAndFinancialInstitutionIdentification8 instance
    public static void mapField59FToBranchAndFinInstId(Field59FType field59F, BranchAndFinancialInstitutionIdentification8 branchAndFinInstId) {
        // Check if FinancialInstitutionIdentification23 is initialized
        if (branchAndFinInstId.getFinInstnId() == null) {
            System.out.println("Financial Institution Identification is not initialized.");
            return;
        }

        // Check if account is present and not null
        if (field59F.getAccount() != null && !field59F.getAccount().isEmpty()) {
            // Create a new BranchData5 instance if needed
            BranchData5 branchData = branchAndFinInstId.getBrnchId();
            if (branchData == null) {
                branchData = new BranchData5();
            }

            // Set the account as the ID
            branchData.setId(field59F.getAccount());

            // Set the numberAddress if available
            if (field59F.getNumberAddress() != null && !field59F.getNumberAddress().isEmpty()) {
                branchData.setNm(field59F.getNumberAddress());  // Assuming 'Nm' is the appropriate field for numberAddress
            }

            // Set the branch data in BranchAndFinancialInstitutionIdentification8
            branchAndFinInstId.setBrnchId(branchData);
        }
    }
}
