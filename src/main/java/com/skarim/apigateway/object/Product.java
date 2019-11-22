package com.skarim.apigateway.object;

public class Product {
    private String code;
    private String productName;

    public Product(String code, String productName) {
        this.code = code;
        this.productName = productName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
