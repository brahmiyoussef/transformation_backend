package com.backend.domain.services.mxBuilding;

import com.backend.domain.entities.mt.message.Message;
import com.backend.domain.entities.mx.*;
import com.backend.domain.services.mxBuilding.mapping.*;
import org.springframework.stereotype.Service;

@Service
public class MTtoMXMappingService {

    public Document mapMTtoMX(Message message) {
        GroupHeader113 groupHeader = new GroupHeader113();  // MX object for mapping
        Document document = new Document();

        CreditTransferTransaction64 crdTrs = new CreditTransferTransaction64();
        BranchAndFinancialInstitutionIdentification8 branchAndFinInstId = new BranchAndFinancialInstitutionIdentification8();
        FinancialInstitutionIdentification23 F23 = new FinancialInstitutionIdentification23();
        SupplementaryData1 splmtryData = new SupplementaryData1();
        ActiveOrHistoricCurrencyAndAmount actOrHistoric = new ActiveOrHistoricCurrencyAndAmount();
        TaxParty1 cdtr = new TaxParty1();
        branchAndFinInstId.setFinInstnId(F23);

        // Mapping fields from MT to MX
        // Check and map Field32A
        if (message.getBlock4() != null && message.getBlock4().getField32A() != null) {
            Field32AMapper.mapField32AtoGrpHdr(message.getBlock4().getField32A(), groupHeader);
            System.out.println("Mapped Field32A to GroupHeader: " + groupHeader.getTtlIntrBkSttlmAmt().getValue());
        }

        // Mapping Field33B
        if (message.getBlock4() != null && message.getBlock4().getField33B() != null) {
            Field33BMapper.mapField33B(message.getBlock4().getField33B(), actOrHistoric);
            System.out.println("Mapped Field33B : " + actOrHistoric.getValue());
        }

        // Mapping Field36
        if (message.getBlock4() != null && message.getBlock4().getField36() != null) {
            Field36Mapper.mapeField36(message.getBlock4().getField36(), crdTrs);
            System.out.println("Mapped Field36 to crdTrs: " + crdTrs.getXchgRate());
        } else {
            System.out.println("Field36 is null.");
        }

        // Mapping Field50A
        if (message.getBlock4() != null && message.getBlock4().getField50A() != null) {
            Field50Mapper.mapField50A(message.getBlock4().getField50A(), cdtr);
            System.out.println("Mapped Field50A to TaxParty1: " + cdtr.getTaxId());
        }

        // Mapping Field50F
        if (message.getBlock4() != null && message.getBlock4().getField50F() != null) {
            Field50Mapper.mapField50F(message.getBlock4().getField50F(), cdtr);
            System.out.println("Mapped Field50F to TaxParty1 : " + cdtr.getRegnId());
        }

        // Mapping Field51A
        if (message.getBlock4() != null && message.getBlock4().getField51A() != null) {
            Field51AMapper.mapField51AToBranchAndFinInstId(message.getBlock4().getField51A(), branchAndFinInstId);
            System.out.println("Mapped Field51A to branchAndFinInstId : " + branchAndFinInstId.getFinInstnId().getBICFI());
        }

        // Mapping Field52A
        if (message.getBlock4() != null && message.getBlock4().getField52A() != null) {
            Field52AMapper.mapField52AToBranchAndFinInstId(message.getBlock4().getField52A(), branchAndFinInstId);
            System.out.println("Mapped Field52A to branchAndFinInstId : " + branchAndFinInstId.getFinInstnId().getBICFI());
        }

        // Mapping Field56A
        if (message.getBlock4() != null && message.getBlock4().getField56A() != null) {
            Field56AMapper.mapField56AToBranchAndFinInstId(message.getBlock4().getField56A(), branchAndFinInstId);
            System.out.println("Mapped Field56A to crdTrs: " + branchAndFinInstId.getBrnchId().getId());
        }

        // Mapping Field71F
        if (message.getBlock4() != null && message.getBlock4().getField71F() != null) {
            Field71FMapper.mapeField71F(message.getBlock4().getField71F(), actOrHistoric);
            System.out.println("Mapped Field71F to actOrHistoric: " + actOrHistoric.getValue());
        }

        // Mapping Field72
        if (message.getBlock4() != null && message.getBlock4().getField72() != null) {
            Field72Mapper.mapField72ToSplmtryData(message.getBlock4().getField72(), splmtryData);
            System.out.println("Mapped Field72 to SplmtryData: " + splmtryData.getPlcAndNm());
        }

        // Set mapped objects into the Document
        FIToFICustomerCreditTransferV12 creditTransfer = new FIToFICustomerCreditTransferV12();
        creditTransfer.setGrpHdr(groupHeader);

        if (crdTrs != null && crdTrs.getXchgRate() != null) {
            creditTransfer.getCdtTrfTxInf().add(crdTrs);
            System.out.println("Added CreditTransferTransaction64 with exchange rate: " + crdTrs.getXchgRate());
        } else {
            System.out.println("Error: Credit Transfer Transaction or Exchange Rate is missing.");
        }

        // Add Supplementary Data
        if (splmtryData.getEnvlp() != null && splmtryData.getEnvlp().getAny() != null) {
            creditTransfer.getSplmtryData().add(splmtryData);
        } else {
            System.out.println("Error: Supplementary Data is missing.");
        }

        // Set the final document
        document.setFIToFICstmrCdtTrf(creditTransfer);

        // Log document details for verification
        System.out.println("CdtTrfTxInf size: " + creditTransfer.getCdtTrfTxInf().size());
        System.out.println("SplmtryData size: " + creditTransfer.getSplmtryData().size());

        return document;
    }

}
