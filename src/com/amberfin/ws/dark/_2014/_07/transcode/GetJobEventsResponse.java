
package com.amberfin.ws.dark._2014._07.transcode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getJobEventsResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getJobEventsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="events" type="{http://amberfin.com/ws/dark/2014/07/Transcode}jobEvents" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getJobEventsResponse", propOrder = {
    "events"
})
public class GetJobEventsResponse {

    protected JobEvents events;

    /**
     * Ruft den Wert der events-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JobEvents }
     *     
     */
    public JobEvents getEvents() {
        return events;
    }

    /**
     * Legt den Wert der events-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JobEvents }
     *     
     */
    public void setEvents(JobEvents value) {
        this.events = value;
    }

}
