//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v3.0.0 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2024.08.27 à 03:47:59 PM WEST 
//


package com.backend.domain.entities.mt.blocks;

import com.backend.domain.entities.mt.fields.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.lang.reflect.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Block4", propOrder = {
    "field13C",
    "field20",
    "field23B",
    "field23E",
    "field26T",
    "field32A",
    "field33B",
    "field36",
    "field50A",
    "field50F",
    "field50K",
    "field51A",
    "field52A",
    "field52D",
    "field53A",
    "field54A",
    "field55A",
    "field53B",
    "field54B",
    "field55B",
    "field53D",
    "field54D",
    "field55D",
    "field56A",
    "field56C",
    "field56D",
    "field57A",
    "field57B",
    "field57C",
    "field57D",
    "field59",
    "field59A",
    "field59F",
    "field70",
    "field71A",
    "field71F",
    "field71G",
    "field72",
    "field77B"
})
public class Block4 {

    protected Field13CType field13C;
    protected String field20;
    protected String field23B;
    protected Field23EType field23E;
    protected String field26T;
    protected Field32AType field32A;
    protected Field33BType field33B;
    protected String field36;
    protected Field50AType field50A;
    protected Field50FType field50F;
    protected Field50KType field50K;
    protected Field51AType field51A;
    protected Field52AType field52A;
    protected Field52DType field52D;
    protected Field53AType field53A;
    protected Field54AType field54A;
    protected Field55AType field55A;
    protected Field53BType field53B;
    protected Field54BType field54B;
    protected Field55BType field55B;
    protected Field53DType field53D;
    protected Field54DType field54D;
    protected Field55DType field55D;
    protected Field56AType field56A;
    protected String field56C;
    protected Field56DType field56D;
    protected Field57AType field57A;
    protected Field57BType field57B;
    protected Field57CType field57C;
    protected Field57DType field57D;
    protected Field59Type field59;
    protected Field59AType field59A;
    protected Field59FType field59F;
    protected String field70;
    protected String field71A;
    protected Field71FType field71F;
    protected Field71GType field71G;
    protected Field72Type field72;
    protected String field77B;

    private static final Logger LOGGER = Logger.getLogger(Block4.class.getName());


    //populating block4

    private String convertKeyToFieldName(String key) {
        return "field" + key;
    }
    public static void dumpMethods(String className) {
        try {
            // Load the class using the className
            Class<?> clazz = Class.forName(className);

            // Get all declared methods of the class
            Method[] methods = clazz.getDeclaredMethods();

            // Print each method's details
            for (Method method : methods) {
                LOGGER.log(Level.INFO, method.toString());
            }
        } catch (ClassNotFoundException e) {
            LOGGER.log(Level.INFO, "Class not found: " + className);
        } catch (Throwable e) {
            LOGGER.log(Level.INFO, "An error occurred: " + e);
        }}
    public void populateBlock4(Map<String, String> dataMap) {
        for (Map.Entry<String, String> entry : dataMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if (value == null) {
                LOGGER.log(Level.WARNING, "Value for key '" + key + "' is null, skipping...");
                continue;
            }

            String fieldName = convertKeyToFieldName(key);

            try {
                Field field = this.getClass().getDeclaredField(fieldName);
                field.setAccessible(true);

                Class<?> fieldType = field.getType();

                LOGGER.log(Level.INFO, "Processing field: " + fieldName + " of type: " + fieldType.getName());

                if (fieldType == String.class) {
                    field.set(this, value);
                } else {
                    Object parsedValue = parseValue(fieldType, value);
                    if (parsedValue != null) {
                        field.set(this, parsedValue);
                    } else {
                        LOGGER.log(Level.WARNING, "Failed to parse value '" + value + "' for field: " + fieldName);
                    }
                }

            } catch (NoSuchFieldException e) {
                LOGGER.log(Level.SEVERE, "Field not found: " + fieldName, e);
            } catch (IllegalAccessException e) {
                LOGGER.log(Level.SEVERE, "Error accessing field: " + fieldName, e);
            } catch (Exception e) {
                LOGGER.log(Level.SEVERE, "Unexpected error processing field: " + fieldName, e);
            }
        }
    }

