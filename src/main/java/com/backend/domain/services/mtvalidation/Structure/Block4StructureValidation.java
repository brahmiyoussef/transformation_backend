package com.backend.domain.services.mtvalidation.Structure;

import com.backend.domain.entities.mt.blocks.Block4;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Block4StructureValidation {

    private static final Logger LOGGER = Logger.getLogger(Block4StructureValidation.class.getName());

    // List of mandatory fields by their getter method names
    private static final List<String> MANDATORY_FIELDS = Arrays.asList(
            "getField20", "getField23B", "getField32A", "getField50A", "getField59A", "getField71A"
    );

    public boolean validateBlock4Structure(Block4 block4) {
        for (String methodName : MANDATORY_FIELDS) {
            try {
                Method method = Block4.class.getMethod(methodName);
                Object value = method.invoke(block4);

                if (value == null || (value instanceof String && ((String) value).isEmpty())) {
                    LOGGER.warning(methodName.replace("get", "") + " is required but missing or empty in Block4");
                    return false;
                }
            } catch (Exception e) {
                LOGGER.severe("Error accessing " + methodName + ": " + e.getMessage());
                return false;
            }
        }
        return true;
    }
}
