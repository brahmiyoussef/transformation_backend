package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field57BType;
import com.backend.domain.entities.mx.BranchAndFinancialInstitutionIdentification8;
import com.backend.domain.entities.mx.BranchData5;

public class Field57BMapper {

    // Map Field57BType to an existing BranchAndFinancialInstitutionIdentification8 instance
    public static void mapField57BToBranchAndFinInstId(Field57BType field57B, BranchAndFinancialInstitutionIdentification8 branchAndFinInstId) {
        // Check if FinancialInstitutionIdentification23 is initialized
        if (branchAndFinInstId.getFinInstnId() == null) {
            System.out.println("Financial Institution Identification is not initialized.");
            return;
        }

        // Check if partyIdentifier is present and not null
        if (field57B.getPartyIdentifier() != null && !field57B.getPartyIdentifier().isEmpty()) {
            // Retrieve the partyIdentifier value from Field57BType
            String identifierValue = field57B.getPartyIdentifier();

            // If identifierValue is not empty, set it in BranchData5
            if (!identifierValue.isEmpty()) {
                BranchData5 branchData = new BranchData5();
                branchData.setId(identifierValue);  // Set the partyIdentifier as the branch ID
                branchAndFinInstId.setBrnchId(branchData);  // Assign the branch data to BranchAndFinancialInstitutionIdentification8 instance
            }
        }

        // Check if location is present and not null
        if (field57B.getLocation() != null && !field57B.getLocation().isEmpty()) {
            BranchData5 branchData = branchAndFinInstId.getBrnchId();
            if (branchData == null) {
                branchData = new BranchData5();
            }
            branchData.setNm(field57B.getLocation());  // Assuming location maps to the name (Nm) field
            branchAndFinInstId.setBrnchId(branchData);  // Assign the branch data to BranchAndFinancialInstitutionIdentification8 instance
        }
    }
}
