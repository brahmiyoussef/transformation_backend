//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.08.27 à 03:47:59 PM WEST 
//


package com.backend.domain.entities.mt.fields;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.backend.domain.entities.mt.secondaryentities.CodeType;
import com.backend.domain.entities.mt.secondaryentities.NumberAddressType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Field50FType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Field50FType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="account" type="{}AccountType"/&gt;
 *           &lt;element name="codePart" type="{}CodeType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="numberAddress" type="{}NumberAddressType" maxOccurs="4" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field50FType", propOrder = {
    "account",
    "codePart",
    "numberAddress"
})
public class Field50FType {

    protected String account;
    protected String codePart;
    protected String numberAddress;
    public static final String REGEX = "\\/(?:(\\w{0,35}\n)|(\\a{6}\\w{0,27}\n))((?:[\\w\\s,]{0,34}){0,3})";
    public Field50FType parse(String input) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {

            Field50FType field=new Field50FType();
            if (matcher.group(1)!= null){
                field.account=matcher.group(1);
            }
            else if (matcher.group(2) != null) {
                field.codePart = (matcher.group(2));}
            field.numberAddress = matcher.group(3); // Corresponds to (/4!)
            return field;
        } else {
            System.err.println("Failed to parse value: '" + input + "' using pattern: " + REGEX);
            // Parsing failed
            return null;
        }
    }
    /**
     * Obtient la valeur de la propriété account.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Définit la valeur de la propriété account.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Obtient la valeur de la propriété codePart.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public String getCodePart() {
        return codePart;
    }

    /**
     * Définit la valeur de la propriété codePart.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCodePart(String value) {
        this.codePart = value;
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
    public String getNumberAddress() {
        return this.numberAddress;
    }

}
