package com.backend.domain.services.mxBuilding;

import com.backend.domain.entities.mt.fields.*;
import com.backend.domain.entities.mt.blocks.Block4;
import com.backend.domain.entities.mt.message.Message;
import com.backend.domain.entities.mx.*;
import com.backend.domain.entities.mx.Document;
import com.backend.domain.services.mxBuilding.mapping.*;
import org.springframework.stereotype.Service;

@Service
public class MTtoMXMappingService {

    public Document mapMTtoMX(Message message) {
        // Initialize an MX Document
        Document mxDocument = new Document();

        // Assuming the message object has relevant fields/blocks
        Block4 block4 = message.getBlock4(); // Example to get Block4

        // Mapping Block4 fields to MX Document fields with null checks

        // Mapping Field20 to GroupHeader113
        GroupHeader113 groupHeader = new GroupHeader113();
        if (block4.getField20() != null) {
            Block4Mapper.mapField20ToMsgId(block4.getField20(), groupHeader);
            System.out.println("Mapped Field20 to GroupHeader: " + groupHeader.getMsgId());
        }

        // Mapping Field23B to CreditTransferMandateData1
        CreditTransferMandateData1 mandateData = new CreditTransferMandateData1();
        if (block4.getField23B() != null) {
            Block4Mapper.mapField23BToMndtRltdInf(block4.getField23B(), mandateData);
            System.out.println("Mapped Field23B to MandateData: " + mandateData.toString());
        }

        // Mapping Field32A to GroupHeader113
        Field32AType field32A = block4.getField32A();
        if (field32A != null) {
            Field32AMapper.mapField32AtoGrpHdr(field32A, groupHeader);
            System.out.println("Mapped Field32A to GroupHeader: " + groupHeader.getIntrBkSttlmDt());
        }

        // Mapping Field33B to ActiveOrHistoricCurrencyAndAmount
        ActiveOrHistoricCurrencyAndAmount currencyAndAmount = new ActiveOrHistoricCurrencyAndAmount();
        Field33BType field33B = block4.getField33B();
        if (field33B != null) {
            Field33BMapper.mapField33B(field33B, currencyAndAmount);
            System.out.println("Mapped Field33B to CurrencyAndAmount: " + currencyAndAmount.getValue());
        }

        // Mapping Field36 to CreditTransferTransaction64
        CreditTransferTransaction64 creditTransferTransaction = new CreditTransferTransaction64();
        if (block4.getField36() != null) {
            Field36Mapper.mapeField36(block4.getField36(), creditTransferTransaction);
            System.out.println("Mapped Field36 to CreditTransferTransaction: " + creditTransferTransaction.getIntrBkSttlmAmt());
        }

        // Mapping Field50 (A, F, K) to TaxParty1
        TaxParty1 taxParty = new TaxParty1();
        if (block4.getField50A() != null) {
            Field50Mapper.mapField50A(block4.getField50A(), taxParty);
            System.out.println("Mapped Field50A to TaxParty: " + taxParty.getTaxId());
        }
        if (block4.getField50F() != null) {
            Field50Mapper.mapField50F(block4.getField50F(), taxParty);
            System.out.println("Mapped Field50F to TaxParty: " + taxParty.getTaxId());
        }
        if (block4.getField50K() != null) {
            Field50Mapper.mapField50K(block4.getField50K(), taxParty);
            System.out.println("Mapped Field50K to TaxParty: " + taxParty.getTaxTp());
        }

        // Mapping Field51A to BranchAndFinancialInstitutionIdentification8
        BranchAndFinancialInstitutionIdentification8 branch = new BranchAndFinancialInstitutionIdentification8();
        if (block4.getField51A() != null) {
            Field51AMapper.mapField51AToBranchAndFinInstId(block4.getField51A(), branch);
            System.out.println("Mapped Field51A to Branch: " + branch.toString());
        }

        // Mapping Field56 (A, C, D) to BranchAndFinancialInstitutionIdentification8
        if (block4.getField56A() != null) {
            Field56AMapper.mapField56AToBranchAndFinInstId(block4.getField56A(), branch);
            System.out.println("Mapped Field56A to Branch: " + branch.toString());
        }
        if (block4.getField56C() != null) {
            Field56CMapper.mapField56CToBranchAndFinInstId(block4.getField56C(), branch);
            System.out.println("Mapped Field56C to Branch: " + branch.toString());
        }
        if (block4.getField56D() != null) {
            Field56DMapper.mapField56DToBranchAndFinInstId(block4.getField56D(), branch);
            System.out.println("Mapped Field56D to Branch: " + branch.toString());
        }

        // Ensure that FIToFICustomerCreditTransferV12 is initialized
        if (mxDocument.getFIToFICstmrCdtTrf() == null) {
            mxDocument.setFIToFICstmrCdtTrf(new FIToFICustomerCreditTransferV12());
        }

        // Set all mapped data into FIToFICustomerCreditTransferV12
        FIToFICustomerCreditTransferV12 creditTransfer = mxDocument.getFIToFICstmrCdtTrf();

        // Ensure that Credit Transfer Transaction Information (CdtTrfTxInf) is initialized
        if (creditTransfer.getCdtTrfTxInf().isEmpty()) {
            creditTransfer.getCdtTrfTxInf().add(new CreditTransferTransaction64());
        }
        CreditTransferTransaction64 cdtTrfTxInf = creditTransfer.getCdtTrfTxInf().get(0);

        // Set Group Header
        creditTransfer.setGrpHdr(groupHeader);
        System.out.println("Set Group Header: " + groupHeader.getMsgId());

        // Set Remittance Information if present
        if (cdtTrfTxInf != null) {
            RemittanceInformation22 remittanceInfo = new RemittanceInformation22();
            remittanceInfo.getUstrd().add("Narrative Example");
            cdtTrfTxInf.setRmtInf(remittanceInfo);
            System.out.println("Set Remittance Information: " + remittanceInfo.getUstrd());
        }

        // Set Charge Bearer
        cdtTrfTxInf.setChrgBr(ChargeBearerType1Code.SLEV);
        System.out.println("Set Charge Bearer: " + cdtTrfTxInf.getChrgBr());

        // Set Charges Information
        if (currencyAndAmount != null) {
            Charges16 chargesInfo = new Charges16();
            chargesInfo.setAmt(currencyAndAmount);
            cdtTrfTxInf.getChrgsInf().add(chargesInfo);
            System.out.println("Set Charges Information: " + chargesInfo.getAmt().getValue());
        }

        // Return the fully mapped MX Document
        return mxDocument;
    }
}
