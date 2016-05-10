
package com.amberfin.ws.dark._2014._07.transcode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.amberfin.schema.transcoderparameters.Transcodeparameters;


/**
 * <p>Java-Klasse für addJob complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="addJob">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.amberfin.com/schema/TranscoderParameters}transcodeparameters"/>
 *         &lt;element name="replyParameters" type="{http://amberfin.com/ws/dark/2014/07/Transcode}jobReplyParameters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addJob", propOrder = {
    "transcodeparameters",
    "replyParameters"
})
public class AddJob {

    @XmlElement(namespace = "http://www.amberfin.com/schema/TranscoderParameters", required = true)
    protected Transcodeparameters transcodeparameters;
    protected JobReplyParameters replyParameters;

    /**
     * Ruft den Wert der transcodeparameters-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Transcodeparameters }
     *     
     */
    public Transcodeparameters getTranscodeparameters() {
        return transcodeparameters;
    }

    /**
     * Legt den Wert der transcodeparameters-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Transcodeparameters }
     *     
     */
    public void setTranscodeparameters(Transcodeparameters value) {
        this.transcodeparameters = value;
    }

    /**
     * Ruft den Wert der replyParameters-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JobReplyParameters }
     *     
     */
    public JobReplyParameters getReplyParameters() {
        return replyParameters;
    }

    /**
     * Legt den Wert der replyParameters-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JobReplyParameters }
     *     
     */
    public void setReplyParameters(JobReplyParameters value) {
        this.replyParameters = value;
    }

}
