package com.backend.domain.services.mtvalidation.Structure;

import com.backend.domain.entities.mt.blocks.Block3Type;
import com.backend.domain.services.mtvalidation.Fields.Block3FieldsValidation;

public class Block3StructureValidation {

    public static boolean validateBlock3Structure(Block3Type block3) {

        // Check that either Tag103 (for FINCopy) or Tag121 must be present
        if (block3.getTag103ServiceIdentifier() == null && block3.getTag121UniqueEndToEndTransactionReference() == null) {
            System.out.println("Either Tag103 or Tag121 must be present");
            return false;
        }

        // Ensure Tag111 can only be present if Tag121 is also present
        if (block3.getTag111ServiceTypeIdentifier() != null && block3.getTag121UniqueEndToEndTransactionReference() == null) {
            System.out.println("Tag111 requires Tag121 to be present");
            return false;
        }

        // Tag121 can be present without Tag111, but not vice versa
        if (block3.getTag121UniqueEndToEndTransactionReference() != null && block3.getTag111ServiceTypeIdentifier() == null) {
            // This is valid, so no action is needed here
        }

        // Additional structure checks if needed

        return true;  // Return true if all checks pass
    }
}
