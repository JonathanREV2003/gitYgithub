package org.example.calculator;

public class Calculator {

    public int addition(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Sintax error divicion entre cero");
        }
        return (double) a / b;
    }
}
