package com.backend;

import com.backend.domain.entities.mt.fields.Field59AType;
import com.backend.domain.entities.mx.BranchAndFinancialInstitutionIdentification8;
import com.backend.domain.entities.mx.BranchData5;
import com.backend.domain.entities.mx.FinancialInstitutionIdentification23;
import com.backend.domain.services.mxBuilding.mapping.Field59AMapper;

public class BackendApplication {

    public static void main(String[] args) {
        // Initialize a Field59AType object with test data
        Field59AType field59A = new Field59AType();
        field59A.setAccount("1234567890");  // Set the account
        field59A.setIdentifierCode("BANKUS33XXX");  // Set the identifier code

        // Create an instance of BranchAndFinancialInstitutionIdentification8 to map to
        BranchAndFinancialInstitutionIdentification8 branchAndFinInstId = new BranchAndFinancialInstitutionIdentification8();

        // Initialize the FinInstnId object inside BranchAndFinancialInstitutionIdentification8
        if (branchAndFinInstId.getFinInstnId() == null) {
            // Initialize FinancialInstitutionIdentification23 indirectly (or as needed by the implementation)
            branchAndFinInstId.setFinInstnId(new FinancialInstitutionIdentification23());
        }

        // Map Field59AType to BranchAndFinancialInstitutionIdentification8
        Field59AMapper.mapField59AToBranchAndFinInstId(field59A, branchAndFinInstId);

        // Display Field59A mapping results
        System.out.println("Mapped Identifier Code (BICFI): " +
                (branchAndFinInstId.getFinInstnId() != null ? branchAndFinInstId.getFinInstnId().getBICFI() : "Not defined"));

        // Display Branch Data mapping results
        System.out.println("Mapped Account (Branch ID): " +
                (branchAndFinInstId.getBrnchId() != null ? branchAndFinInstId.getBrnchId().getId() : "Not defined"));
    }
}
