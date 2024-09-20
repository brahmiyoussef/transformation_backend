package com.backend.domain.services.mtvalidation.Fields;

import com.backend.domain.entities.mt.fields.Field13CType;

import java.util.regex.Pattern;
import java.util.logging.Logger;

public class Field13CValidator  {

    private static final Logger LOGGER = Logger.getLogger(Field13CValidator.class.getName());

    public boolean validateField13C(Field13CType field13C) {
        if (field13C == null) {
            LOGGER.warning("Field13C is null");
            return false;
        }

        // Validate the Code (8 alphanumeric characters)
        if (field13C.getCode() == null || !Pattern.matches("[A-Za-z0-9]{8}", field13C.getCode())) {
            LOGGER.warning("Invalid Field13C code. Must be 8 alphanumeric characters.");
            return false;
        }

        // Validate the Time Indication (HHMM format)
        if (field13C.getTimeIndication() == null || !Pattern.matches("\\d{4}", field13C.getTimeIndication())) {
            LOGGER.warning("Invalid Field13C timeIndication. Must be in HHMM format.");
            return false;
        }

        int hour = Integer.parseInt(field13C.getTimeIndication().substring(0, 2));
        int minute = Integer.parseInt(field13C.getTimeIndication().substring(2, 4));
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            LOGGER.warning("Invalid Time Indication: Hour must be 00-23 and Minute must be 00-59.");
            return false;
        }

        // Validate the Sign (must be a single character)
        if (field13C.getSign() == null || !Pattern.matches("[+\\-]", field13C.getSign())) {
            LOGGER.warning("Invalid Field13C sign. Must be '+' or '-'.");
            return false;
        }

        // Validate the Time Offset (+HHMM or -HHMM, where HH is 00-13 and MM is 00-59)
        if (field13C.getTimeOffset() == null || !Pattern.matches("[+-]\\d{4}", field13C.getTimeOffset())) {
            LOGGER.warning("Invalid Field13C timeOffset. Must be in format +HHMM or -HHMM.");
            return false;
        }

        int offsetHour = Integer.parseInt(field13C.getTimeOffset().substring(1, 3));
        int offsetMinute = Integer.parseInt(field13C.getTimeOffset().substring(3, 5));
        if (offsetHour < 0 || offsetHour > 13 || offsetMinute < 0 || offsetMinute > 59) {
            LOGGER.warning("Invalid Time Offset: Hour must be 00-13 and Minute must be 00-59.");
            return false;
        }

        return true;
    }
}
