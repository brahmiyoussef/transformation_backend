package com.backend.domain.services.mxBuilding;

import com.backend.domain.entities.mt.message.Message;
import com.backend.domain.entities.mx.*;
import com.backend.domain.services.mxBuilding.mapping.*;
import org.springframework.stereotype.Service;

@Service
public class MTtoMXMappingService {

    public Document  mapMTtoMX(Message message) {
        GroupHeader113 groupHeader = new GroupHeader113();  // MX object for mapping
        Document document = new Document();

        CreditTransferTransaction64 crdTrs = new CreditTransferTransaction64();
        BranchAndFinancialInstitutionIdentification8 branchAndFinInstId = new BranchAndFinancialInstitutionIdentification8();
        FinancialInstitutionIdentification23 F23 = new FinancialInstitutionIdentification23();
        SupplementaryData1 splmtryData = new SupplementaryData1();
        ActiveOrHistoricCurrencyAndAmount actOrHistoric = new ActiveOrHistoricCurrencyAndAmount();
        TaxParty1 cdtr = new TaxParty1();
        branchAndFinInstId.setFinInstnId(F23);
        // Check and map Field32A
        if (message.getBlock4() != null && message.getBlock4().getField32A() != null) {
            Field32AMapper.mapField32AtoGrpHdr(message.getBlock4().getField32A(), groupHeader);
            System.out.println("Mapped Field32A to GroupHeader: " + groupHeader.getTtlIntrBkSttlmAmt().getValue());
        }
        if (message.getBlock4() != null && message.getBlock4().getField33B() != null) {
            Field33BMapper.mapField33B(message.getBlock4().getField33B(),actOrHistoric);
            System.out.println("Mapped Field33B : " + actOrHistoric.getValue());
        }
        if (message.getBlock4() != null && message.getBlock4().getField36() != null) {
            Field36Mapper.mapeField36(message.getBlock4().getField36() ,crdTrs);
            System.out.println("Mapped Field36 to crdTrs: " + crdTrs.getXchgRate());
        }else {
            System.out.println("Mapped Field36 is null");
        }
        if (message.getBlock4() != null && message.getBlock4().getField50A() != null) {
            System.out.println("Field50A Raw Value: " + message.getBlock4().getField50A().getIdentifierCode());
            Field50Mapper.mapField50A(message.getBlock4().getField50A(), cdtr);
            System.out.println("Mapped Field50A to TaxParty1: " + cdtr.getTaxId());
        } else {
            System.out.println("Field50A is null.");
        }
        if (message.getBlock4() != null && message.getBlock4().getField50F() != null) {
            Field50Mapper.mapField50F(message.getBlock4().getField50F(),cdtr);
            System.out.println("Mapped Field50F to TaxParty1 : " + cdtr.getRegnId());
        }
        if (message.getBlock4() != null && message.getBlock4().getField50K() != null) {
            Field50Mapper.mapField50K(message.getBlock4().getField50K(),cdtr);
            System.out.println("Mapped Field50k to TaxParty1 : " + cdtr.getTaxTp());
        }
        if (message.getBlock4() != null && message.getBlock4().getField51A() != null) {
            Field51AMapper.mapField51AToBranchAndFinInstId(message.getBlock4().getField51A(), branchAndFinInstId);
            System.out.println("Mapped Field51A to branchAndFinInstId : " + branchAndFinInstId.getFinInstnId().getBICFI());
        }
        if (message.getBlock4() != null && message.getBlock4().getField52A() != null) {
            Field52AMapper.mapField52AToBranchAndFinInstId(message.getBlock4().getField52A(), branchAndFinInstId);
            System.out.println("Mapped Field52A to branchAndFinInstId : " + branchAndFinInstId.getFinInstnId().getBICFI());
        }
        if (message.getBlock4() != null && message.getBlock4().getField52D() != null) {
            Field52DMapper.mapField52DToBranchAndFinInstId(message.getBlock4().getField52D(), branchAndFinInstId);
            System.out.println("Mapped Field52D to branchAndFinInstId : " + branchAndFinInstId.getFinInstnId().getBICFI());
        }

        if (message.getBlock4() != null && message.getBlock4().getField53A() != null) {
            Field53AMapper.mapField53AToBranchAndFinInstId(message.getBlock4().getField53A(), branchAndFinInstId);
            System.out.println("Mapped Field52A to branchAndFinInstId : " + branchAndFinInstId.getFinInstnId().getBICFI());
        }
        if (message.getBlock4() != null && message.getBlock4().getField53B() != null) {
            Field53BMapper.mapField53BToBranchAndFinInstId(message.getBlock4().getField53B(), branchAndFinInstId);
            System.out.println("Mapped Field53B to branchAndFinInstId : " + branchAndFinInstId.getFinInstnId().getBICFI());
        }
        if (message.getBlock4() != null && message.getBlock4().getField53A() != null) {
            Field53AMapper.mapField53AToBranchAndFinInstId(message.getBlock4().getField53A(), branchAndFinInstId);
            System.out.println("Mapped Field53A to branchAndFinInstId : " + branchAndFinInstId.getFinInstnId().getBICFI());
        }
        if (message.getBlock4() != null && message.getBlock4().getField53D() != null) {
            Field53DMapper.mapField53DToBranchAndFinInstId(message.getBlock4().getField53D(), branchAndFinInstId);
            System.out.println("Mapped Field53D to branchAndFinInstId : " + branchAndFinInstId.getFinInstnId().getBICFI());
        }
        if (message.getBlock4() != null && message.getBlock4().getField54A() != null) {
            Field54AMapper.mapField54AToBranchAndFinInstId(message.getBlock4().getField54A(), branchAndFinInstId);
            System.out.println("Mapped Field54A to branchAndFinInstId : " + branchAndFinInstId.getFinInstnId().getBICFI());
        }
        if (message.getBlock4() != null && message.getBlock4().getField54B() != null) {
            Field54BMapper.mapField54BToBranchAndFinInstId(message.getBlock4().getField54B(), branchAndFinInstId);
            System.out.println("Mapped Field54B to branchAndFinInstId : " + branchAndFinInstId.getFinInstnId().getBICFI());
        }
        if (message.getBlock4() != null && message.getBlock4().getField54D() != null) {
            Field54DMapper.mapField54DToBranchAndFinInstId(message.getBlock4().getField54D(), branchAndFinInstId);
            System.out.println("Mapped Field54D to branchAndFinInstId : " + branchAndFinInstId.getFinInstnId().getBICFI());
        }

       if (message.getBlock4() != null && message.getBlock4().getField55A() != null) {
            Field55AMapper.mapField55AToBranchAndFinInstId(message.getBlock4().getField55A(), branchAndFinInstId);
            System.out.println("Mapped Field55A to crdTrs: " + branchAndFinInstId.getFinInstnId());
        }
       if (message.getBlock4() != null && message.getBlock4().getField55B() != null) {
            Field55BMapper.mapField55BToBranchAndFinInstId(message.getBlock4().getField55B(), branchAndFinInstId);
            System.out.println("Mapped Field55B to crdTrs: " + branchAndFinInstId.getFinInstnId());
        }
       if (message.getBlock4() != null && message.getBlock4().getField55D() != null) {
            Field55DMapper.mapField55DToBranchAndFinInstId(message.getBlock4().getField55D(), branchAndFinInstId);
            System.out.println("Mapped Field55D to crdTrs: " + branchAndFinInstId.getFinInstnId());
        }
        if (message.getBlock4() != null && message.getBlock4().getField56A() != null) {
            Field56AMapper.mapField56AToBranchAndFinInstId( message.getBlock4().getField56A(), branchAndFinInstId);
            System.out.println("Mapped Field56A to crdTrs: " + branchAndFinInstId.getBrnchId().getId());
        }
        if (message.getBlock4() != null && message.getBlock4().getField55A() != null) {
            Field55AMapper.mapField55AToBranchAndFinInstId(message.getBlock4().getField55A(), branchAndFinInstId);
            System.out.println("Mapped Field55A to crdTrs: " + branchAndFinInstId.getBrnchId().getId());
        }
        if (message.getBlock4() != null && message.getBlock4().getField55B() != null) {
            Field55BMapper.mapField55BToBranchAndFinInstId(message.getBlock4().getField55B(),branchAndFinInstId);
            System.out.println("Mapped Field55Bto crdTrs: " + branchAndFinInstId.getBrnchId().getId());
        }
        if (message.getBlock4() != null && message.getBlock4().getField55D() != null) {
            Field55DMapper.mapField55DToBranchAndFinInstId(message.getBlock4().getField55D(),branchAndFinInstId);
            System.out.println("Mapped Field55Dto crdTrs: " + branchAndFinInstId.getBrnchId().getId());
        }

        if (message.getBlock4() != null && message.getBlock4().getField56A() != null) {
            Field56AMapper.mapField56AToBranchAndFinInstId(message.getBlock4().getField56A(), branchAndFinInstId);
            System.out.println("Mapped Field56Ato crdTrs: " + branchAndFinInstId.getClass().getName());
        }
        if (message.getBlock4() != null && message.getBlock4().getField56C() != null) {
            Field56CMapper.mapField56CToBranchAndFinInstId(message.getBlock4().getField56C(), branchAndFinInstId);
            System.out.println("Mapped Field56Cto crdTrs: " + branchAndFinInstId.getBrnchId().getId());
        }
        if (message.getBlock4() != null && message.getBlock4().getField56D() != null) {
            Field56DMapper.mapField56DToBranchAndFinInstId(message.getBlock4().getField56D(), branchAndFinInstId);
            System.out.println("Mapped Field56Dto crdTrs: " + branchAndFinInstId.getClass().getName());
        }
        if (message.getBlock4() != null && message.getBlock4().getField57A() != null) {
            Field57AMapper.mapField57AToBranchAndFinInstId(message.getBlock4().getField57A(), branchAndFinInstId);
            System.out.println("Mapped Field57A to crdTrs: " + branchAndFinInstId.getFinInstnId().getBICFI());
        }
        if (message.getBlock4() != null && message.getBlock4().getField57B() != null) {
            Field57BMapper.mapField57BToBranchAndFinInstId(message.getBlock4().getField57B(), branchAndFinInstId);
            System.out.println("Mapped Field57B to crdTrs: " + branchAndFinInstId.getClass().getName());
        }
        if (message.getBlock4() != null && message.getBlock4().getField57C() != null) {
            Field57CMapper.mapField57CToBranchAndFinInstId(message.getBlock4().getField57C(), branchAndFinInstId);
            System.out.println("Mapped Field57C to crdTrs: " + branchAndFinInstId.getClass().getName());
        }
        if (message.getBlock4() != null && message.getBlock4().getField57D() != null) {
            Field57DMapper.mapField57DToBranchAndFinInstId(message.getBlock4().getField57D(), branchAndFinInstId);
            System.out.println("Mapped Field57D to crdTrs: " + branchAndFinInstId.getClass().getName());
        }
        if (message.getBlock4() != null && message.getBlock4().getField59A() != null) {
            Field59AMapper.mapField59AToBranchAndFinInstId(message.getBlock4().getField59A(), branchAndFinInstId);
            System.out.println("Mapped Field59A to crdTrs: " + branchAndFinInstId.getFinInstnId());
        }
        if (message.getBlock4() != null && message.getBlock4().getField59F() != null) {
            Field59FMapper.mapField59FToBranchAndFinInstId(message.getBlock4().getField59F(), branchAndFinInstId);
            System.out.println("Mapped Field59F to crdTrs: " + branchAndFinInstId.getFinInstnId());
        }
        if (message.getBlock4() != null && message.getBlock4().getField71F() != null) {
            Field71FMapper.mapeField71F(message.getBlock4().getField71F(), actOrHistoric);
            System.out.println("Mapped Field71f to actOrHistoric: " + actOrHistoric.getValue());
        }
        if (message.getBlock4() != null && message.getBlock4().getField72() != null) {
            Field72Mapper.mapField72ToSplmtryData(message.getBlock4().getField72(), splmtryData);
            System.out.println("Mapped Field72 to SplmtryData: " + splmtryData.getPlcAndNm());
        }
        // Print SupplementaryData1 final values
        System.out.println("SupplementaryData1: ");
        System.out.println("  Place and Name: " + splmtryData.getEnvlp().getAny());

        // Print ActiveOrHistoricCurrencyAndAmount final values
        System.out.println("ActiveOrHistoricCurrencyAndAmount: ");
        System.out.println("  Value: " + actOrHistoric.getCcy());

        // Print TaxParty1 final values
        System.out.println("TaxParty1: ");
        System.out.println("  Tax ID: " + cdtr.getTaxId());
        System.out.println("  Registration ID: " + cdtr.getRegnId());
        System.out.println("  Tax Type: " + cdtr.getTaxTp());

        if (groupHeader.getTtlIntrBkSttlmAmt() == null) {
            System.out.println("Error: TtlIntrBkSttlmAmt is missing.");
        }

              // Set objects into the document
        FIToFICustomerCreditTransferV12 creditTransfer = new FIToFICustomerCreditTransferV12();
        creditTransfer.setGrpHdr(groupHeader);

        if (crdTrs != null && crdTrs.getXchgRate() != null) {
            creditTransfer.getCdtTrfTxInf().add(crdTrs);
        } else {
            System.out.println("Error: Credit Transfer Transaction or Exchange Rate is missing.");
        }
        // Ensure crdTrs (CreditTransferTransaction64) is added to the list
        if (crdTrs != null && crdTrs.getXchgRate() != null) {
            // Add to the list
            creditTransfer.getCdtTrfTxInf().add(crdTrs);
            System.out.println("Added CreditTransferTransaction64 with exchange rate: " + crdTrs.getXchgRate());
        } else {
            System.out.println("Error: Credit Transfer Transaction or Exchange Rate is missing.");
        }

        if (splmtryData.getEnvlp() != null && splmtryData.getEnvlp().getAny() != null) {
            creditTransfer.getSplmtryData().add(splmtryData);
        } else {
            System.out.println("Error: SupplementaryData is missing.");
        }
        document.setFIToFICstmrCdtTrf(creditTransfer);


        System.out.println(STR."document \{document.getFIToFICstmrCdtTrf().getCdtTrfTxInf().size()}");
        System.out.println("CdtTrfTxInf size: " + creditTransfer.getCdtTrfTxInf().size());
        System.out.println("SplmtryData size: " + creditTransfer.getSplmtryData().size());


        return document;
    }

}