package org.example;

import org.example.calculator.Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println("Suma: " + calculator.addition(5, 7));
        System.out.println("Resta: " + calculator.subtract(5, 3));
        System.out.println("Multiplicacion: " + calculator.multiply(7, 7));
        System.out.println("Divicion: " + calculator.divide(9, 3));
    }
}