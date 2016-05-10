
package com.amberfin.ws.dark._2014._07.transcode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für jobReplyParameters complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="jobReplyParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allStates" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="referenceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wsdlLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jobReplyParameters", propOrder = {
    "allStates",
    "referenceId",
    "wsdlLocation"
})
public class JobReplyParameters {

    @XmlElement(defaultValue = "false")
    protected boolean allStates;
    @XmlElement(required = true)
    protected String referenceId;
    @XmlElement(required = true)
    protected String wsdlLocation;

    /**
     * Ruft den Wert der allStates-Eigenschaft ab.
     * 
     */
    public boolean isAllStates() {
        return allStates;
    }

    /**
     * Legt den Wert der allStates-Eigenschaft fest.
     * 
     */
    public void setAllStates(boolean value) {
        this.allStates = value;
    }

    /**
     * Ruft den Wert der referenceId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Legt den Wert der referenceId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId(String value) {
        this.referenceId = value;
    }

    /**
     * Ruft den Wert der wsdlLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsdlLocation() {
        return wsdlLocation;
    }

    /**
     * Legt den Wert der wsdlLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsdlLocation(String value) {
        this.wsdlLocation = value;
    }

}
