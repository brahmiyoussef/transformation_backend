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
 * <p>Classe Java pour Party52Choice complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Party52Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="OrgId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.12}OrganisationIdentification39"/&gt;
 *         &lt;element name="PrvtId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.12}PersonIdentification18"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party52Choice", propOrder = {
    "orgId",
    "prvtId"
})
public class Party52Choice {

    @XmlElement(name = "OrgId")
    protected OrganisationIdentification39 orgId;
    @XmlElement(name = "PrvtId")
    protected PersonIdentification18 prvtId;

    /**
     * Obtient la valeur de la propriété orgId.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification39 }
     *     
     */
    public OrganisationIdentification39 getOrgId() {
        return orgId;
    }

    /**
     * Définit la valeur de la propriété orgId.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification39 }
     *     
     */
    public void setOrgId(OrganisationIdentification39 value) {
        this.orgId = value;
    }

    /**
     * Obtient la valeur de la propriété prvtId.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentification18 }
     *     
     */
    public PersonIdentification18 getPrvtId() {
        return prvtId;
    }

    /**
     * Définit la valeur de la propriété prvtId.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentification18 }
     *     
     */
    public void setPrvtId(PersonIdentification18 value) {
        this.prvtId = value;
    }

}
