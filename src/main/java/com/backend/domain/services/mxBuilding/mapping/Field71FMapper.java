package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field71FType;
import com.backend.domain.entities.mx.ActiveOrHistoricCurrencyAndAmount;
import com.backend.domain.entities.mx.Charges16;

public class Field71FMapper {

    public static void mapeField71F(Field71FType field71, ActiveOrHistoricCurrencyAndAmount actvCurrAmt)
    {
        actvCurrAmt.setValue(field71.getAmount());
        actvCurrAmt.setCcy(field71.getCurrency());

    }
}
