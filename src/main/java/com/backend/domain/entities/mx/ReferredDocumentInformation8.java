//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.08.28 à 05:51:50 PM WEST 
//


package com.backend.domain.entities.mx;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ReferredDocumentInformation8 complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ReferredDocumentInformation8"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.12}DocumentType1" minOccurs="0"/&gt;
 *         &lt;element name="Nb" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.12}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="RltdDt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.12}DateAndType1" minOccurs="0"/&gt;
 *         &lt;element name="LineDtls" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.12}DocumentLineInformation2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferredDocumentInformation8", propOrder = {
    "tp",
    "nb",
    "rltdDt",
    "lineDtls"
})
public class ReferredDocumentInformation8 {

    @XmlElement(name = "Tp")
    protected DocumentType1 tp;
    @XmlElement(name = "Nb")
    protected String nb;
    @XmlElement(name = "RltdDt")
    protected DateAndType1 rltdDt;
    @XmlElement(name = "LineDtls")
    protected List<DocumentLineInformation2> lineDtls;

    /**
     * Obtient la valeur de la propriété tp.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType1 }
     *     
     */
    public DocumentType1 getTp() {
        return tp;
    }

    /**
     * Définit la valeur de la propriété tp.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType1 }
     *     
     */
    public void setTp(DocumentType1 value) {
        this.tp = value;
    }

    /**
     * Obtient la valeur de la propriété nb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNb() {
        return nb;
    }

    /**
     * Définit la valeur de la propriété nb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNb(String value) {
        this.nb = value;
    }

    /**
     * Obtient la valeur de la propriété rltdDt.
     * 
     * @return
     *     possible object is
     *     {@link DateAndType1 }
     *     
     */
    public DateAndType1 getRltdDt() {
        return rltdDt;
    }

    /**
     * Définit la valeur de la propriété rltdDt.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndType1 }
     *     
     */
    public void setRltdDt(DateAndType1 value) {
        this.rltdDt = value;
    }

    /**
     * Gets the value of the lineDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the lineDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentLineInformation2 }
     * 
     * 
     */
    public List<DocumentLineInformation2> getLineDtls() {
        if (lineDtls == null) {
            lineDtls = new ArrayList<DocumentLineInformation2>();
        }
        return this.lineDtls;
    }

}
