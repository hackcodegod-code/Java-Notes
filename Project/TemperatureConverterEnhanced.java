package Project;
// Java Mini Project: Temperature Converter (Enhanced Switch)
// Concepts Used: Variables, Scanner, Arithmetic, printf, Enhanced Switch

import java.util.Scanner;

public class TemperatureConverterEnhanced {
    public static void main(String[] args) {

        /*
        ============================================
        1. Program Idea
        ============================================
        - Convert temperature between Celsius, Fahrenheit, and Kelvin
        - Enhanced switch simplifies code
        - Formulas:
          Celsius ↔ Fahrenheit: F = C * 9/5 + 32, C = (F-32) * 5/9
          Celsius ↔ Kelvin: K = C + 273.15, C = K - 273.15
          Fahrenheit ↔ Kelvin: K = (F-32)*5/9 + 273.15, F = (K-273.15)*9/5 +32
        */

        Scanner input = new Scanner(System.in);

        System.out.println("=== Temperature Converter (Enhanced Switch) ===");
        System.out.println("Choose conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");

        System.out.print("Enter your choice (1-6): ");
        int choice = input.nextInt();

        System.out.print("Enter the temperature: ");
        double temperature = input.nextDouble();
        double converted;

        // Enhanced switch using arrow syntax
        switch (choice) {
            case 1 -> { // Celsius to Fahrenheit
                converted = temperature * 9 / 5 + 32;
                System.out.printf("%.2f °C = %.2f °F%n", temperature, converted);
            }
            case 2 -> { // Fahrenheit to Celsius
                converted = (temperature - 32) * 5 / 9;
                System.out.printf("%.2f °F = %.2f °C%n", temperature, converted);
            }
            case 3 -> { // Celsius to Kelvin
                converted = temperature + 273.15;
                System.out.printf("%.2f °C = %.2f K%n", temperature, converted);
            }
            case 4 -> { // Kelvin to Celsius
                converted = temperature - 273.15;
                System.out.printf("%.2f K = %.2f °C%n", temperature, converted);
            }
            case 5 -> { // Fahrenheit to Kelvin
                converted = (temperature - 32) * 5 / 9 + 273.15;
                System.out.printf("%.2f °F = %.2f K%n", temperature, converted);
            }
            case 6 -> { // Kelvin to Fahrenheit
                converted = (temperature - 273.15) * 9 / 5 + 32;
                System.out.printf("%.2f K = %.2f °F%n", temperature, converted);
            }
            default -> System.out.println("Invalid choice! Please enter a number between 1 and 6.");
        }

        /*
        ============================================
        2. Summary Notes for Students
        ============================================
        1. Enhanced switch uses arrow `->` for cleaner code
        2. No need for `break` statements
        3. Allows multi-line code using { } blocks
        4. Use arithmetic formulas for temperature conversion
        5. printf formats output with 2 decimals
        6. Scanner reads user input
        */

        input.close();
        System.out.println("\n=== End of Temperature Converter Program (Enhanced Switch) ===");
    }
}