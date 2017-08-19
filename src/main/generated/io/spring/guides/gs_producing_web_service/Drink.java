//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.08.19 à 06:51:59 PM CEST 
//


package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour drink complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="drink"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="type" type="{http://spring.io/guides/gs-producing-web-service}drinkType"/&gt;
 *         &lt;element name="calories" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "drink", propOrder = {
    "name",
    "type",
    "calories",
    "volume"
})
public class Drink {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DrinkType type;
    protected double calories;
    protected double volume;

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link DrinkType }
     *     
     */
    public DrinkType getType() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link DrinkType }
     *     
     */
    public void setType(DrinkType value) {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propriété calories.
     * 
     */
    public double getCalories() {
        return calories;
    }

    /**
     * Définit la valeur de la propriété calories.
     * 
     */
    public void setCalories(double value) {
        this.calories = value;
    }

    /**
     * Obtient la valeur de la propriété volume.
     * 
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Définit la valeur de la propriété volume.
     * 
     */
    public void setVolume(double value) {
        this.volume = value;
    }

}
