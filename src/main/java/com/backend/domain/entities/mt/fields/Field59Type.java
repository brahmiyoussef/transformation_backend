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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Field59Type complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Field59Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="account" type="{}AccountType" minOccurs="0"/&gt;
 *         &lt;element name="NumberAddress" type="{}NumberAddressType" maxOccurs="4" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field59Type", propOrder = {
    "account",
    "numberAddress"
})
public class Field59Type {

    protected String account;
    @XmlElement(name = "NumberAddress")
    protected String numberAddress;
    public static final String REGEX = "\\/(\\w{0,35}\n)((?:[\\w\\s,.-]{0,34}){0,3})";
    public Field59Type parse(String input) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {

            Field59Type field=new Field59Type();
            // Extract the groups from the matcher

                System.out.println("1"+matcher.group(1));
                field.account=matcher.group(1);// Corresponds to (/8c)
            field.numberAddress = matcher.group(2); // Corresponds to (/4!)
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
     *
     *
     *
     */
    public String getNumberAddress() {
        return this.numberAddress;
    }

}
