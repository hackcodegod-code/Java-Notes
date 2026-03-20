// Java Notes: Enhanced Switch
// Concepts Used: Switch, Enhanced Switch (Java 14+), Variables, Scanner

import java.util.Scanner;

public class EnhancedSwitchNotes {
    public static void main(String[] args) {

        /*
        ============================================
        1. What is Enhanced Switch?
        ============================================
        - Introduced in Java 14 (preview in Java 12-13)
        - Provides a cleaner, concise syntax for switch statements
        - Key features:
          1. Arrow syntax -> replaces old colon and break
          2. Can return values directly
          3. Supports multi-line blocks with { }
          4. Reduces mistakes like forgetting break
        */

        Scanner input = new Scanner(System.in);

        // Example 1: Simple day of the week using enhanced switch
        System.out.print("Enter day number (1-7): ");
        int day = input.nextInt();
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println("Day Name: " + dayName);

        // Example 2: Multi-line code block in enhanced switch
        System.out.print("\nEnter a grade letter (A-F): ");
        char grade = input.next().charAt(0);

        switch (grade) {
            case 'A' -> {
                System.out.println("Excellent!");
                System.out.println("Keep up the great work!");
            }
            case 'B' -> System.out.println("Good Job!");
            case 'C' -> System.out.println("Average, can improve");
            case 'D' -> System.out.println("Below Average, work harder");
            case 'F' -> System.out.println("Failing, needs attention");
            default -> System.out.println("Invalid grade");
        }

        /*
        ============================================
        2. Comparison with Traditional Switch
        ============================================
        Traditional switch:
            switch(day) {
                case 1:
                    System.out.println("Monday");
                    break;
                ...
            }

        Enhanced switch:
            String dayName = switch(day) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                ...
                default -> "Invalid day";
            };

        Key improvements:
        - No need for break statements
        - Can assign return values directly
        - Arrow syntax makes code more readable
        - Supports multi-line blocks with { }
        */

        /*
        ============================================
        3. Summary Notes:
        ============================================
        1. Use `->` for simple statements or returned values
        2. Use `{ }` for multi-line statements
        3. Can assign switch result to a variable
        4. Reduces errors like forgetting `break`
        5. Works with int, char, String, enums
        6. Available in Java 14+
        */

        input.close();
        System.out.println("\n=== End of Enhanced Switch Notes ===");
    }
}