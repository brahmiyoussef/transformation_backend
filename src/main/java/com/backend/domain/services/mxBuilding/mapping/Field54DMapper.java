package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field54DType;
import com.backend.domain.entities.mx.BranchAndFinancialInstitutionIdentification8;
import com.backend.domain.entities.mx.BranchData5;

public class Field54DMapper {

    // Map Field54DType to an existing BranchAndFinancialInstitutionIdentification8 instance
    public static void mapField54DToBranchAndFinInstId(Field54DType field54D, BranchAndFinancialInstitutionIdentification8 branchAndFinInstId) {
        // If partyIdentifier is present, map it to the BranchData5 object
        if (field54D.getPartyIdentifier() != null && !field54D.getPartyIdentifier().isEmpty()) {
            BranchData5 branchData = new BranchData5();
            branchData.setId(field54D.getPartyIdentifier()); // Set the partyIdentifier as the branch ID
            branchAndFinInstId.setBrnchId(branchData); // Assign the branch data to the BranchAndFinancialInstitutionIdentification8 instance
        }

        // If numberAddress is present, map it as well
        if (field54D.getnumberAddress() != null && !field54D.getnumberAddress().isEmpty()) {
            BranchData5 branchData = branchAndFinInstId.getBrnchId() != null
                    ? branchAndFinInstId.getBrnchId()
                    : new BranchData5();

            branchData.setNm(field54D.getnumberAddress()); // Set the numberAddress as the branch name
            branchAndFinInstId.setBrnchId(branchData); // Assign the updated branch data
        }
    }
}
