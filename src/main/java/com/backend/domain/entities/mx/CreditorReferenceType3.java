//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.08.28 à 05:51:50 PM WEST 
//


package com.backend.domain.entities.mx;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CreditorReferenceType3 complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CreditorReferenceType3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CdOrPrtry" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.12}CreditorReferenceType2Choice"/&gt;
 *         &lt;element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.12}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditorReferenceType3", propOrder = {
    "cdOrPrtry",
    "issr"
})
public class CreditorReferenceType3 {

    @XmlElement(name = "CdOrPrtry", required = true)
    protected CreditorReferenceType2Choice cdOrPrtry;
    @XmlElement(name = "Issr")
    protected String issr;

    /**
     * Obtient la valeur de la propriété cdOrPrtry.
     * 
     * @return
     *     possible object is
     *     {@link CreditorReferenceType2Choice }
     *     
     */
    public CreditorReferenceType2Choice getCdOrPrtry() {
        return cdOrPrtry;
    }

    /**
     * Définit la valeur de la propriété cdOrPrtry.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorReferenceType2Choice }
     *     
     */
    public void setCdOrPrtry(CreditorReferenceType2Choice value) {
        this.cdOrPrtry = value;
    }

    /**
     * Obtient la valeur de la propriété issr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssr() {
        return issr;
    }

    /**
     * Définit la valeur de la propriété issr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssr(String value) {
        this.issr = value;
    }

}
