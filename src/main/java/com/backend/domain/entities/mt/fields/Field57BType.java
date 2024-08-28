//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.08.27 à 03:47:59 PM WEST 
//


package com.backend.domain.entities.mt.fields;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Field57BType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Field57BType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partyIdentifier" type="{}PartyIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{}NarrativeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field57BType", propOrder = {
    "partyIdentifier",
    "location"
})
public class Field57BType {

    protected PartyIdentifierType partyIdentifier;
    protected String location;

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
     * Obtient la valeur de la propriété location.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Définit la valeur de la propriété location.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

}
