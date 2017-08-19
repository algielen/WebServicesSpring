//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.08.19 à 06:51:59 PM CEST 
//


package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour drinkType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="drinkType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="alcohol"/&gt;
 *     &lt;enumeration value="juice"/&gt;
 *     &lt;enumeration value="soda"/&gt;
 *     &lt;enumeration value="water"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "drinkType")
@XmlEnum
public enum DrinkType {

    @XmlEnumValue("alcohol")
    ALCOHOL("alcohol"),
    @XmlEnumValue("juice")
    JUICE("juice"),
    @XmlEnumValue("soda")
    SODA("soda"),
    @XmlEnumValue("water")
    WATER("water");
    private final String value;

    DrinkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DrinkType fromValue(String v) {
        for (DrinkType c: DrinkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
