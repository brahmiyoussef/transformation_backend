package com.backend.domain.services.mtvalidation.Fields;

import com.backend.domain.entities.mt.blocks.Block4;
import com.backend.domain.entities.mt.fields.*;


import java.util.logging.Logger;
import java.util.regex.Pattern;

public class Block4FieldsValidation {

    private final Field13CValidator field13CValidator;
    private final Field23EValidator field23ECValidator;
    private final Field32AValidator field32AValidator;
    private final Field33BValidator field33BValidator;
    private final Field50AValidator field50AValidator;
    private final Field50FValidator field50FValidator;
    private final Field50KValidator field50KValidator;
    private final Field51AValidator field51AValidator;
    private final Field52AValidator field52AValidator;
    private final Field52DValidator field52DValidator;
    private final Field53AValidator field53AValidator;
    private final Field53BValidator field53BValidator;
    private final Field53DValidator field53DValidator;
    private final Field54AValidator field54AValidator;
    private final Field54BValidator field54BValidator;
    private final Field54DValidator field54DValidator;
    private final Field55AValidator field55AValidator;
    private final Field55BValidator field55BValidator;
    private final Field55DValidator field55DValidator;
    private final Field56AValidator field56AValidator;
    private final Field56CValidator field56CValidator;
    private final Field56DValidator field56DValidator;
    private final Field57AValidator field57AValidator;
    private final Field57BValidator field57BValidator;
    private final Field57CValidator field57CValidator;
    private final Field57DValidator field57DValidator;
    private final Field59AValidator field59AValidator;
    private final Field59FValidator field59FValidator;
    private final Field59Validator field59Validator;
    private final Field70Validator field70Validator;
    private final Field71FValidator field71FValidator;
    private final Field71GValidator field71GValidator;
    private final Field72Validator field72Validator;
    private final Field77BValidator field77BValidator;



    private static final Logger LOGGER = Logger.getLogger(Block4FieldsValidation.class.getName());

    public Block4FieldsValidation() {
        this.field13CValidator = new Field13CValidator();
        this.field23ECValidator = new Field23EValidator();
        this.field32AValidator = new Field32AValidator();
        this.field33BValidator = new Field33BValidator();
        this.field50AValidator = new Field50AValidator();
        this.field50FValidator = new Field50FValidator();
        this.field50KValidator = new Field50KValidator();
        this.field51AValidator = new Field51AValidator();
        this.field52AValidator = new Field52AValidator();
        this.field52DValidator = new Field52DValidator();
        this.field53AValidator = new Field53AValidator();
        this.field53BValidator = new Field53BValidator();
        this.field53DValidator = new Field53DValidator();
        this.field54AValidator = new Field54AValidator();
        this.field54BValidator = new Field54BValidator();
        this.field54DValidator = new Field54DValidator();
        this.field55AValidator = new Field55AValidator();
        this.field55BValidator = new Field55BValidator();
        this.field55DValidator = new Field55DValidator();
        this.field56AValidator = new Field56AValidator();
        this.field56CValidator = new Field56CValidator();
        this.field56DValidator = new Field56DValidator();
        this.field57AValidator = new Field57AValidator();
        this.field57BValidator = new Field57BValidator();
        this.field57CValidator = new Field57CValidator();
        this.field57DValidator = new Field57DValidator();
        this.field59AValidator = new Field59AValidator();
        this.field59FValidator = new Field59FValidator();
        this.field59Validator = new Field59Validator();
        this.field70Validator = new Field70Validator();
        this.field71FValidator = new Field71FValidator();
        this.field71GValidator = new Field71GValidator();
        this.field72Validator = new Field72Validator();
        this.field77BValidator = new Field77BValidator();
    }

    public boolean validateBlock4Field13C(Field13CType field13C) {
        return field13CValidator.validateField13C(field13C);
    }

    public boolean validateBlock4Field23E(Field23EType field23E) {
        return field23ECValidator.validateField23E(field23E);
    }

    public boolean validateBlock4Field32A(Field32AType field32A) {
        return field32AValidator.validateField32A(field32A);
    }

    public boolean validateBlock4Field33B(Field33BType field33B) {
        return field33BValidator.validateField33B(field33B);
    }

    public boolean validateBlock4Field50A(Field50AType field50A) {
        return field50AValidator.validateField50A(field50A);
    }

    public boolean validateBlock4Field50F(Field50FType field50F) {
        return field50FValidator.validateField50F(field50F);
    }

    public boolean validateBlock4Field50K(Field50KType field50K) {
        return field50KValidator.validateField50K(field50K);
    }

    public boolean validateBlock4Field51A(Field51AType field51A) {
        return field51AValidator.validateField51A(field51A);
    }

