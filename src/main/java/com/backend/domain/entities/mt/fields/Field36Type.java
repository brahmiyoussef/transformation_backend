package com.backend.domain.entities.mt.fields;//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0
// Voir https://eclipse-ee4j.github.io/jaxb-ri
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source.
// Généré le : 2024.08.27 à 03:47:59 PM WEST
//


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.math.BigDecimal;

/**
 * Java class for Field36Type complex type.
 *
 * This class represents a type that contains a single string field with specific constraints.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field36Type")
public class Field36Type {

    @XmlElement(required = true)
    protected String value;

    /**
     * Obtient la valeur de la propriété value.
     *
     * @return possible object is
     * {@link String }
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Définit la valeur de la propriété value.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValue(String value) {
        this.value = value;
    }
}
