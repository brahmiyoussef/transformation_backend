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
 * <p>Classe Java pour Field13CType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Field13CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[A-Za-z0-9]{8}"/&gt;
 *               &lt;maxLength value="8"/&gt;
 *               &lt;minLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="timeIndication"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{4}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sign"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[A-Za-z0-9]{1}"/&gt;
 *               &lt;maxLength value="1"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="timeOffset"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{4}"/&gt;
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
@XmlType(name = "Field13CType", propOrder = {
    "code",
    "timeIndication",
    "sign",
    "timeOffset"
})
public class Field13CType{
    @Override
    public String toString() {
        return "Field13CType{" +
                "code='" + code + '\'' +
                ", timeIndication='" + timeIndication + '\'' +
                ", sign='" + sign + '\'' +
                ", timeOffset='" + timeOffset + '\'' +
                '}';
    }


    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected String timeIndication;
    @XmlElement(required = true)
    protected String sign;
    @XmlElement(required = true)
    protected String timeOffset;
    private static final String REGEX ="(/8c)(/4!)(n1!)(x4!n)";

    //parse method
    public Field13CType parse(String input) {
        Field13CType field=new Field13CType();
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            // Extract the groups from the matcher
            field.code = matcher.group(1); // Corresponds to (/8c)
            field.timeIndication = matcher.group(2); // Corresponds to (/4!)
            field.sign = matcher.group(3); // Corresponds to (n1!)
            field.timeOffset = matcher.group(4); // Corresponds to (x4!n)
            return field;
        } else {
            // Parsing failed
            return null;
        }
    }

    /**
     * Obtient la valeur de la propriété code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Définit la valeur de la propriété code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Obtient la valeur de la propriété timeIndication.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeIndication() {
        return timeIndication;
    }

    /**
     * Définit la valeur de la propriété timeIndication.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeIndication(String value) {
        this.timeIndication = value;
    }

    /**
     * Obtient la valeur de la propriété sign.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSign() {
        return sign;
    }

    /**
     * Définit la valeur de la propriété sign.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSign(String value) {
        this.sign = value;
    }

    /**
     * Obtient la valeur de la propriété timeOffset.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeOffset() {
        return timeOffset;
    }

    /**
     * Définit la valeur de la propriété timeOffset.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeOffset(String value) {
        this.timeOffset = value;
    }

}
