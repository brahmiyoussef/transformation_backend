//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.08.27 à 03:47:59 PM WEST 
//


package com.backend.domain.entities.mt.fields;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Field56DType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Field56DType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partyIdentifier" type="{}PartyIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="NumberAddress" type="{}NumberAddressType" maxOccurs="4" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field56DType", propOrder = {
    "partyIdentifier",
    "numberAddress"
})
public class Field56DType {

    protected PartyIdentifierType partyIdentifier;
    @XmlElement(name = "NumberAddress")
    protected List<NumberAddressType> numberAddress;

    /**
     * Obtient la valeur de la propriété partyIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentifierType }
     *     
     */
    public PartyIdentifierType getPartyIdentifier() {
        return partyIdentifier;
    }

    /**
     * Définit la valeur de la propriété partyIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentifierType }
     *     
     */
    public void setPartyIdentifier(PartyIdentifierType value) {
        this.partyIdentifier = value;
    }

    /**
     * Gets the value of the numberAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the numberAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberAddressType }
     * 
     * 
     */
    public List<NumberAddressType> getNumberAddress() {
        if (numberAddress == null) {
            numberAddress = new ArrayList<NumberAddressType>();
        }
        return this.numberAddress;
    }

}
