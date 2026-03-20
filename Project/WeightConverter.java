// Java Notes: Weight Converter
// Concepts Used: Variables, Scanner, Arithmetic, printf, If-Else

import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {

        /*
        ============================================
        1. Program Idea
        ============================================
        - Convert weight between pounds (lbs) and kilograms (kg)
        - Formula:
          1 lb = 0.453592 kg
          1 kg = 2.20462 lbs
        - User selects conversion type
        */

        Scanner input = new Scanner(System.in);

        System.out.println("=== Weight Converter ===");
        System.out.println("Choose conversion type:");
        System.out.println("1. Pounds (lbs) to Kilograms (kg)");
        System.out.println("2. Kilograms (kg) to Pounds (lbs)");

        System.out.print("Enter your choice (1 or 2): ");
        int choice = input.nextInt();

        if (choice == 1) {
            // Pounds to Kilograms
            System.out.print("Enter weight in pounds (lbs): ");
            double pounds = input.nextDouble();

            double kg = pounds * 0.453592; // conversion formula
            System.out.printf("%.2f lbs = %.2f kg%n", pounds, kg);

        } else if (choice == 2) {
            // Kilograms to Pounds
            System.out.print("Enter weight in kilograms (kg): ");
            double kg = input.nextDouble();

            double pounds = kg * 2.20462; // conversion formula
            System.out.printf("%.2f kg = %.2f lbs%n", kg, pounds);

        } else {
            System.out.println("Invalid choice! Please enter 1 or 2.");
        }

        /*
        ============================================
        2. Summary Notes for Students:
        ============================================
        1. User selects conversion using if-else
        2. Arithmetic used for conversion:
           - lbs to kg: multiply by 0.453592
           - kg to lbs: multiply by 2.20462
        3. printf used for formatted output with 2 decimals
        4. Scanner used to get user input
        5. Always check user choice for valid input
        */

        input.close();
        System.out.println("\n=== End of Weight Converter Program ===");
    }
}