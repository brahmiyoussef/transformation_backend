//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.08.27 à 03:47:59 PM WEST 
//


package com.backend.domain.entities.mt.fields;

import com.backend.domain.entities.mt.secondaryentities.IdentifierCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * <p>Classe Java pour Field50AType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Field50AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="account" type="{}AccountType" minOccurs="0"/&gt;
 *         &lt;element name="identifierCode" type="{}IdentifierCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field50AType", propOrder = {
    "account",
    "identifierCode"
})
public class Field50AType {

    protected String account;
    @XmlElement(required = true)
    protected String identifierCode;
    private static final String REGEX =
            "\\/(\\w{0,34})\\s([A-Z]{0,11})";
    public Field50AType parse(String input) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            Field50AType field =new Field50AType();
            // Extract the groups from the matcher
            field.account = matcher.group(1); // Corresponds to (/8c)
            field.identifierCode = matcher.group(2); // Corresponds to (/4!)
            return field;
        } else {
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
     * Obtient la valeur de la propriété identifierCode.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierCodeType }
     *     
     */
    public String getIdentifierCode() {
        return identifierCode;
    }

    /**
     * Définit la valeur de la propriété identifierCode.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierCodeType }
     *     
     */
    public void setIdentifierCode(String value) {
        this.identifierCode = value;
    }

}
