package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field32AType;
import com.backend.domain.entities.mx.ActiveCurrencyAndAmount;
import com.backend.domain.entities.mx.GroupHeader113;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.GregorianCalendar;

public class Field32AMapper {

    // Map Field32A to GroupHeader113
    public static void mapField32AtoGrpHdr(Field32AType field32A, GroupHeader113 grpHdr) {
        // Mapper le montant du field 32A au TtlIntrBkSttlmAmt du grpHdr
        ActiveCurrencyAndAmount ttlIntrBkSttlmAmt = new ActiveCurrencyAndAmount();
        ttlIntrBkSttlmAmt.setCcy(field32A.getCurrency());

        // Convertir le montant en BigDecimal
        String amountStr = field32A.getAmount().replace(",", "");
        BigDecimal amount = new BigDecimal(amountStr);
        ttlIntrBkSttlmAmt.setValue(amount);

        // Assigner la valeur au montant
        grpHdr.setTtlIntrBkSttlmAmt(ttlIntrBkSttlmAmt);

        // Mapper la date du field 32A à IntrBkSttlmDt du grpHdr
        try {
            XMLGregorianCalendar date = convertToXMLGregorianCalendar(field32A.getDate());
            grpHdr.setIntrBkSttlmDt(date);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
    }

    // Convertit une date en format "YYMMDD" en XMLGregorianCalendar
    private static XMLGregorianCalendar convertToXMLGregorianCalendar(String dateStr) throws DatatypeConfigurationException {
        int year = Integer.parseInt("20" + dateStr.substring(0, 2));
        int month = Integer.parseInt(dateStr.substring(2, 4));
        int day = Integer.parseInt(dateStr.substring(4, 6));

        GregorianCalendar gregorianCalendar = new GregorianCalendar(year, month - 1, day); // Les mois sont indexés de 0 à 11
        return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
    }
}
