//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.08.27 à 03:47:59 PM WEST 
//


package com.backend.domain.entities.mt.message;

import com.backend.domain.entities.mt.blocks.Block1Type;
import com.backend.domain.entities.mt.blocks.Block2Type;
import com.backend.domain.entities.mt.blocks.Block3Type;
import com.backend.domain.entities.mt.blocks.Block4;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="block1" type="{}Block1Type"/&gt;
 *         &lt;element name="block2" type="{}Block2Type"/&gt;
 *         &lt;element name="block3" type="{}Block3Type"/&gt;
 *         &lt;element name="block4" type="{}Block4"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "block1",
    "block2",
    "block3",
    "block4"
})
@XmlRootElement(name = "message")
public class Message {

    @XmlElement(required = true)
    protected Block1Type block1;
    @XmlElement(required = true)
    protected Block2Type block2;
    @XmlElement(required = true)
    protected Block3Type block3;
    @XmlElement(required = true)
    protected Block4 block4;

    /**
     * Obtient la valeur de la propriété block1.
     * 
     * @return
     *     possible object is
     *     {@link Block1Type }
     *     
     */
    public Block1Type getBlock1() {
        return block1;
    }

    /**
     * Définit la valeur de la propriété block1.
     * 
     * @param value
     *     allowed object is
     *     {@link Block1Type }
     *     
     */
    public void setBlock1(Block1Type value) {
        this.block1 = value;
    }

    /**
     * Obtient la valeur de la propriété block2.
     * 
     * @return
     *     possible object is
     *     {@link Block2Type }
     *     
     */
    public Block2Type getBlock2() {
        return block2;
    }

    /**
     * Définit la valeur de la propriété block2.
     * 
     * @param value
     *     allowed object is
     *     {@link Block2Type }
     *     
     */
    public void setBlock2(Block2Type value) {
        this.block2 = value;
    }

    /**
     * Obtient la valeur de la propriété block3.
     * 
     * @return
     *     possible object is
     *     {@link Block3Type }
     *     
     */
    public Block3Type getBlock3() {
        return block3;
    }

    /**
     * Définit la valeur de la propriété block3.
     * 
     * @param value
     *     allowed object is
     *     {@link Block3Type }
     *     
     */
    public void setBlock3(Block3Type value) {
        this.block3 = value;
    }

    /**
     * Obtient la valeur de la propriété block4.
     * 
     * @return
     *     possible object is
     *     {@link Block4 }
     *     
     */
    public Block4 getBlock4() {
        return block4;
    }

    /**
     * Définit la valeur de la propriété block4.
     * 
     * @param value
     *     allowed object is
     *     {@link Block4 }
     *     
     */
    public void setBlock4(Block4 value) {
        this.block4 = value;
    }

}