    public boolean validateBlock4Field52A(Field52AType field52A) {
        return field52AValidator.validateField52A(field52A);
    }

    public boolean validateBlock4Field52D(Field52DType field52D) {
        return field52DValidator.validateField52D(field52D);
    }

    public boolean validateBlock4Field53A(Field53AType field53A) {
        return field53AValidator.validateField53A(field53A);
    }

    public boolean validateBlock4Field53B(Field53BType field53B) {
        return field53BValidator.validateField53B(field53B);
    }

    public boolean validateBlock4Field53D(Field53DType field53D) {
        return field53DValidator.validateField53D(field53D);
    }

    public boolean validateBlock4Field54A(Field54AType field54A) {
        return field54AValidator.validateField54A(field54A);
    }

    public boolean validateBlock4Field54B(Field54BType field54B) {
        return field54BValidator.validateField54B(field54B);
    }

    public boolean validateBlock4Field54D(Field54DType field54D) {
        return field54DValidator.validateField54D(field54D);
    }

    public boolean validateBlock4Field55A(Field55AType field55A) {
        return field55AValidator.validateField55A(field55A);
    }

    public boolean validateBlock4Field55B(Field55BType field55B) {
        return field55BValidator.validateField55B(field55B);
    }

    public boolean validateBlock4Field55D(Field55DType field55D) {
        return field55DValidator.validateField55D(field55D);
    }

    public boolean validateBlock4Field56A(Field56AType field56A) {
        return field56AValidator.validateField56A(field56A);
    }

    public boolean validateBlock4Field56C(Field56CType field56C) {
        return field56CValidator.validateField56C(String.valueOf(field56C));
    }

    public boolean validateBlock4Field56D(Field56DType field56D) {
        return field56DValidator.validateField56D(field56D);
    }

    public boolean validateBlock4Field57A(Field57AType field57A) {
        return field57AValidator.validateField57A(field57A);
    }

    public boolean validateBlock4Field57B(Field57BType field57B) {
        return field57BValidator.validateField57B(field57B);
    }

    public boolean validateBlock4Field57C(Field57CType field57C) {
        return field57CValidator.validateField57C(String.valueOf(field57C));
    }

    public boolean validateBlock4Field57D(Field57DType field57D) {
        return field57DValidator.validateField57D(field57D);
    }

    public boolean validateBlock4Field59A(Field59AType field59A) {
        return field59AValidator.validateField59A(field59A);
    }

    public boolean validateBlock4Field59F(Field59FType field59F) {
        return field59FValidator.validateField59F(field59F);
    }

    public boolean validateBlock4Field59(Field59Type field59) {
        return field59Validator.validateField59(field59);
    }

    public boolean validateBlock4Field70(Field70Type field70) {
        return field70Validator.validateField70(field70);
    }

    public boolean validateBlock4Field71F(Field71FType field71) {
        return field71FValidator.validateField71F(field71);
    }

    public boolean validateBlock4Field71G(Field71GType field71G) {
        return field71GValidator.validateField71G(field71G);
    }

    public boolean validateBlock4Field72(String field72) {
        return field72Validator.validateField72(field72);
    }

