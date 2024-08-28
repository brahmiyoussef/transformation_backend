//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.08.27 à 03:47:59 PM WEST 
//


package com.backend.domain.entities.mt.secondaryentities;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PartyIdentifierType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PartyIdentifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partyIdentifier1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[A-Za-z]{1}"/&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="partyIdentifier2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[A-Za-z0-9]{0,34}"/&gt;
 *               &lt;maxLength value="34"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentifierType", propOrder = {
    "partyIdentifier1",
    "partyIdentifier2"
})
public class PartyIdentifierType {

    protected String partyIdentifier1;
    protected String partyIdentifier2;

    /**
     * Obtient la valeur de la propriété partyIdentifier1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyIdentifier1() {
        return partyIdentifier1;
    }

    /**
     * Définit la valeur de la propriété partyIdentifier1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyIdentifier1(String value) {
        this.partyIdentifier1 = value;
    }

    /**
     * Obtient la valeur de la propriété partyIdentifier2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyIdentifier2() {
        return partyIdentifier2;
    }

    /**
     * Définit la valeur de la propriété partyIdentifier2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyIdentifier2(String value) {
        this.partyIdentifier2 = value;
    }

}
