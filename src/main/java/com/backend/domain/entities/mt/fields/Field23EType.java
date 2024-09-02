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

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * <p>Classe Java pour Field23EType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Field23EType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="instructionCode" type="{}Field23BType"/&gt;
 *         &lt;element name="additionalInformation" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[A-Za-z0-9]{0,30}"/&gt;
 *               &lt;maxLength value="30"/&gt;
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
@XmlType(name = "Field23EType", propOrder = {
    "instructionCode",
    "additionalInformation"
})
public class Field23EType {

    @XmlElement(required = true)
    protected String instructionCode;
    protected String additionalInformation;
    private static final String REGEX ="([A-Z]{4})(.)([a-zA-Z0-9\\s]{0,30})";

    public Field23EType parse(String input) {
        Field23EType field=new Field23EType();
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            // Extract the groups from the matcher
            field.instructionCode = matcher.group(1);
            field.additionalInformation = matcher.group(3);
            return field;
        } else {
            // Parsing failed
            System.err.println("Failed to parse value: '" + input + "' using pattern: " + REGEX);
            return null;
        }
    }
    /**
     * Obtient la valeur de la propriété instructionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructionCode() {
        return instructionCode;
    }

    /**
     * Définit la valeur de la propriété instructionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructionCode(String value) {
        this.instructionCode = value;
    }

    /**
     * Obtient la valeur de la propriété additionalInformation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Définit la valeur de la propriété additionalInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInformation(String value) {
        this.additionalInformation = value;
    }

}