    public boolean validateBlock4Field77B(String field77B) {
        return field77BValidator.validateField77B(field77B);
    }
    public boolean validateAllBlock4Fields(Block4 block4) {
        boolean isValid = true;
        StringBuilder errorMessages = new StringBuilder();

        // Validate each field
        if (block4.getField13C() != null && !validateBlock4Field13C(block4.getField13C())) {
            isValid = false;
            errorMessages.append("Field 13C is invalid. ");
        }

        if (block4.getField23E() != null && !validateBlock4Field23E(block4.getField23E())) {
            isValid = false;
            errorMessages.append("Field 23E is invalid. ");
        }

        if (block4.getField32A() != null && !validateBlock4Field32A(block4.getField32A())) {
            isValid = false;
            errorMessages.append("Field 32A is invalid. ");
        }

        if (block4.getField33B() != null && !validateBlock4Field33B(block4.getField33B())) {
            isValid = false;
            errorMessages.append("Field 33B is invalid. ");
        }

        if (block4.getField50A() != null && !validateBlock4Field50A(block4.getField50A())) {
            isValid = false;
            errorMessages.append("Field 50A is invalid. ");
        }

        if (block4.getField50F() != null && !validateBlock4Field50F(block4.getField50F())) {
            isValid = false;
            errorMessages.append("Field 50F is invalid. ");
        }

        if (block4.getField50K() != null && !validateBlock4Field50K(block4.getField50K())) {
            isValid = false;
            errorMessages.append("Field 50K is invalid. ");
        }

        if (block4.getField51A() != null && !validateBlock4Field51A(block4.getField51A())) {
            isValid = false;
            errorMessages.append("Field 51A is invalid. ");
        }

        if (block4.getField52A() != null && !validateBlock4Field52A(block4.getField52A())) {
            isValid = false;
            errorMessages.append("Field 52A is invalid. ");
        }

        if (block4.getField52D() != null && !validateBlock4Field52D(block4.getField52D())) {
            isValid = false;
            errorMessages.append("Field 52D is invalid. ");
        }

        if (block4.getField53A() != null && !validateBlock4Field53A(block4.getField53A())) {
            isValid = false;
            errorMessages.append("Field 53A is invalid. ");
        }

        if (block4.getField53B() != null && !validateBlock4Field53B(block4.getField53B())) {
            isValid = false;
            errorMessages.append("Field 53B is invalid. ");
        }

        if (block4.getField53D() != null && !validateBlock4Field53D(block4.getField53D())) {
            isValid = false;
            errorMessages.append("Field 53D is invalid. ");
        }

        if (block4.getField54A() != null && !validateBlock4Field54A(block4.getField54A())) {
            isValid = false;
            errorMessages.append("Field 54A is invalid. ");
        }

        if (block4.getField54B() != null && !validateBlock4Field54B(block4.getField54B())) {
            isValid = false;
            errorMessages.append("Field 54B is invalid. ");
        }

        if (block4.getField54D() != null && !validateBlock4Field54D(block4.getField54D())) {
            isValid = false;
            errorMessages.append("Field 54D is invalid. ");
        }

        if (block4.getField55A() != null && !validateBlock4Field55A(block4.getField55A())) {
            isValid = false;
            errorMessages.append("Field 55A is invalid. ");
        }

        if (block4.getField55B() != null && !validateBlock4Field55B(block4.getField55B())) {
            isValid = false;
            errorMessages.append("Field 55B is invalid. ");
        }

        if (block4.getField55D() != null && !validateBlock4Field55D(block4.getField55D())) {
            isValid = false;
            errorMessages.append("Field 55D is invalid. ");
        }

        if (block4.getField56A() != null && !validateBlock4Field56A(block4.getField56A())) {
            isValid = false;
            errorMessages.append("Field 56A is invalid. ");
        }

        if (block4.getField56C() != null && !validateBlock4Field56C(block4.getField56C())) {
            isValid = false;
            errorMessages.append("Field 56C is invalid. ");
        }

        if (block4.getField56D() != null && !validateBlock4Field56D(block4.getField56D())) {
            isValid = false;
            errorMessages.append("Field 56D is invalid. ");
        }

        if (block4.getField57A() != null && !validateBlock4Field57A(block4.getField57A())) {
            isValid = false;
            errorMessages.append("Field 57A is invalid. ");
        }

        if (block4.getField57B() != null && !validateBlock4Field57B(block4.getField57B())) {
            isValid = false;
            errorMessages.append("Field 57B is invalid. ");
        }

        if (block4.getField57C() != null && !validateBlock4Field57C(block4.getField57C())) {
            isValid = false;
            errorMessages.append("Field 57C is invalid. ");
        }

        if (block4.getField57D() != null && !validateBlock4Field57D(block4.getField57D())) {
            isValid = false;
            errorMessages.append("Field 57D is invalid. ");
        }

        if (block4.getField59A() != null && !validateBlock4Field59A(block4.getField59A())) {
            isValid = false;
            errorMessages.append("Field 59A is invalid. ");
        }

        if (block4.getField59F() != null && !validateBlock4Field59F(block4.getField59F())) {
            isValid = false;
            errorMessages.append("Field 59F is invalid. ");
        }

        if (block4.getField59() != null && !validateBlock4Field59(block4.getField59())) {
            isValid = false;
            errorMessages.append("Field 59 is invalid. ");
        }

        if (block4.getField70() != null && !validateBlock4Field70(block4.getField70())) {
            isValid = false;
            errorMessages.append("Field 70 is invalid. ");
        }

        if (block4.getField71F() != null && !validateBlock4Field71F(block4.getField71F())) {
            isValid = false;
            errorMessages.append("Field 71F is invalid. ");
        }

        if (block4.getField71G() != null && !validateBlock4Field71G(block4.getField71G())) {
            isValid = false;
            errorMessages.append("Field 71G is invalid. ");
        }

        if (block4.getField72() != null && !validateBlock4Field72(block4.getField72())) {
            isValid = false;
            errorMessages.append("Field 72 is invalid. ");
        }

        if (block4.getField77B() != null && !validateBlock4Field77B(block4.getField77B())) {
            isValid = false;
            errorMessages.append("Field 77B is invalid. ");
        }

        if (!isValid) {
            LOGGER.warning("Block 4 validation failed: " + errorMessages.toString());
        }

        return isValid;
    }
}
