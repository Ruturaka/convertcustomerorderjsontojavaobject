package com.confluxsys.demo.controller;
import com.confluxsys.demo.bean.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8088")

@RestController
@RequestMapping("/capi")

public class CustomerController {
    @Autowired
    Customer customers;

    @PostMapping("/customer_order")
    public void postJsonToJavaObject(@RequestBody Customer body)
    {

        customers.setName(body.getName());
        customers.setEmail(body.getEmail());
        customers.setMobile(body.getMobile());
        customers.setOrderItemsList(body.getOrderItemsList());

        System.out.println(customers.toString());
    }
}
