
package com.amberfin.ws.dark._2014._07.transcode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getJobDetailsFromDate complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getJobDetailsFromDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="submissionDate" type="{http://amberfin.com/ws/dark/2014/07/Transcode}jobDate" minOccurs="0"/>
 *         &lt;element name="endOfExecutionDate" type="{http://amberfin.com/ws/dark/2014/07/Transcode}jobDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getJobDetailsFromDate", propOrder = {
    "submissionDate",
    "endOfExecutionDate"
})
public class GetJobDetailsFromDate {

    protected JobDate submissionDate;
    protected JobDate endOfExecutionDate;

    /**
     * Ruft den Wert der submissionDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JobDate }
     *     
     */
    public JobDate getSubmissionDate() {
        return submissionDate;
    }

    /**
     * Legt den Wert der submissionDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JobDate }
     *     
     */
    public void setSubmissionDate(JobDate value) {
        this.submissionDate = value;
    }

    /**
     * Ruft den Wert der endOfExecutionDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JobDate }
     *     
     */
    public JobDate getEndOfExecutionDate() {
        return endOfExecutionDate;
    }

    /**
     * Legt den Wert der endOfExecutionDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JobDate }
     *     
     */
    public void setEndOfExecutionDate(JobDate value) {
        this.endOfExecutionDate = value;
    }

}
