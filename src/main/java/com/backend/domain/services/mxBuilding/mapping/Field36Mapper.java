package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field36Type;
import com.backend.domain.entities.mx.CreditTransferTransaction64;

public class Field36Mapper {

    public static void mapeField36(Field36Type field36, CreditTransferTransaction64 crdTrs) {

        crdTrs.setXchgRate(field36.getValue());

    }
}
