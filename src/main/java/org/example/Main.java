package org.example;

import org.example.calculator.Calculator;
import org.example.calculator.InputValidator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Escriba el primer numero: ");
        String input1 = scanner.nextLine();

        System.out.print("Escriba el segundo numero: ");
        String input2 = scanner.nextLine();

        if (InputValidator.isValidNumber(input1) && InputValidator.isValidNumber(input2)) {

            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);
            System.out.println("Suma: " + calculator.addition(num1, num2));
            System.out.println("Resta: " + calculator.subtract(num1, num2));
            System.out.println("Multiplicacion: " + calculator.multiply(num1, num2));
            System.out.println("Divicion: " + calculator.divide(num1, num2));

        }else{
            System.out.println("Entrada incorrecta de datos. Por favor escriba un numero correcto");
        }
    }
}