    private Object parseValue(Class<?> fieldType, String value) throws Exception {
        try {
            Method parseMethod = fieldType.getMethod("parse", String.class);
            Object instance = fieldType.getDeclaredConstructor().newInstance();
            return parseMethod.invoke(instance, value);
        } catch (NoSuchMethodException e) {
            // Handle case where parse method doesn't exist, potentially use default handling or throw
            throw new IllegalArgumentException("No parse method found for type: " + fieldType.getName(), e);
        } catch (InvocationTargetException e) {
            throw new IllegalArgumentException("Error invoking parse method for type: " + fieldType.getName(), e);
        }
    }

    /**
     * Obtient la valeur de la propriété field13C.
     * 
     * @return
     *     possible object is
     *     {@link Field13CType }
     *     
     */
    //getters and setters
    public Field13CType getField13C() {
        return field13C;
    }

    /**
     * Définit la valeur de la propriété field13C.
     * 
     * @param value
     *     allowed object is
     *     {@link Field13CType }
     *     
     */
    public void setField13C(Field13CType value) {
        this.field13C = value;
    }

    /**
     * Obtient la valeur de la propriété field20.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField20() {
        return field20;
    }

    /**
     * Définit la valeur de la propriété field20.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField20(String value) {
        this.field20 = value;
    }

    /**
     * Obtient la valeur de la propriété field23B.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField23B() {
        return field23B;
    }

    /**
     * Définit la valeur de la propriété field23B.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField23B(String value) {
        this.field23B = value;
    }

    /**
     * Obtient la valeur de la propriété field23E.
     * 
     * @return
     *     possible object is
     *     {@link Field23EType }
     *     
     */
    public Field23EType getField23E() {
        return field23E;
    }

    /**
     * Définit la valeur de la propriété field23E.
     * 
     * @param value
     *     allowed object is
     *     {@link Field23EType }
     *     
     */
    public void setField23E(Field23EType value) {
        this.field23E = value;
    }

    /**
     * Obtient la valeur de la propriété field26T.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField26T() {
        return field26T;
    }

    /**
     * Définit la valeur de la propriété field26T.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField26T(String value) {
        this.field26T = value;
    }

    /**
     * Obtient la valeur de la propriété field32A.
     * 
     * @return
     *     possible object is
     *     {@link Field32AType }
     *     
     */
    public Field32AType getField32A() {
        return field32A;
    }

    /**
     * Définit la valeur de la propriété field32A.
     * 
     * @param value
     *     allowed object is
     *     {@link Field32AType }
     *     
     */
    public void setField32A(Field32AType value) {
        this.field32A = value;
    }

    /**
     * Obtient la valeur de la propriété field33B.
     * 
     * @return
     *     possible object is
     *     {@link Field33BType }
     *     
     */
    public Field33BType getField33B() {
        return field33B;
    }

    /**
     * Définit la valeur de la propriété field33B.
     * 
     * @param value
     *     allowed object is
     *     {@link Field33BType }
     *     
     */
    public void setField33B(Field33BType value) {
        this.field33B = value;
    }

    /**
     * Obtient la valeur de la propriété field36.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField36() {
        return field36;
    }

    /**
     * Définit la valeur de la propriété field36.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField36(String value) {
        this.field36 = value;
    }

    /**
     * Obtient la valeur de la propriété field50A.
     * 
     * @return
     *     possible object is
     *     {@link Field50AType }
     *     
     */
    public Field50AType getField50A() {
        return field50A;
    }

    /**
     * Définit la valeur de la propriété field50A.
     * 
     * @param value
     *     allowed object is
     *     {@link Field50AType }
     *     
     */
    public void setField50A(Field50AType value) {
        this.field50A = value;
    }

    /**
     * Obtient la valeur de la propriété field50F.
     * 
     * @return
     *     possible object is
     *     {@link Field50FType }
     *     
     */
    public Field50FType getField50F() {
        return field50F;
    }

    /**
     * Définit la valeur de la propriété field50F.
     * 
     * @param value
     *     allowed object is
     *     {@link Field50FType }
     *     
     */
    public void setField50F(Field50FType value) {
        this.field50F = value;
    }

