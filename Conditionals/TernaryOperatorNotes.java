// Java Notes: Ternary Operator
// Concepts Used: Variables, If-Else, Ternary Operator

public class TernaryOperatorNotes {
    public static void main(String[] args) {

        /*
        ============================================
        1. What is a Ternary Operator?
        ============================================
        - A shorthand for if-else statements.
        - Syntax:
          condition ? valueIfTrue : valueIfFalse;
        - Returns a value based on the condition.
        - Useful for simple conditional assignments.
        */

        // Example 1: Find maximum of two numbers
        int a = 10;
        int b = 20;

        // Using if-else
        int max1;
        if (a > b) {
            max1 = a;
        } else {
            max1 = b;
        }
        System.out.println("Maximum using if-else: " + max1);

        // Using ternary operator
        int max2 = (a > b) ? a : b;
        System.out.println("Maximum using ternary: " + max2);

        // Example 2: Check if number is even or odd
        int number = 15;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is " + result);

        // Example 3: Assign grade based on marks
        int marks = 85;
        char grade = (marks >= 90) ? 'A' :
                     (marks >= 75) ? 'B' :
                     (marks >= 50) ? 'C' : 'F';
        System.out.println("Grade: " + grade);

        /*
        ============================================
        2. Important Notes:
        ============================================
        1. condition ? valueIfTrue : valueIfFalse;
        2. Can be **nested** for multiple conditions
        3. Useful for **short assignments**, not for long blocks
        4. Always make sure the ternary expression returns a value of the correct type
        5. Makes code **shorter and readable** for simple decisions
        */

        System.out.println("\n=== End of Ternary Operator Notes ===");
    }
}