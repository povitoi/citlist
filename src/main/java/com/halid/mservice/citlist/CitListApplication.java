package com.halid.mservice.citlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class CitListApplication {

    public static void main(String[] args) {
        SpringApplication.run(CitListApplication.class, args);
    }

}
