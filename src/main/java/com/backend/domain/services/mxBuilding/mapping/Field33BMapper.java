package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field33BType;
import com.backend.domain.entities.mx.ActiveOrHistoricCurrencyAndAmount;

public class Field33BMapper {
        public static void mapField33B(Field33BType field33 , ActiveOrHistoricCurrencyAndAmount actOrHistoric) {

            actOrHistoric.setValue(field33.getAmount());
            actOrHistoric.setCcy(field33.getCurrency());
        }
}
