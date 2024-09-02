package com.backend.domain.services.mxBuilding.mapping;

import com.backend.domain.entities.mt.fields.Field70Type;
import com.backend.domain.entities.mx.RemittanceInformation22;

import java.util.ArrayList;
import java.util.List;

public class Field70Mapper {

        // Map Field70 to RemittanceInformation22
        public static void mapField70ToRmtInf(Field70Type field70, RemittanceInformation22 rmtInf) {


            // Initialize the RemittanceInformation22 object
            List<String> ustrdList = new ArrayList<>();

            // Map the narrative lines to unstructured remittance information
                ustrdList.addAll(field70.getNarrativeLine());


            rmtInf.setUstrd(ustrdList);


        }
}
