package com.backend.domain.entities.mx;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupHeader113", propOrder = {
        "msgId",
        "creDtTm",
        "msgDefIdr",  // New field for message definition identifier
        "btchBookg",
        "nbOfTxs",
        "ctrlSum",
        "ttlIntrBkSttlmAmt",
        "intrBkSttlmDt",
        "sttlmInf",
        "pmtTpInf",
        "instgAgt",
        "instdAgt"
})
public class GroupHeader113 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;

    @XmlElement(name = "CreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected String creDtTm;

    @XmlElement(name = "MsgDefIdr", required = true)
    protected String msgDefIdr;

    @XmlElement(name = "BtchBookg")
    protected Boolean btchBookg;

    @XmlElement(name = "NbOfTxs", required = true)
    protected String nbOfTxs;

    @XmlElement(name = "CtrlSum")
    protected BigDecimal ctrlSum;

    @XmlElement(name = "TtlIntrBkSttlmAmt")
    protected ActiveCurrencyAndAmount ttlIntrBkSttlmAmt;

    @XmlElement(name = "IntrBkSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar intrBkSttlmDt;

    @XmlElement(name = "SttlmInf", required = true)
    protected SettlementInstruction15 sttlmInf;

    @XmlElement(name = "PmtTpInf")
    protected PaymentTypeInformation28 pmtTpInf;

    @XmlElement(name = "InstgAgt")
    protected String instgAgt;

    @XmlElement(name = "InstdAgt")
    protected BranchAndFinancialInstitutionIdentification8 instdAgt;

    // Getters and Setters
    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String value) {
        this.msgId = value;
    }

    public void setNbOfTxs(String nbOfTxs) {
        this.nbOfTxs = nbOfTxs;
    }

    public String getCreDtTm() {
        return creDtTm;
    }

    public void setCreDtTm(String value) {
        this.creDtTm = value;
    }

    public String getMsgDefIdr() {
        return msgDefIdr;
    }

    public void setMsgDefIdr(String value) {
        this.msgDefIdr = value;
    }

    public String getInstgAgt() {
        return instgAgt;
    }

    public void setInstgAgt(String receiverAddress) {
        this.instgAgt = receiverAddress;
    }

    // Getter and Setter for ttlIntrBkSttlmAmt
    public ActiveCurrencyAndAmount getTtlIntrBkSttlmAmt() {
        return ttlIntrBkSttlmAmt;
    }

    public void setTtlIntrBkSttlmAmt(ActiveCurrencyAndAmount ttlIntrBkSttlmAmt) {
        this.ttlIntrBkSttlmAmt = ttlIntrBkSttlmAmt;
    }

    public XMLGregorianCalendar getIntrBkSttlmDt() {
        return intrBkSttlmDt;
    }

    public void setIntrBkSttlmDt(XMLGregorianCalendar value) {
        this.intrBkSttlmDt = value;
    }

}
