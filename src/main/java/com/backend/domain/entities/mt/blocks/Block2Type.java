//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0
// Voir https://eclipse-ee4j.github.io/jaxb-ri
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source.
// Généré le : 2024.08.27 à 03:47:59 PM WEST
//


package com.backend.domain.entities.mt.blocks;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Block2Type", propOrder = {
        "I_O_id",
        "messageType",
        "receiverAddress",
        "messagePriority",
        "deliveryMonitoring",
        "obsolescencePeriod",
        "inputTime",
        "mir",
        "outputDate",
        "outputTime"
})
public class Block2Type {
    public String toString() {
        return "Block2Type{" +
                "I_O_id='" + I_O_id + '\'' +
                ", messageType='" + messageType + '\'' +
                ", receiverAddress='" + receiverAddress + '\'' +
                ", messagePriority='" + messagePriority + '\'' +
                ", deliveryMonitoring='" + deliveryMonitoring + '\'' +
                ", obsolescencePeriod='" + obsolescencePeriod + '\'' +
                ", inputTime='" + inputTime + '\'' +
                ", mir='" + mir + '\'' +
                ", outputDate='" + outputDate + '\'' +
                ", outputTime='" + outputTime + '\'' +
                '}';
    }

@XmlElement(required = true)
protected String I_O_id;
    @XmlElement(required = true)
    protected String messageType;
    @XmlElement(required = true)
    protected String receiverAddress;
    @XmlElement(required = false)
    protected String messagePriority;
    @XmlElement(required = false)
    protected String deliveryMonitoring;
    @XmlAttribute(required = false)
    protected String obsolescencePeriod;

    @XmlElement(required = false)
    protected String inputTime;
    @XmlElement(required = false)
    protected String mir;
    @XmlElement(required = false)
    protected String outputDate;
    @XmlElement(required = false)
    protected String outputTime;

    //regex definition
    //private static final String REGEX = "(\\w)(\\d{3})([A-Z]{12})([SUN]?)([123]?)(020|003)?";
    // Regular expression for input messages
    private static final String INPUT_REGEX = "(\\w)(\\d{3})([A-Z]{12})([SUN]?)([123]?)(020|003)?";

    // Regular expression for output messages
    private static final String OUTPUT_REGEX = "(\\w)(\\d{3})(\\d{4})([0-9]{6})([0-9 A-Z]{12})([0-9]{4})([0-9]{6})(\\d{6})(\\d{4})([SUN]?)";

//parsing method for block2

    public boolean parse(String input) {
        Pattern pattern ;
        Matcher matcher ;
        if (input.startsWith("O")) {
            System.out.println("Block 2 is an Output message");
            pattern = Pattern.compile(OUTPUT_REGEX);
            matcher = pattern.matcher(input);
            if (matcher.matches()) {
                this.I_O_id = matcher.group(1);
                this.messageType = matcher.group(2);
                this.inputTime = matcher.group(3);
                this.receiverAddress = matcher.group(4);
                this.mir = matcher.group(5);
                this.outputDate = matcher.group(6);
                this.outputTime = matcher.group(7);
                this.messagePriority = matcher.group(8);
                return true;
            }
        } else if (input.startsWith("I")) {
            System.out.println("Block 2 is an Input message");
            pattern = Pattern.compile(INPUT_REGEX);
            matcher = pattern.matcher(input);

            if (matcher.matches()) {
                this.I_O_id = matcher.group(1);// Corresponds to (\w)
                this.messageType = matcher.group(2);// Corresponds to (\d{3})
                this.receiverAddress = matcher.group(3);// Corresponds to ([A-Z]{12})
                this.messagePriority = matcher.group(4);// Corresponds to (\w)
                this.deliveryMonitoring = matcher.group(5);// Corresponds to (\d)
                this.obsolescencePeriod = matcher.group(6);// Corresponds to (\d{3})
                return true;
            }
        }
        return false;
    }

    // Getters and setters for all fields
    public String getI_O_id() {
        return I_O_id;
    }

    public void setI_O_id(String i_O_id) {
        I_O_id = i_O_id;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getMessagePriority() {
        return messagePriority;
    }

    public void setMessagePriority(String messagePriority) {
        this.messagePriority = messagePriority;
    }

    public String getDeliveryMonitoring() {
        return deliveryMonitoring;
    }

    public void setDeliveryMonitoring(String deliveryMonitoring) {
        this.deliveryMonitoring = deliveryMonitoring;
    }

    public String getObsolescencePeriod() {
        return obsolescencePeriod;
    }

    public void setObsolescencePeriod(String obsolescencePeriod) {
        this.obsolescencePeriod = obsolescencePeriod;
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime;
    }

    public String getMir() {
        return mir;
    }

    public void setMir(String mir) {
        this.mir = mir;
    }

    public String getOutputDate() {
        return outputDate;
    }

    public void setOutputDate(String outputDate) {
        this.outputDate = outputDate;
    }

    public String getOutputTime() {
        return outputTime;
    }

    public void setOutputTime(String outputTime) {
        this.outputTime = outputTime;
    }

}
