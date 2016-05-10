
package com.amberfin.ws.dark._2014._07.transcode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für jobTime complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="jobTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="hour" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="minute" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="second" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="millisecond" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jobTime")
public class JobTime {

    @XmlAttribute(name = "hour")
    protected Integer hour;
    @XmlAttribute(name = "minute")
    protected Integer minute;
    @XmlAttribute(name = "second")
    protected Integer second;
    @XmlAttribute(name = "millisecond")
    protected Integer millisecond;

    /**
     * Ruft den Wert der hour-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHour() {
        return hour;
    }

    /**
     * Legt den Wert der hour-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHour(Integer value) {
        this.hour = value;
    }

    /**
     * Ruft den Wert der minute-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinute() {
        return minute;
    }

    /**
     * Legt den Wert der minute-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinute(Integer value) {
        this.minute = value;
    }

    /**
     * Ruft den Wert der second-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecond() {
        return second;
    }

    /**
     * Legt den Wert der second-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecond(Integer value) {
        this.second = value;
    }

    /**
     * Ruft den Wert der millisecond-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMillisecond() {
        return millisecond;
    }

    /**
     * Legt den Wert der millisecond-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMillisecond(Integer value) {
        this.millisecond = value;
    }

}
