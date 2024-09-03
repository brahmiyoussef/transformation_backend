package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field56CType;
import com.backend.domain.entities.mx.BranchAndFinancialInstitutionIdentification8;
import com.backend.domain.entities.mx.BranchData5;

public class Field56CMapper {

    // Map Field56CType to an existing BranchAndFinancialInstitutionIdentification8 instance
    public static void mapField56CToBranchAndFinInstId(Field56CType field56C, BranchAndFinancialInstitutionIdentification8 branchAndFinInstId) {
        // Check if FinancialInstitutionIdentification23 is initialized
        if (branchAndFinInstId.getFinInstnId() == null) {
            System.out.println("Financial Institution Identification is not initialized.");
            return;
        }

        // Check if partyIdentifier is present and not null
        if (field56C.getPartyIdentifier() != null && !field56C.getPartyIdentifier().isEmpty()) {
            // Retrieve the partyIdentifier value from Field56CType
            String identifierValue = field56C.getPartyIdentifier();

            // If identifierValue is not empty, set it in BranchData5
            if (!identifierValue.isEmpty()) {
                BranchData5 branchData = new BranchData5();
                branchData.setId(identifierValue);  // Set the partyIdentifier as the branch ID
                branchAndFinInstId.setBrnchId(branchData);  // Assign the branch data to BranchAndFinancialInstitutionIdentification8 instance
            }
        }
    }
}