    /**
     * Obtient la valeur de la propriété field50K.
     * 
     * @return
     *     possible object is
     *     {@link Field50KType }
     *     
     */
    public Field50KType getField50K() {
        return field50K;
    }

    /**
     * Définit la valeur de la propriété field50K.
     * 
     * @param value
     *     allowed object is
     *     {@link Field50KType }
     *     
     */
    public void setField50K(Field50KType value) {
        this.field50K = value;
    }

    /**
     * Obtient la valeur de la propriété field51A.
     * 
     * @return
     *     possible object is
     *     {@link Field51AType }
     *     
     */
    public Field51AType getField51A() {
        return field51A;
    }

    /**
     * Définit la valeur de la propriété field51A.
     * 
     * @param value
     *     allowed object is
     *     {@link Field51AType }
     *     
     */
    public void setField51A(Field51AType value) {
        this.field51A = value;
    }

    /**
     * Obtient la valeur de la propriété field52A.
     * 
     * @return
     *     possible object is
     *     {@link Field52AType }
     *     
     */
    public Field52AType getField52A() {
        return field52A;
    }

    /**
     * Définit la valeur de la propriété field52A.
     * 
     * @param value
     *     allowed object is
     *     {@link Field52AType }
     *     
     */
    public void setField52A(Field52AType value) {
        this.field52A = value;
    }

    /**
     * Obtient la valeur de la propriété field52D.
     * 
     * @return
     *     possible object is
     *     {@link Field52DType }
     *     
     */
    public Field52DType getField52D() {
        return field52D;
    }

    /**
     * Définit la valeur de la propriété field52D.
     * 
     * @param value
     *     allowed object is
     *     {@link Field52DType }
     *     
     */
    public void setField52D(Field52DType value) {
        this.field52D = value;
    }

    /**
     * Obtient la valeur de la propriété field53A.
     * 
     * @return
     *     possible object is
     *     {@link Field53AType }
     *     
     */
    public Field53AType getField53A() {
        return field53A;
    }

    /**
     * Définit la valeur de la propriété field53A.
     * 
     * @param value
     *     allowed object is
     *     {@link Field53AType }
     *     
     */
    public void setField53A(Field53AType value) {
        this.field53A = value;
    }

    /**
     * Obtient la valeur de la propriété field54A.
     * 
     * @return
     *     possible object is
     *     {@link Field54AType }
     *     
     */
    public Field54AType getField54A() {
        return field54A;
    }

    /**
     * Définit la valeur de la propriété field54A.
     * 
     * @param value
     *     allowed object is
     *     {@link Field54AType }
     *     
     */
    public void setField54A(Field54AType value) {
        this.field54A = value;
    }

    /**
     * Obtient la valeur de la propriété field55A.
     * 
     * @return
     *     possible object is
     *     {@link Field55AType }
     *     
     */
    public Field55AType getField55A() {
        return field55A;
    }

    /**
     * Définit la valeur de la propriété field55A.
     * 
     * @param value
     *     allowed object is
     *     {@link Field55AType }
     *     
     */
    public void setField55A(Field55AType value) {
        this.field55A = value;
    }

    /**
     * Obtient la valeur de la propriété field53B.
     *
     * @return possible object is
     * {@link Field53AType }
     */
    public Field53BType getField53B() {
        return field53B;
    }

    /**
     * Définit la valeur de la propriété field53B.
     * 
     * @param value
     *     allowed object is
     *     {@link Field53AType }
     *     
     */
    public void setField53B(Field53BType value) {
        this.field53B = value;
    }

    /**
     * Obtient la valeur de la propriété field54B.
     *
     * @return possible object is
     * {@link Field54AType }
     */
    public Field54BType getField54B() {
        return field54B;
    }

    /**
     * Définit la valeur de la propriété field54B.
     * 
     * @param value
     *     allowed object is
     *     {@link Field54AType }
     *     
     */
    public void setField54B(Field54BType value) {
        this.field54B = value;
    }

    /**
     * Obtient la valeur de la propriété field55B.
     *
     * @return possible object is
     * {@link Field55AType }
     */
    public Field55BType getField55B() {
        return field55B;
    }

