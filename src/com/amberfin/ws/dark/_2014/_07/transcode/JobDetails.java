
package com.amberfin.ws.dark._2014._07.transcode;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für jobDetails complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="jobDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://amberfin.com/ws/dark/2014/07/Transcode}jobStatus" minOccurs="0"/>
 *         &lt;element name="progress" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="outputFile" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="submissionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="assignmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="startOfExecutionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endOfExecutionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jobDetails", propOrder = {
    "status",
    "progress",
    "outputFile",
    "priority",
    "submissionDate",
    "assignmentDate",
    "startOfExecutionDate",
    "endOfExecutionDate"
})
public class JobDetails {

    @XmlSchemaType(name = "string")
    protected JobStatus status;
    protected Integer progress;
    protected List<String> outputFile;
    protected Integer priority;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submissionDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar assignmentDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startOfExecutionDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endOfExecutionDate;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JobStatus }
     *     
     */
    public JobStatus getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JobStatus }
     *     
     */
    public void setStatus(JobStatus value) {
        this.status = value;
    }

    /**
     * Ruft den Wert der progress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProgress() {
        return progress;
    }

    /**
     * Legt den Wert der progress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProgress(Integer value) {
        this.progress = value;
    }

    /**
     * Gets the value of the outputFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOutputFile() {
        if (outputFile == null) {
            outputFile = new ArrayList<String>();
        }
        return this.outputFile;
    }

    /**
     * Ruft den Wert der priority-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Legt den Wert der priority-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    /**
     * Ruft den Wert der submissionDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmissionDate() {
        return submissionDate;
    }

    /**
     * Legt den Wert der submissionDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmissionDate(XMLGregorianCalendar value) {
        this.submissionDate = value;
    }

    /**
     * Ruft den Wert der assignmentDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssignmentDate() {
        return assignmentDate;
    }

    /**
     * Legt den Wert der assignmentDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssignmentDate(XMLGregorianCalendar value) {
        this.assignmentDate = value;
    }

    /**
     * Ruft den Wert der startOfExecutionDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartOfExecutionDate() {
        return startOfExecutionDate;
    }

    /**
     * Legt den Wert der startOfExecutionDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartOfExecutionDate(XMLGregorianCalendar value) {
        this.startOfExecutionDate = value;
    }

    /**
     * Ruft den Wert der endOfExecutionDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndOfExecutionDate() {
        return endOfExecutionDate;
    }

    /**
     * Legt den Wert der endOfExecutionDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndOfExecutionDate(XMLGregorianCalendar value) {
        this.endOfExecutionDate = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
