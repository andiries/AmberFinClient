
package com.amberfin.ws.dark._2014._07.transcode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getJobProgressResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getJobProgressResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="progress" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getJobProgressResponse", propOrder = {
    "progress"
})
public class GetJobProgressResponse {

    protected int progress;

    /**
     * Ruft den Wert der progress-Eigenschaft ab.
     * 
     */
    public int getProgress() {
        return progress;
    }

    /**
     * Legt den Wert der progress-Eigenschaft fest.
     * 
     */
    public void setProgress(int value) {
        this.progress = value;
    }

}