    /**
     * Définit la valeur de la propriété field55B.
     * 
     * @param value
     *     allowed object is
     *     {@link Field55AType }
     *     
     */
    public void setField55B(Field55BType value) {
        this.field55B = value;
    }

    /**
     * Obtient la valeur de la propriété field53D.
     *
     * @return possible object is
     * {@link Field53AType }
     */
    public Field53DType getField53D() {
        return field53D;
    }

    /**
     * Définit la valeur de la propriété field53D.
     * 
     * @param value
     *     allowed object is
     *     {@link Field53AType }
     *     
     */
    public void setField53D(Field53DType value) {
        this.field53D = value;
    }

    /**
     * Obtient la valeur de la propriété field54D.
     *
     * @return possible object is
     * {@link Field54AType }
     */
    public Field54DType getField54D() {
        return field54D;
    }

    /**
     * Définit la valeur de la propriété field54D.
     * 
     * @param value
     *     allowed object is
     *     {@link Field54AType }
     *     
     */
    public void setField54D(Field54DType value) {
        this.field54D = value;
    }

    /**
     * Obtient la valeur de la propriété field55D.
     *
     * @return possible object is
     * {@link Field55AType }
     */
    public Field55DType getField55D() {
        return field55D;
    }

    /**
     * Définit la valeur de la propriété field55D.
     * 
     * @param value
     *     allowed object is
     *     {@link Field55AType }
     *     
     */
    public void setField55D(Field55DType value) {
        this.field55D = value;
    }

    /**
     * Obtient la valeur de la propriété field56A.
     * 
     * @return
     *     possible object is
     *     {@link Field56AType }
     *     
     */
    public Field56AType getField56A() {
        return field56A;
    }

    /**
     * Définit la valeur de la propriété field56A.
     * 
     * @param value
     *     allowed object is
     *     {@link Field56AType }
     *     
     */
    public void setField56A(Field56AType value) {
        this.field56A = value;
    }

    /**
     * Obtient la valeur de la propriété field56C.
     * 
     * @return
     *     possible object is
     *     {@link Field56CType }
     *     
     */
    public String getField56C() {
        return field56C;
    }

    /**
     * Définit la valeur de la propriété field56C.
     * 
     * @param value
     *     allowed object is
     *     {@link Field56CType }
     *     
     */
    public void setField56C(String value) {
        this.field56C = value;
    }

    /**
     * Obtient la valeur de la propriété field56D.
     * 
     * @return
     *     possible object is
     *     {@link Field56DType }
     *     
     */
    public Field56DType getField56D() {
        return field56D;
    }

    /**
     * Définit la valeur de la propriété field56D.
     * 
     * @param value
     *     allowed object is
     *     {@link Field56DType }
     *     
     */
    public void setField56D(Field56DType value) {
        this.field56D = value;
    }

    /**
     * Obtient la valeur de la propriété field57A.
     * 
     * @return
     *     possible object is
     *     {@link Field57AType }
     *     
     */
    public Field57AType getField57A() {
        return field57A;
    }

    /**
     * Définit la valeur de la propriété field57A.
     * 
     * @param value
     *     allowed object is
     *     {@link Field57AType }
     *     
     */
    public void setField57A(Field57AType value) {
        this.field57A = value;
    }

    /**
     * Obtient la valeur de la propriété field57B.
     * 
     * @return
     *     possible object is
     *     {@link Field57BType }
     *     
     */
    public Field57BType getField57B() {
        return field57B;
    }

    /**
     * Définit la valeur de la propriété field57B.
     * 
     * @param value
     *     allowed object is
     *     {@link Field57BType }
     *     
     */
    public void setField57B(Field57BType value) {
        this.field57B = value;
    }

    /**
     * Obtient la valeur de la propriété field57C.
     *
     * @return possible object is
     * {@link Field57CType }
     */
    public Field57CType getField57C() {
        return field57C;
    }

    /**
     * Définit la valeur de la propriété field57C.
     * 
     * @param value
     *     allowed object is
     *     {@link Field57CType }
     *     
     */
    public void setField57C(Field57CType value) {
        this.field57C = value;
    }

