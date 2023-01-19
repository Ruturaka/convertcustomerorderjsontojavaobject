package com.confluxsys.demo.bean;


import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Customer {
    private String name;
    private String email;
    private String mobile;
    private List<OrderItems> orderItemsList;

    public Customer() {
    }

    public Customer(String name, String email, String mobile, List<OrderItems> orderItemsList) {
        this.name=name;
        this.email=email;
        this.mobile=mobile;
        this.orderItemsList = orderItemsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public List<OrderItems> getOrderItemsList() {
        return orderItemsList;
    }

    public void setOrderItemsList(List<OrderItems> orderItemsList) {
        this.orderItemsList = orderItemsList;
    }

    @Override
    public String toString() {
        return "JsonToJavaObjectBean{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", orderItemsList=" + orderItemsList +
                '}';
    }
}
