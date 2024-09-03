package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field57CType;
import com.backend.domain.entities.mx.BranchAndFinancialInstitutionIdentification8;
import com.backend.domain.entities.mx.BranchData5;

public class Field57CMapper {

    // Map Field57CType to an existing BranchAndFinancialInstitutionIdentification8 instance
    public static void mapField57CToBranchAndFinInstId(Field57CType field57C, BranchAndFinancialInstitutionIdentification8 branchAndFinInstId) {
        // Check if FinancialInstitutionIdentification23 is initialized
        if (branchAndFinInstId.getFinInstnId() == null) {
            System.out.println("Financial Institution Identification is not initialized.");
            return;
        }


            String identifierValue = field57C.getPartyIdentifier();

            // If identifierValue is not empty, set it in BranchData5
            BranchData5 branchData = new BranchData5();
            branchData.setId(identifierValue);  // Set the partyIdentifier as the branch ID
            branchAndFinInstId.setBrnchId(branchData);  // Assign the branch data to BranchAndFinancialInstitutionIdentification8 instance
        }
    }

