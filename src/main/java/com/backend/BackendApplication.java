package com.backend;

import com.backend.domain.entities.mx.*;
import com.backend.domain.services.mxBuilding.PACS008XMLBuilder;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class BackendApplication {
    public static void main(String[] args) {
        PACS008XMLBuilder builder = new PACS008XMLBuilder();

        // Créer l'objet Document
        Document document = new Document();
        FIToFICustomerCreditTransferV12 fiToFICustomerCreditTransfer = new FIToFICustomerCreditTransferV12();
        GroupHeader113 groupHeader = new GroupHeader113();
        CreditTransferTransaction64 transaction = new CreditTransferTransaction64();
        PaymentIdentification13 paymentIdentification = new PaymentIdentification13();

        // Remplir le GroupHeader113
        groupHeader.setMsgId("MSGID12345");
        groupHeader.setCreDtTm("2024-09-18T15:51:14");
        groupHeader.setMsgDefIdr("pacs.008.001.02");
        groupHeader.setNbOfTxs("1");

        // Montant de règlement interbancaire
        ActiveCurrencyAndAmount interbankSettlementAmount = new ActiveCurrencyAndAmount();
        interbankSettlementAmount.setCcy("USD");
        interbankSettlementAmount.setValue(BigDecimal.valueOf(1000.50));

        // Date de règlement interbancaire
        XMLGregorianCalendar intrBkSttlmDt = null;
        try {
            intrBkSttlmDt = DatatypeFactory.newInstance().newXMLGregorianCalendar("2024-09-19");
            groupHeader.setIntrBkSttlmDt(intrBkSttlmDt);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }

        // Agent instructeur
        groupHeader.setInstgAgt("DEUTDEFFXXX");

        // Remplir l'identification de paiement
        paymentIdentification.setEndToEndId("E2EID12345");

        // Remplir la transaction de virement
        transaction.setPmtId(paymentIdentification);
        transaction.setIntrBkSttlmAmt(interbankSettlementAmount);
        transaction.setIntrBkSttlmDt(intrBkSttlmDt);

        // Ajouter la transaction à FIToFICustomerCreditTransferV12
        List<CreditTransferTransaction64> transactions = new ArrayList<>();
        transactions.add(transaction);
        fiToFICustomerCreditTransfer.setCdtTrfTxInf(transactions);

        // Définir l'en-tête de groupe
        fiToFICustomerCreditTransfer.setGrpHdr(groupHeader);

        // Ajouter FIToFICustomerCreditTransferV12 au Document
        document.setFIToFICstmrCdtTrf(fiToFICustomerCreditTransfer);

        // Construire le XML
        builder.buildXML(document, "output.xml");
    }
}
