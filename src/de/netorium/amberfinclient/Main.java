package de.netorium.amberfinclient;

import com.amberfin.ws.dark._2014._07.transcode.TranscodeWS;
import com.amberfin.ws.dark._2014._07.transcode.TranscodeWSException_Exception;
import com.amberfin.ws.dark._2014._07.transcode.TranscodeWSService;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException {

        URL endpoint = new URL("http://10.10.10.109:21012/dark/ws/Transcode?wsdl");
        QName qname = new QName("http://amberfin.com/ws/dark/2014/07/Transcode", "TranscodeWSService");

        TranscodeWSService amberfinService = new TranscodeWSService(endpoint, qname);
        TranscodeWS amberfin = amberfinService.getTranscodeWSPort();

        int progress;
        try {
            progress = amberfin.getJobProgress("");
        } catch (TranscodeWSException_Exception e) {
            e.printStackTrace();
        } catch (Exception e)  {
            e.printStackTrace();
        }


//        Transcodeparameters transcodeparameters = new Transcodeparameters();
//        JobReplyParameters jobReplyParameters = new JobReplyParameters();
//        try {
//            amberfin.addJob(transcodeparameters, jobReplyParameters);
//        } catch (TranscodeWSException_Exception e) {
//            e.printStackTrace();
//        }

    }
}
