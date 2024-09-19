package com.backend.domain.services.mxBuilding;

import com.backend.domain.entities.mx.Document;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
@Service
public class PACS008XMLBuilder {

    public void buildXML(Document pacs008Document, String outputPath) {
        try {
            JAXBContext context = JAXBContext.newInstance(Document.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(pacs008Document, new File(outputPath));
            marshaller.marshal(pacs008Document, System.out);
            marshaller.setEventHandler(new javax.xml.bind.helpers.DefaultValidationEventHandler());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
