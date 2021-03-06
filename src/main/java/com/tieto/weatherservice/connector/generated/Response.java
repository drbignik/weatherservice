//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.05 at 05:43:13 PM CET 
//


package com.tieto.weatherservice.connector.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="termsofService" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element ref="{}features" minOccurs="0"/>
 *         &lt;element ref="{}current_observation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "version",
    "termsofService",
    "features",
    "currentObservation"
})
@XmlRootElement(name = "response")
public class Response {

    protected float version;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String termsofService;
    protected Features features;
    @XmlElement(name = "current_observation")
    protected CurrentObservation currentObservation;

    /**
     * Gets the value of the version property.
     * 
     */
    public float getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     */
    public void setVersion(float value) {
        this.version = value;
    }

    /**
     * Gets the value of the termsofService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsofService() {
        return termsofService;
    }

    /**
     * Sets the value of the termsofService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsofService(String value) {
        this.termsofService = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link Features }
     *     
     */
    public Features getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link Features }
     *     
     */
    public void setFeatures(Features value) {
        this.features = value;
    }

    /**
     * Gets the value of the currentObservation property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentObservation }
     *     
     */
    public CurrentObservation getCurrentObservation() {
        return currentObservation;
    }

    /**
     * Sets the value of the currentObservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentObservation }
     *     
     */
    public void setCurrentObservation(CurrentObservation value) {
        this.currentObservation = value;
    }

}
