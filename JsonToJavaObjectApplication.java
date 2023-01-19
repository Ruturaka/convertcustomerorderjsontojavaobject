package com.confluxsys.demo;

import com.confluxsys.demo.bean.OrderItems;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JsonToJavaObjectApplication {
    public static void main(String[] args) {
        System.out.println("heyy");
        SpringApplication.run(JsonToJavaObjectApplication.class, args);
        System.out.println("bye");
    }
}
