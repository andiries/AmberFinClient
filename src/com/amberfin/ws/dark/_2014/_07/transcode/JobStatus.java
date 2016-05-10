
package com.amberfin.ws.dark._2014._07.transcode;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für jobStatus.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="jobStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="QUEUED"/>
 *     &lt;enumeration value="RUNNING"/>
 *     &lt;enumeration value="COMPLETED"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="FAILED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "jobStatus")
@XmlEnum
public enum JobStatus {

    QUEUED,
    RUNNING,
    COMPLETED,
    CANCELLED,
    FAILED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static JobStatus fromValue(String v) {
        return valueOf(v);
    }

}
