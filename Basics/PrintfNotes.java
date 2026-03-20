// Java Notes: printf Method in Java
// Concepts Used: Variables, Formatting Output, printf

public class PrintfNotes {
    public static void main(String[] args) {

        /*
        ============================================
        1. What is printf?
        ============================================
        - printf is used to **print formatted output**.
        - Syntax:
          System.out.printf("format string", value1, value2, ...);
        - Does NOT automatically add a new line
          → Use %n for new line or \n
        */

        System.out.println("=== printf Examples ===");

        /*
        ============================================
        2. Basic Placeholders
        ============================================
        %d -> integer
        %f -> floating-point (decimal)
        %s -> string
        %c -> character
        %b -> boolean
        %n -> new line
        */

        int age = 20;
        double price = 49.99;
        String name = "Alice";
        char grade = 'A';
        boolean pass = true;

        // Integer
        System.out.printf("Age: %d%n", age);

        // Floating-point (default 6 decimals)
        System.out.printf("Price: %f%n", price);

        // Floating-point with 2 decimals
        System.out.printf("Price (2 decimals): %.2f%n", price);

        // String
        System.out.printf("Name: %s%n", name);

        // Character
        System.out.printf("Grade: %c%n", grade);

        // Boolean
        System.out.printf("Passed: %b%n", pass);

        /*
        ============================================
        3. Multiple Values in One printf
        ============================================
        */
        System.out.printf("%s is %d years old and has a balance of $%.2f%n", name, age, price);

        /*
        ============================================
        4. Field Width and Alignment
        ============================================
        - %10d → width 10, right-aligned
        - %-10d → width 10, left-aligned
        - %10.2f → width 10, 2 decimals
        */
        System.out.printf("Right-aligned integer: %10d%n", age);
        System.out.printf("Left-aligned integer : %-10dEnd%n", age);
        System.out.printf("Price with width 10 : %10.2f%n", price);

        /*
        ============================================
        5. Using printf for Tables
        ============================================
        */
        System.out.println("\n--- Table Example ---");
        System.out.printf("%-10s %-10s %-10s%n", "Name", "Age", "Score");
        System.out.printf("%-10s %-10d %-10.2f%n", "Alice", 20, 88.5);
        System.out.printf("%-10s %-10d %-10.2f%n", "Bob", 22, 91.75);
        System.out.printf("%-10s %-10d %-10.2f%n", "Charlie", 19, 79.0);

        /*
        ============================================
        6. Summary Notes:
        ============================================
        - printf is used for formatted output
        - Common placeholders: %d, %f, %s, %c, %b, %n
        - %.2f → round floating-point to 2 decimals
        - Field width: %10d → right-align, %-10d → left-align
        - Useful for creating tables and aligned output
        - printf does NOT add a newline automatically
        */

        System.out.println("\n=== End of printf Notes ===");
    }
}