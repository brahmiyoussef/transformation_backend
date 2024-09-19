package com.backend;

import com.backend.domain.entities.mx.CreditTransferTransaction64;
import com.backend.domain.entities.mx.FIToFICustomerCreditTransferV12;
import com.backend.domain.entities.mx.*;
import com.backend.domain.services.mxBuilding.PACS008XMLBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

@SpringBootApplication
public class BackendApplication {
    public static void main(String[] args) {
        PACS008XMLBuilder builder = new PACS008XMLBuilder();

        // Create Document object
        Document document = new Document();
        FIToFICustomerCreditTransferV12 fiToFICustomerCreditTransfer = new FIToFICustomerCreditTransferV12();
        GroupHeader113 groupHeader = new GroupHeader113();
        CreditTransferTransaction64 transaction = new CreditTransferTransaction64();
        PaymentIdentification13 paymentIdentification = new PaymentIdentification13();

        // Populate GroupHeader113
        groupHeader.setMsgId("MSGID12345");
        groupHeader.setCreDtTm("2024-09-18T15:51:14");
        groupHeader.setMsgDefIdr("pacs.008.001.02");  // Message definition identifier
        groupHeader.setNbOfTxs("1");  // Number of transactions


        // Set batch booking indicator


        // Set Interbank Settlement Amount
        ActiveCurrencyAndAmount interbankSettlementAmount = new ActiveCurrencyAndAmount();
        interbankSettlementAmount.setCcy("USD");
        interbankSettlementAmount.setValue(BigDecimal.valueOf(1000.50));

        // Set Interbank Settlement Date
        try {
            XMLGregorianCalendar intrBkSttlmDt = DatatypeFactory.newInstance().newXMLGregorianCalendar("2024-09-19");
            groupHeader.setIntrBkSttlmDt(intrBkSttlmDt);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }

        // Set Financial Institution and Settlement Info
        SettlementInstruction15 settlementInfo = new SettlementInstruction15();
        // Populate settlementInfo fields here if needed (e.g., SttlmMtd, SttlmAcct)

        // Set Instructing Agent and Instructed Agent
        groupHeader.setInstgAgt("DEUTDEFFXXX");  // Example BIC for instructing agent
        BranchAndFinancialInstitutionIdentification8 instdAgt = new BranchAndFinancialInstitutionIdentification8();
        FinancialInstitutionIdentification23 instdAgtFinInstn = new FinancialInstitutionIdentification23();
        instdAgtFinInstn.setBICFI("BARCGB22XXX");
        instdAgt.setFinInstnId(instdAgtFinInstn);

        // Populate PaymentIdentification
        paymentIdentification.setEndToEndId("E2EID12345");

        // Populate CreditTransferTransaction64
        transaction.setPmtId(paymentIdentification);
        transaction.setIntrBkSttlmAmt(interbankSettlementAmount);

        // Add transaction to FIToFICustomerCreditTransferV12
        fiToFICustomerCreditTransfer.getCdtTrfTxInf().add(transaction);

        // Set Group Header
        fiToFICustomerCreditTransfer.setGrpHdr(groupHeader);

        // Add FIToFICustomerCreditTransferV12 to Document
        document.setFIToFICstmrCdtTrf(fiToFICustomerCreditTransfer);

        // Build the XML
        builder.buildXML(document, "output.xml");
    }
}
