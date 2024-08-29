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
 * <p>Classe Java pour BranchAndFinancialInstitutionIdentification8 complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BranchAndFinancialInstitutionIdentification8"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FinInstnId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.12}FinancialInstitutionIdentification23"/&gt;
 *         &lt;element name="BrnchId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.12}BranchData5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchAndFinancialInstitutionIdentification8", propOrder = {
    "finInstnId",
    "brnchId"
})
public class BranchAndFinancialInstitutionIdentification8 {

    @XmlElement(name = "FinInstnId", required = true)
    protected FinancialInstitutionIdentification23 finInstnId;
    @XmlElement(name = "BrnchId")
    protected BranchData5 brnchId;

    /**
     * Obtient la valeur de la propriété finInstnId.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification23 }
     *     
     */
    public FinancialInstitutionIdentification23 getFinInstnId() {
        return finInstnId;
    }

    /**
     * Définit la valeur de la propriété finInstnId.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification23 }
     *     
     */
    public void setFinInstnId(FinancialInstitutionIdentification23 value) {
        this.finInstnId = value;
    }

    /**
     * Obtient la valeur de la propriété brnchId.
     * 
     * @return
     *     possible object is
     *     {@link BranchData5 }
     *     
     */
    public BranchData5 getBrnchId() {
        return brnchId;
    }

    /**
     * Définit la valeur de la propriété brnchId.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchData5 }
     *     
     */
    public void setBrnchId(BranchData5 value) {
        this.brnchId = value;
    }

}
