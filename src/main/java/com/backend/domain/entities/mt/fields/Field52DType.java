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
 * <p>Classe Java pour Field52DType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Field52DType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partyIdentifier" type="{}PartyIdentifierType" minOccurs="0"/&gt;
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
@XmlType(name = "Field52DType", propOrder = {
    "partyIdentifier",
    "numberAddress"
})
public class Field52DType {

    protected String partyIdentifier;
    @XmlElement(name = "NumberAddress")
    protected String numberAddress;
    private static final String REGEX =
            "\"([/1!a][/34x]) \n" +
                    "(4*35x)\"";
    public boolean parse(String input) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            // Extract the groups from the matcher
            this.partyIdentifier = matcher.group(1); // Corresponds to (/8c)
            this.numberAddress = matcher.group(2); // Corresponds to (/4!)
            return true;
        } else {
            // Parsing failed
            return false;
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
     * {@link  }
     * 
     * 
     */
    public String getNumberAddress() {
        return this.numberAddress;
    }

}
