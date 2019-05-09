package com.example.demo;

public class Calculator {

    public double addAToB(double a, double b) {
        return a + b;
    }

    public double substractAFromB(double a, double b) {
        return a - b;
    }
    public static void main(String[] args) {


        Calculator simpleCalculator = new Calculator();

        double result = simpleCalculator.substractAFromB(7.2, 5);

        System.out.println(result);
    }
}
