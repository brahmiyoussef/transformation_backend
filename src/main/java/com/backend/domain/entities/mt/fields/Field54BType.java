//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.08.27 à 03:47:59 PM WEST 
//


package com.backend.domain.entities.mt.fields;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * <p>Classe Java pour Field54BType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Field54BType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partyIdentifier" type="{}PartyIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{}NarrativeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field54BType", propOrder = {
    "partyIdentifier",
    "location"
})
public class Field54BType {

    protected String partyIdentifier;
    protected String location;
    private static final String REGEX =
            "(\\w{0,34})";  //\s([A-Z]{0,11})
    public Field54BType parse(String input) {
        Field54BType field=new Field54BType();
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println(matcher.group(1));
            // Extract the groups from the matcher
            field.location = matcher.group(1);
            return field;}
        else {
            // Parsing failed
            return null;
        }

    }
    /**
     * Obtient la valeur de la propriété partyIdentifier.
     *
     * @return
     *     possible object is
     *     {@link  }
     *
     */
    public String getPartyIdentifier() {
        return partyIdentifier;
    }

    /**
     * Définit la valeur de la propriété partyIdentifier.
     *
     * @param value
     *     allowed object is
     *     {@link  }
     *
     */
    public void setPartyIdentifier(String value) {
        this.partyIdentifier = value;
    }

    /**
     * Obtient la valeur de la propriété location.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLocation() {
        return location;
    }

    /**
     * Définit la valeur de la propriété location.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLocation(String value) {
        this.location = value;
    }

}
