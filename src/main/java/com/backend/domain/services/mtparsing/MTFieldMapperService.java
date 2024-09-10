package com.backend.domain.services.mtparsing;

import com.backend.domain.entities.mt.fields.Field23EType;
import com.backend.domain.entities.mt.fields.Field32AType;
import com.backend.domain.entities.mt.fields.Field33BType;
import com.backend.domain.entities.mx.ActiveOrHistoricCurrencyAndAmount;
import com.backend.domain.services.mxBuilding.mapping.Field32AMapper;
import com.backend.domain.services.mxBuilding.mapping.Field23EMapper;
import com.backend.domain.services.mxBuilding.mapping.Field33BMapper;
import com.backend.domain.entities.mx.GroupHeader113;
import org.springframework.stereotype.Service;

@Service

public class MTFieldMapperService {

    public void processMTMessage(String block4) {
        // Create instances of the field classes
        Field32AType field32A = new Field32AType();
        Field23EType field23E = new Field23EType();
        Field33BType field33B = new Field33BType();

        // Parse the block4 fields using the parsing methods inside their respective classes
        Field32AType parsedField32A = field32A.parse(extractFieldData(":32A:", block4));
        Field23EType parsedField23E = field23E.parse(extractFieldData(":23E:", block4));
        Field33BType parsedField33B = field33B.parse(extractFieldData(":33B:", block4));
        ActiveOrHistoricCurrencyAndAmount actOrHistoric = new ActiveOrHistoricCurrencyAndAmount();
        // Create GroupHeader113 object where fields will be mapped
        GroupHeader113 grpHdr = new GroupHeader113();

        // Check if each field is not null and map accordingly
        if (parsedField32A != null) {
            Field32AMapper.mapField32AtoGrpHdr(parsedField32A, grpHdr);
            System.out.println("Field32A mapped successfully.");
        }

        if (parsedField23E != null) {
            Field23EMapper.mapField23E(parsedField23E, grpHdr);
            System.out.println("Field23E mapped successfully.");
        }

        if (parsedField33B != null) {
            Field33BMapper.mapField33B(parsedField33B, actOrHistoric);
            System.out.println("Field33B mapped successfully.");
        }

        // grpHdr now contains the mapped fields for further processing
    }

    // Utility method to extract field data based on field identifier
    private String extractFieldData(String fieldIdentifier, String block4) {
        int startIndex = block4.indexOf(fieldIdentifier);
        if (startIndex != -1) {
            int endIndex = block4.indexOf("\\n", startIndex);
            if (endIndex == -1) {
                endIndex = block4.length();
            }
            return block4.substring(startIndex + fieldIdentifier.length(), endIndex).trim();
        }
        return null;
    }
}
