package myproject;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double num1, num2;
        char operator;
        double result = 0;

        System.out.println("===== SIMPLE CALCULATOR =====");

        // Input numbers
        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();

        // Input operator
        System.out.print("Enter operator (+, -, *, /): ");
        operator = sc.next().charAt(0);

        // Switch case for operations
        switch(operator) {
            
            case '+':
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;

            case '/':
                if(num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operator!");
        }

        sc.close();
    }
}