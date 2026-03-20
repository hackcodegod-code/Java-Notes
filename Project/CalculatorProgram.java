// Java Mini Project: Calculator Program
// Concepts Used: Variables, Scanner, Arithmetic, Enhanced Switch, printf

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {

        /*
        ============================================
        1. Program Idea
        ============================================
        - Simple calculator for basic arithmetic operations:
          Addition, Subtraction, Multiplication, Division, Modulus
        - User selects operation type
        - Enhanced switch handles operations cleanly
        */

        Scanner input = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===");

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.println("\nSelect operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulus (%)");

        System.out.print("Enter your choice (1-5): ");
        int choice = input.nextInt();

        double result;

        // Enhanced switch for operations
        switch (choice) {
            case 1 -> { // Addition
                result = num1 + num2;
                System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, result);
            }
            case 2 -> { // Subtraction
                result = num1 - num2;
                System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, result);
            }
            case 3 -> { // Multiplication
                result = num1 * num2;
                System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, result);
            }
            case 4 -> { // Division
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, result);
                } else {
                    System.out.println("Error: Division by zero is not allowed!");
                }
            }
            case 5 -> { // Modulus
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.printf("%.2f %% %.2f = %.2f%n", num1, num2, result);
                } else {
                    System.out.println("Error: Modulus by zero is not allowed!");
                }
            }
            default -> System.out.println("Invalid choice! Please select 1-5.");
        }

        /*
        ============================================
        2. Summary Notes for Students
        ============================================
        1. Enhanced switch (Java 14+) used for cleaner operation selection
        2. Arithmetic operators: +, -, *, /, %
        3. printf formats the result with 2 decimals
        4. Always check for division/modulus by zero
        5. Scanner reads input from user
        6. Can easily extend calculator for more operations
        */

        input.close();
        System.out.println("\n=== End of Calculator Program ===");
    }
}