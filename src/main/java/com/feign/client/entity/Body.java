package com.feign.client.entity;

public class Body {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Body{" +
                "data='" + data + '\'' +
                '}';
    }
}
