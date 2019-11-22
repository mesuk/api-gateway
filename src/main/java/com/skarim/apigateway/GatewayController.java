package com.skarim.apigateway;


import com.skarim.apigateway.object.MainResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

@RestController
public class GatewayController {

    @Autowired
    private Environment environment;

    @RequestMapping(method = RequestMethod.GET, value="/")
    public ResponseEntity<MainResponse> hello(){

        MainResponse mainResponse=new MainResponse();

        String serverName=environment.getProperty("my_message");

        String ipInfo=getIpInfo();

        mainResponse.setServerName(serverName);
        mainResponse.setIpInfo(ipInfo);
        mainResponse.setDateTime(new Date().toString());

        return new ResponseEntity<>(
                mainResponse,
                HttpStatus.OK);
    }

    private String getIpInfo(){

        String ipInfo="";

        InetAddress ip;
        String hostname;
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            ipInfo+=("Your current IP address : " + ip)+"\n";
            ipInfo+=("Your current Hostname : " + hostname);

        } catch (UnknownHostException e) {

            e.printStackTrace();

            ipInfo+=e.getMessage();

        }

        return ipInfo;

    }

}
