//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.08.27 à 03:47:59 PM WEST 
//


package com.backend.domain.entities.mt.secondaryentities;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour IdentifierCodeType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="IdentifierCodeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier1"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[A-Z]{4}"/&gt;
 *               &lt;minLength value="4"/&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="identifier2"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[A-Z]{2}"/&gt;
 *               &lt;minLength value="2"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="identifier3"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[A-Za-z0-9]{2}"/&gt;
 *               &lt;minLength value="2"/&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="identifier4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[A-Za-z0-9]{0,3}"/&gt;
 *               &lt;maxLength value="3"/&gt;
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
@XmlType(name = "IdentifierCodeType", propOrder = {
    "identifier1",
    "identifier2",
    "identifier3",
    "identifier4"
})
public class IdentifierCodeType {

    @XmlElement(required = true)
    protected String identifier1;
    @XmlElement(required = true)
    protected String identifier2;
    @XmlElement(required = true)
    protected String identifier3;
    protected String identifier4;

    /**
     * Obtient la valeur de la propriété identifier1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier1() {
        return identifier1;
    }

    /**
     * Définit la valeur de la propriété identifier1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier1(String value) {
        this.identifier1 = value;
    }

    /**
     * Obtient la valeur de la propriété identifier2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier2() {
        return identifier2;
    }

    /**
     * Définit la valeur de la propriété identifier2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier2(String value) {
        this.identifier2 = value;
    }

    /**
     * Obtient la valeur de la propriété identifier3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier3() {
        return identifier3;
    }

    /**
     * Définit la valeur de la propriété identifier3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier3(String value) {
        this.identifier3 = value;
    }

    /**
     * Obtient la valeur de la propriété identifier4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier4() {
        return identifier4;
    }

    /**
     * Définit la valeur de la propriété identifier4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier4(String value) {
        this.identifier4 = value;
    }

}
