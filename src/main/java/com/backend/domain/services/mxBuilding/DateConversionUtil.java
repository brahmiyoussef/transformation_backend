package com.backend.domain.services.mxBuilding;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;

public class DateConversionUtil {

    public static XMLGregorianCalendar toXMLGregorianCalendar(Instant instant) {
        try {
            ZonedDateTime zonedDateTime = instant.atZone(ZoneOffset.UTC);
            GregorianCalendar gregorianCalendar = GregorianCalendar.from(zonedDateTime);
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
