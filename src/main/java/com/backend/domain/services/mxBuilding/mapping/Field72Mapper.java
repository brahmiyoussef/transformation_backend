package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field72Type;
import com.backend.domain.entities.mx.SupplementaryData1;
import com.backend.domain.entities.mx.SupplementaryDataEnvelope1;

import java.util.List;

public class Field72Mapper {

    public static void mapField72ToSplmtryData(Field72Type field72, SupplementaryData1 splmtryData) {
        // Set PlcAndNm in SupplementaryData1
        splmtryData.setPlcAndNm(field72.getCode());

        // Create and populate the envelope with narrative lines
        SupplementaryDataEnvelope1 envelope = new SupplementaryDataEnvelope1();

        // Combine narrative lines into a single string
        List<String> narrativeLines = field72.getNarrative();
        StringBuilder narrativeBuilder = new StringBuilder();
        for (int i = 0; i < narrativeLines.size(); i++) {
            if (i > 0) {
                narrativeBuilder.append("\n");
            }
            narrativeBuilder.append(narrativeLines.get(i));
        }
        // Set the combined narrative as the envelope's content
        envelope.setAny(narrativeBuilder.toString());

        // Set the envelope in SupplementaryData1
        splmtryData.setEnvlp(envelope);
    }
}
