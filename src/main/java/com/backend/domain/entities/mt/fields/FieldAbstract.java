package com.backend.domain.entities.mt.fields;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface FieldAbstract {

    void populateFromMatcher(Matcher matcher);

    // Utility method to populate from a string
    default void parse(String input) {
        Pattern pattern = Pattern.compile(getRegex());
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            populateFromMatcher(matcher);
        } else {
            throw new IllegalArgumentException("Input string does not match the pattern.");
        }
    }

    String getRegex();
}