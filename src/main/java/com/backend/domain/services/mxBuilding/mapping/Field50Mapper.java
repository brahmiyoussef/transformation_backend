package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field50AType;
import com.backend.domain.entities.mt.fields.Field50FType;
import com.backend.domain.entities.mt.fields.Field50KType;
import com.backend.domain.entities.mx.TaxParty1;

public class Field50Mapper {

    public static void mapField50F(Field50FType field50F , TaxParty1 cdtr)
    {
        cdtr.setTaxId(field50F.getCodePart() );
    }


public static void mapField50A(Field50AType field50A, TaxParty1 cdtr) {
    if (field50A.getIdentifierCode() != null) {
        cdtr.setTaxId(field50A.getIdentifierCode());
        System.out.println("Good: IdentifierCode in Field50A is not null.");
    } else {
        System.out.println("Warning: IdentifierCode in Field50A is null.");
    }
}

    public static void mapField50K(Field50KType field50K , TaxParty1 cdtr)
    {
        cdtr.setTaxTp(field50K.getAccount());
    }

}