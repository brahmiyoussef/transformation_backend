package com.backend.domain.services.mtvalidation.Fields;

import com.backend.domain.entities.mt.blocks.Block3Type;
import com.backend.domain.services.mtparsing.BlockExtractor;

import java.util.Map;
import java.util.regex.Pattern;

public class Block3FieldsValidation {

    // Patterns for each tag field
    private static final Pattern PATTERN_TAG_103 = Pattern.compile("^[A-Z]{3}$");  // Tag 103: 3 alphabetic characters
    private static final Pattern PATTERN_TAG_113 = Pattern.compile("^[\\w\\s]{4}$");  // Tag 113: 4 alphanumeric/spaces
    private static final Pattern PATTERN_TAG_108 = Pattern.compile("^\\w{16}$");  // Tag 108: 16 alphanumeric
    private static final Pattern PATTERN_TAG_119 = Pattern.compile("^\\w{8}$");  // Tag 119: 8 characters
    private static final Pattern PATTERN_TAG_423 = Pattern.compile("^\\d{6}\\d{6}(\\d{2})?$");  // Tag 423: Date+Time
    private static final Pattern PATTERN_TAG_106 = Pattern.compile("^\\d{6}[A-Z]{4}[A-Z]{2}\\w{4}\\d{4}\\d{6}$");  // Tag 106
    private static final Pattern PATTERN_TAG_424 = Pattern.compile("^.{1,16}$");  // Tag 424: 16 characters
    private static final Pattern PATTERN_TAG_111 = Pattern.compile("^\\d{3}$");  // Tag 111: 3 digits
    private static final Pattern PATTERN_TAG_121 = Pattern.compile("^[a-f0-9]{8}-[a-f0-9]{4}-4[a-f0-9]{3}-[89ab][a-f0-9]{3}-[a-f0-9]{12}$");  // Tag 121: UUID pattern
    private static final Pattern PATTERN_TAG_115 = Pattern.compile("^\\w{1,32}$");  // Tag 115: 32 characters
    private static final Pattern PATTERN_TAG_165 = Pattern.compile("^/\\w{3}/.{1,34}$");  // Tag 165: /3!c/34x
    private static final Pattern PATTERN_TAG_433 = Pattern.compile("^/\\w{3}/.{0,20}$");  // Tag 433
    private static final Pattern PATTERN_TAG_434 = Pattern.compile("^/\\w{3}/.{0,20}$");  // Tag 434

    public boolean validateAllBlock3Fields(Block3Type block3) {
        // Assuming Block3Type has a method to get block content as a String
        String block3Content = block3.getContent(); // Replace with the correct method to extract the content

        // Pass the block content as a string to BlockExtractor
        Map<String, String> fields = BlockExtractor.extractFields(block3Content);

        // Validate each field
        for (Map.Entry<String, String> field : fields.entrySet()) {
            if (!validateField(field.getKey(), field.getValue())) {
                return false;  // Return false if any field fails validation
            }
        }
        return true;  // Return true if all fields are valid
    }


    // Validate each field in Block 3
    public  boolean validateField(String tag, String value) {
        switch (tag) {
            case "103":
                return PATTERN_TAG_103.matcher(value).matches();
            case "113":
                return PATTERN_TAG_113.matcher(value).matches();
            case "108":
                return PATTERN_TAG_108.matcher(value).matches();
            case "119":
                return PATTERN_TAG_119.matcher(value).matches();
            case "423":
                return PATTERN_TAG_423.matcher(value).matches();
            case "106":
                return PATTERN_TAG_106.matcher(value).matches();
            case "424":
                return PATTERN_TAG_424.matcher(value).matches();
            case "111":
                return PATTERN_TAG_111.matcher(value).matches();
            case "121":
                return PATTERN_TAG_121.matcher(value).matches();
            case "115":
                return PATTERN_TAG_115.matcher(value).matches();
            case "165":
                return PATTERN_TAG_165.matcher(value).matches();
            case "433":
                return PATTERN_TAG_433.matcher(value).matches();
            case "434":
                return PATTERN_TAG_434.matcher(value).matches();
            default:
                System.out.println("Unrecognized tag: " + tag);
                return false;  // Tag not recognized
        }
    }
}