    /**
     * Obtient la valeur de la propriété field57D.
     * 
     * @return
     *     possible object is
     *     {@link Field57DType }
     *     
     */
    public Field57DType getField57D() {
        return field57D;
    }

    /**
     * Définit la valeur de la propriété field57D.
     * 
     * @param value
     *     allowed object is
     *     {@link Field57DType }
     *     
     */
    public void setField57D(Field57DType value) {
        this.field57D = value;
    }

    /**
     * Obtient la valeur de la propriété field59.
     * 
     * @return
     *     possible object is
     *     {@link Field59Type }
     *     
     */
    public Field59Type getField59() {
        return field59;
    }

    /**
     * Définit la valeur de la propriété field59.
     * 
     * @param value
     *     allowed object is
     *     {@link Field59Type }
     *     
     */
    public void setField59(Field59Type value) {
        this.field59 = value;
    }

    /**
     * Obtient la valeur de la propriété field59A.
     * 
     * @return
     *     possible object is
     *     {@link Field59AType }
     *     
     */
    public Field59AType getField59A() {
        return field59A;
    }

    /**
     * Définit la valeur de la propriété field59A.
     * 
     * @param value
     *     allowed object is
     *     {@link Field59AType }
     *     
     */
    public void setField59A(Field59AType value) {
        this.field59A = value;
    }

    /**
     * Obtient la valeur de la propriété field59F.
     * 
     * @return
     *     possible object is
     *     {@link Field59FType }
     *     
     */
    public Field59FType getField59F() {
        return field59F;
    }

    /**
     * Définit la valeur de la propriété field59F.
     * 
     * @param value
     *     allowed object is
     *     {@link Field59FType }
     *     
     */
    public void setField59F(Field59FType value) {
        this.field59F = value;
    }

    /**
     * Obtient la valeur de la propriété field70.
     * 
     * @return
     *     possible object is
     *     {@link Field70Type }
     *     
     */
    public String getField70() {
        return field70;
    }

    /**
     * Définit la valeur de la propriété field70.
     * 
     * @param value
     *     allowed object is
     *     {@link Field70Type }
     *     
     */
    public void setField70(String value) {
        this.field70 = value;
    }

    /**
     * Obtient la valeur de la propriété field71A.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField71A() {
        return field71A;
    }

    /**
     * Définit la valeur de la propriété field71A.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField71A(String value) {
        this.field71A = value;
    }

    /**
     * Obtient la valeur de la propriété field71F.
     * 
     * @return
     *     possible object is
     *     {@link Field71FType }
     *     
     */
    public Field71FType getField71F() {
        return field71F;
    }

    /**
     * Définit la valeur de la propriété field71F.
     * 
     * @param value
     *     allowed object is
     *     {@link Field71FType }
     *     
     */
    public void setField71F(Field71FType value) {
        this.field71F = value;
    }

    /**
     * Obtient la valeur de la propriété field71G.
     * 
     * @return
     *     possible object is
     *     {@link Field71GType }
     *     
     */
    public Field71GType getField71G() {
        return field71G;
    }

    /**
     * Définit la valeur de la propriété field71G.
     * 
     * @param value
     *     allowed object is
     *     {@link Field71GType }
     *     
     */
    public void setField71G(Field71GType value) {
        this.field71G = value;
    }

    /**
     * Obtient la valeur de la propriété field72.
     *
     * @return possible object is
     * {@link Field72Type }
     */
    public Field72Type getField72() {
        return field72;
    }

    /**
     * Définit la valeur de la propriété field72.
     * 
     * @param value
     *     allowed object is
     *     {@link Field72Type }
     *     
     */
    public void setField72(Field72Type value) {
        this.field72 = value;
    }

    /**
     * Obtient la valeur de la propriété field77B.
     * 
     * @return
     *     possible object is
     *     {@link Field77BType }
     *     
     */
    public String getField77B() {
        return field77B;
    }

    /**
     * Définit la valeur de la propriété field77B.
     * 
     * @param value
     *     allowed object is
     *     {@link Field77BType }
     *     
     */
    public void setField77B(String value) {
        this.field77B = value;
    }

}
