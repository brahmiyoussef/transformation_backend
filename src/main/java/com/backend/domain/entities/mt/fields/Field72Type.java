package com.backend.domain.entities.mt.fields;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Classe Java pour Field72Type complex type.
 *
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 *
 * <pre>
 * &lt;complexType name="Field72Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{}Field23BType" minOccurs="0"/&gt;
 *         &lt;element name="narrative" type="{}NarrativeType" maxOccurs="5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Field72Type", propOrder = {
    "code",
    "narrative"
})
public class Field72Type {

    protected String code;
    protected List<String> narrative;

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
     * Gets the value of the narrative property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the narrative property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNarrative().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getNarrative() {
        if (narrative == null) {
            narrative = new ArrayList<String>();
        }
        return this.narrative;
    }

    /**
     * Parses a string input and sets the code and narrative fields.
     *
     * @param input
     *     The string input to parse.
     * @return
     *     A Field72Type object with populated fields or null if parsing fails.
     */
    public static Field72Type parse(String input) {
        // Regular expression to match the code and narrative parts
        String regex = "(?:/([A-Z]{3})|/)?(?:[^\n]*)\n((?:.*\n?){0,5})";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            Field72Type field = new Field72Type();

            // Extract the code if present
            String code = matcher.group(1);
            if (code != null) {
                field.setCode(code);
            }

            // Extract the narrative lines
            String narrativeLines = matcher.group(2);
            if (narrativeLines != null) {
                String[] lines = narrativeLines.split("\n");
                for (String line : lines) {
                    if (!line.trim().isEmpty()) {
                        field.getNarrative().add(line.trim());
                    }
                }
            }

            return field;
        } else {
            // Parsing failed
            return null;
        }
    }
}
