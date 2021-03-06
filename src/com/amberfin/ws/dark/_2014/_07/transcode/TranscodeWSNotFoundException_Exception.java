
package com.amberfin.ws.dark._2014._07.transcode;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "TranscodeWSNotFoundException", targetNamespace = "http://amberfin.com/ws/dark/2014/07/Transcode")
public class TranscodeWSNotFoundException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private TranscodeWSNotFoundException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public TranscodeWSNotFoundException_Exception(String message, TranscodeWSNotFoundException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public TranscodeWSNotFoundException_Exception(String message, TranscodeWSNotFoundException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.amberfin.ws.dark._2014._07.transcode.TranscodeWSNotFoundException
     */
    public TranscodeWSNotFoundException getFaultInfo() {
        return faultInfo;
    }

}
