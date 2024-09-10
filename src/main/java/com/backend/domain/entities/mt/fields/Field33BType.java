//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.08.27 à 03:47:59 PM WEST 
//


package com.backend.domain.entities.mt.fields;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field33BType", propOrder = {
    "currency",
    "amount"
})
public class Field33BType {

    @XmlElement(required = true)
    protected String currency;
    @XmlElement(required = true)
    protected String amount;


    private static final String REGEX ="(\\w{3})(\\d{6,})(,\\d{2})";

    public Field33BType() {
    }

    public static Field33BType parse(String input) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            // Create a new instance of Field33BType
            Field33BType field = new Field33BType();
            // Extract the groups from the matcher
            field.currency = matcher.group(1); // Corresponds to (/4!)
            field.amount = String.valueOf(new BigDecimal(matcher.group(2))); // Corresponds to (n1!)
            return field;
        } else {
            System.err.println("Failed to parse value: '" + input + "' using pattern: " + REGEX);

            // Parsing failed
            return null;
        }
    }

    /**
     * Obtient la valeur de la propriété currency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Définit la valeur de la propriété currency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Obtient la valeur de la propriété amount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Définit la valeur de la propriété amount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = String.valueOf(value);
    }

}
