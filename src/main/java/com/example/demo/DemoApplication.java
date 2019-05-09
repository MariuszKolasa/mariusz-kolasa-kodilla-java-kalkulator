package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        Calculator simpleCalculator = new Calculator();

        double result = simpleCalculator.substractAFromB(7.2, 5);

        System.out.println(result);
    }

}
