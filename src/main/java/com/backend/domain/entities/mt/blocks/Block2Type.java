//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.08.27 à 03:47:59 PM WEST 
//


package com.backend.domain.entities.mt.blocks;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Block2Type {
//seulement les message sous format output
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
    protected String ObsolescencePeriod;

    //regex definition
    private static final String REGEX = "(\\w)(\\d{3})([A-Z]{12})([SUN]?)([123]?)(020|003)?";

//parsing method for block2

    public boolean parse(String input) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            // Extract the groups from the matcher
            this.I_O_id = matcher.group(1); // Corresponds to (\w)
            this.messageType = matcher.group(2); // Corresponds to (\d{3})
            this.receiverAddress = matcher.group(3);// Corresponds to ([A-Z]{12})
            this.messagePriority = matcher.group(4); // Corresponds to (\w)
            this.deliveryMonitoring = matcher.group(5); // Corresponds to (\d)
            this.ObsolescencePeriod = matcher.group(6); // Corresponds to (\d{3})
            return true;
        } else {
            // Parsing failed
            return false;
        }
    }

    /**
     * Obtient la valeur de la propriété messageType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Définit la valeur de la propriété messageType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

    /**
     * Obtient la valeur de la propriété receiverAddress.
     *
     * @return possible object is
     * {@link String }
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * Définit la valeur de la propriété receiverAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverAddress(String value) {
        this.receiverAddress = value;
    }

    /**
     * Obtient la valeur de la propriété messagePriority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessagePriority() {
        return messagePriority;
    }

    /**
     * Définit la valeur de la propriété messagePriority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessagePriority(String value) {
        this.messagePriority = value;
    }

    /**
     * Obtient la valeur de la propriété deliveryMonitoring.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryMonitoring() {
        return deliveryMonitoring;
    }

    /**
     * Définit la valeur de la propriété deliveryMonitoring.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryMonitoring(String value) {
        this.deliveryMonitoring = value;
    }

    /**
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return ObsolescencePeriod;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.ObsolescencePeriod = value;
    }

    public String getI_O_id() {
        return I_O_id;
    }

    public void setI_O_id(String i_O_id) {
        I_O_id = i_O_id;
    }

}
