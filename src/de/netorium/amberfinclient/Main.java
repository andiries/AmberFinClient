package de.netorium.amberfinclient;

import com.amberfin.ws.dark._2014._07.transcode.TranscodeWS;
import com.amberfin.ws.dark._2014._07.transcode.TranscodeWSException_Exception;
import com.amberfin.ws.dark._2014._07.transcode.TranscodeWSService;

import javax.xml.ws.BindingProvider;

public class Main {

    public static void main(String[] args) {
        TranscodeWSService amberfinService = new TranscodeWSService();
        TranscodeWS amberfin = amberfinService.getTranscodeWSPort();

        String endpointURL = "http://NEW_ENDPOINT_URL";
        BindingProvider bindingProvider = (BindingProvider)amberfin;
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpointURL);

        int progress;
        try {
            progress = amberfin.getJobProgress("");
        } catch (TranscodeWSException_Exception e) {
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
