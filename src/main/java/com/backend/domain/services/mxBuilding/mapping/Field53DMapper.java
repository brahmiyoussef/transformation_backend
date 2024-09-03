package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field53DType;
import com.backend.domain.entities.mx.BranchAndFinancialInstitutionIdentification8;
import com.backend.domain.entities.mx.BranchData5;

public class Field53DMapper {

    // Map Field53DType to an existing BranchAndFinancialInstitutionIdentification8 instance
    public static void mapField53DToBranchAndFinInstId(Field53DType field53D, BranchAndFinancialInstitutionIdentification8 branchAndFinInstId) {
        // If partyIdentifier is present, map it to the BranchData5 object
        if (field53D.getPartyIdentifier() != null && !field53D.getPartyIdentifier().isEmpty()) {
            BranchData5 branchData = new BranchData5();
            branchData.setId(field53D.getPartyIdentifier()); // Set the partyIdentifier as the branch ID
            branchAndFinInstId.setBrnchId(branchData); // Assign the branch data to the BranchAndFinancialInstitutionIdentification8 instance
        }

        // If numberAddress is present, map it to the BranchData5 object
        if (field53D.getnumberAddress() != null && !field53D.getnumberAddress().isEmpty()) {
            // If branchData is already set, update it; otherwise, create a new instance
            BranchData5 branchData = branchAndFinInstId.getBrnchId() != null
                    ? branchAndFinInstId.getBrnchId()
                    : new BranchData5();

            branchData.setNm(field53D.getnumberAddress()); // Set the numberAddress as the branch name
            branchAndFinInstId.setBrnchId(branchData); // Assign the branch data to the BranchAndFinancialInstitutionIdentification8 instance
        }
    }
}
