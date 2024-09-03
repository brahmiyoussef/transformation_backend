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


/**
 * <p>Classe Java pour Field71FType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Field71FType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currency" type="{}CurrencyType"/&gt;
 *         &lt;element name="amount" type="{}AmountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field71FType", propOrder = {
    "currency",
    "amount"
})
public class Field71FType {

    @XmlElement(required = true)
    protected String currency;
    @XmlElement(required = true)
    protected BigDecimal amount;


    private static final String REGEX ="(\\w{3})(\\d{15})";
    public Field71GType parse(String input) {

        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            Field71GType field=new Field71GType();
            // Extract the groups from the matcher
            field.currency = matcher.group(1); // Corresponds to (/4!)
            field.amount =new BigDecimal(matcher.group(2)); // Corresponds to (n1!)
            return field;
        } else {
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
    public BigDecimal getAmount() {
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
        this.amount = value;
    }

}
