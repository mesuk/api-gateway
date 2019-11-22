package com.skarim.apigateway.object;

import java.util.ArrayList;
import java.util.List;

public class MainResponse {
    private String serverName;
    private String ipInfo;
    private String dateTime;
    private List<Product> products;

    public MainResponse() {
        products=new ArrayList<>();
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getIpInfo() {
        return ipInfo;
    }

    public void setIpInfo(String ipInfo) {
        this.ipInfo = ipInfo;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
