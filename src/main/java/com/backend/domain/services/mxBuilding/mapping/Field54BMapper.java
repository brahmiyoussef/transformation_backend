package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field54BType;
import com.backend.domain.entities.mx.BranchAndFinancialInstitutionIdentification8;
import com.backend.domain.entities.mx.BranchData5;

public class Field54BMapper {

    // Map Field54BType to an existing BranchAndFinancialInstitutionIdentification8 instance
    public static void mapField54BToBranchAndFinInstId(Field54BType field54B, BranchAndFinancialInstitutionIdentification8 branchAndFinInstId) {
        // If partyIdentifier is present, map it to the BranchData5 object
        if (field54B.getPartyIdentifier() != null && !field54B.getPartyIdentifier().isEmpty()) {
            BranchData5 branchData = new BranchData5();
            branchData.setId(field54B.getPartyIdentifier()); // Set the partyIdentifier as the branch ID

            // If location is present, set it as the branch name
            if (field54B.getLocation() != null && !field54B.getLocation().isEmpty()) {
                branchData.setNm(field54B.getLocation());
            }

            branchAndFinInstId.setBrnchId(branchData); // Assign the branch data to the BranchAndFinancialInstitutionIdentification8 instance
        }
    }
}
