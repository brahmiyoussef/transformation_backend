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
 * <p>Classe Java pour ChargeType3Choice complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ChargeType3Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.12}ExternalChargeType1Code"/&gt;
 *         &lt;element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.12}GenericIdentification3"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeType3Choice", propOrder = {
    "cd",
    "prtry"
})
public class ChargeType3Choice {

    @XmlElement(name = "Cd")
    protected String cd;
    @XmlElement(name = "Prtry")
    protected GenericIdentification3 prtry;

    /**
     * Obtient la valeur de la propriété cd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCd() {
        return cd;
    }

    /**
     * Définit la valeur de la propriété cd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCd(String value) {
        this.cd = value;
    }

    /**
     * Obtient la valeur de la propriété prtry.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification3 }
     *     
     */
    public GenericIdentification3 getPrtry() {
        return prtry;
    }

    /**
     * Définit la valeur de la propriété prtry.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification3 }
     *     
     */
    public void setPrtry(GenericIdentification3 value) {
        this.prtry = value;
    }

}
