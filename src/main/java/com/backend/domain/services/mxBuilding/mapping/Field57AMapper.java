package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field57AType;
import com.backend.domain.entities.mx.BranchAndFinancialInstitutionIdentification8;
import com.backend.domain.entities.mx.BranchData5;
import com.backend.domain.entities.mx.FinancialInstitutionIdentification23;


public class Field57AMapper {

    public static void mapField57AToBranchAndFinInstId(Field57AType field57A, BranchAndFinancialInstitutionIdentification8 branchAndFinInstId) {
        // Initialize FinancialInstitutionIdentification23 if it's null
        if (branchAndFinInstId.getFinInstnId() == null) {
            FinancialInstitutionIdentification23 finInstnId = new FinancialInstitutionIdentification23();
            branchAndFinInstId.setFinInstnId(finInstnId);
            System.out.println("Initialized Financial Institution Identification.");
        }

        // Set the identifierCode (BICFI) in the existing BranchAndFinancialInstitutionIdentification8 instance
        if (field57A.getPartyIdentifier() != null) {
            branchAndFinInstId.getFinInstnId().setBICFI(field57A.getPartyIdentifier());
            System.out.println("Mapped BICFI: " + field57A.getPartyIdentifier());
        } else {
            System.out.println("Field57A IdentifierCode is null.");
        }

        // If partyIdentifier is present, map it to the BranchData5 object
        if (field57A.getPartyIdentifier() != null && !field57A.getPartyIdentifier().isEmpty()) {
            BranchData5 branchData = new BranchData5();
            branchData.setId(field57A.getPartyIdentifier());
            branchAndFinInstId.setBrnchId(branchData);
            System.out.println("Mapped PartyIdentifier to BranchData: " + field57A.getPartyIdentifier());
        } else {
            System.out.println("Field57A PartyIdentifier is null or empty.");
        }
    }
}
