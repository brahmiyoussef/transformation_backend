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
 * <p>Classe Java pour StructuredRemittanceInformation18 complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StructuredRemittanceInformation18"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RfrdDocInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.12}ReferredDocumentInformation8" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RfrdDocAmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.12}RemittanceAmount4" minOccurs="0"/&gt;
 *         &lt;element name="CdtrRefInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.12}CreditorReferenceInformation3" minOccurs="0"/&gt;
 *         &lt;element name="Invcr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.12}PartyIdentification272" minOccurs="0"/&gt;
 *         &lt;element name="Invcee" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.12}PartyIdentification272" minOccurs="0"/&gt;
 *         &lt;element name="TaxRmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.12}TaxData1" minOccurs="0"/&gt;
 *         &lt;element name="GrnshmtRmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.12}Garnishment4" minOccurs="0"/&gt;
 *         &lt;element name="AddtlRmtInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.12}Max140Text" maxOccurs="3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredRemittanceInformation18", propOrder = {
    "rfrdDocInf",
    "rfrdDocAmt",
    "cdtrRefInf",
    "invcr",
    "invcee",
    "taxRmt",
    "grnshmtRmt",
    "addtlRmtInf"
})
public class StructuredRemittanceInformation18 {

    @XmlElement(name = "RfrdDocInf")
    protected List<ReferredDocumentInformation8> rfrdDocInf;
    @XmlElement(name = "RfrdDocAmt")
    protected RemittanceAmount4 rfrdDocAmt;
    @XmlElement(name = "CdtrRefInf")
    protected CreditorReferenceInformation3 cdtrRefInf;
    @XmlElement(name = "Invcr")
    protected PartyIdentification272 invcr;
    @XmlElement(name = "Invcee")
    protected PartyIdentification272 invcee;
    @XmlElement(name = "TaxRmt")
    protected TaxData1 taxRmt;
    @XmlElement(name = "GrnshmtRmt")
    protected Garnishment4 grnshmtRmt;
    @XmlElement(name = "AddtlRmtInf")
    protected List<String> addtlRmtInf;

    /**
     * Gets the value of the rfrdDocInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rfrdDocInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRfrdDocInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferredDocumentInformation8 }
     * 
     * 
     */
    public List<ReferredDocumentInformation8> getRfrdDocInf() {
        if (rfrdDocInf == null) {
            rfrdDocInf = new ArrayList<ReferredDocumentInformation8>();
        }
        return this.rfrdDocInf;
    }

    /**
     * Obtient la valeur de la propriété rfrdDocAmt.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceAmount4 }
     *     
     */
    public RemittanceAmount4 getRfrdDocAmt() {
        return rfrdDocAmt;
    }

    /**
     * Définit la valeur de la propriété rfrdDocAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceAmount4 }
     *     
     */
    public void setRfrdDocAmt(RemittanceAmount4 value) {
        this.rfrdDocAmt = value;
    }

    /**
     * Obtient la valeur de la propriété cdtrRefInf.
     * 
     * @return
     *     possible object is
     *     {@link CreditorReferenceInformation3 }
     *     
     */
    public CreditorReferenceInformation3 getCdtrRefInf() {
        return cdtrRefInf;
    }

    /**
     * Définit la valeur de la propriété cdtrRefInf.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorReferenceInformation3 }
     *     
     */
    public void setCdtrRefInf(CreditorReferenceInformation3 value) {
        this.cdtrRefInf = value;
    }

    /**
     * Obtient la valeur de la propriété invcr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getInvcr() {
        return invcr;
    }

    /**
     * Définit la valeur de la propriété invcr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public void setInvcr(PartyIdentification272 value) {
        this.invcr = value;
    }

    /**
     * Obtient la valeur de la propriété invcee.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getInvcee() {
        return invcee;
    }

    /**
     * Définit la valeur de la propriété invcee.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public void setInvcee(PartyIdentification272 value) {
        this.invcee = value;
    }

    /**
     * Obtient la valeur de la propriété taxRmt.
     * 
     * @return
     *     possible object is
     *     {@link TaxData1 }
     *     
     */
    public TaxData1 getTaxRmt() {
        return taxRmt;
    }

    /**
     * Définit la valeur de la propriété taxRmt.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxData1 }
     *     
     */
    public void setTaxRmt(TaxData1 value) {
        this.taxRmt = value;
    }

    /**
     * Obtient la valeur de la propriété grnshmtRmt.
     * 
     * @return
     *     possible object is
     *     {@link Garnishment4 }
     *     
     */
    public Garnishment4 getGrnshmtRmt() {
        return grnshmtRmt;
    }

    /**
     * Définit la valeur de la propriété grnshmtRmt.
     * 
     * @param value
     *     allowed object is
     *     {@link Garnishment4 }
     *     
     */
    public void setGrnshmtRmt(Garnishment4 value) {
        this.grnshmtRmt = value;
    }

    /**
     * Gets the value of the addtlRmtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addtlRmtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlRmtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlRmtInf() {
        if (addtlRmtInf == null) {
            addtlRmtInf = new ArrayList<String>();
        }
        return this.addtlRmtInf;
    }

}
