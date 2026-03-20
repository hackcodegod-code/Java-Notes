// Java Notes: Nested Loops
// Concepts Used: For Loop, While Loop, Nested Loops, Arithmetic, printf

public class NestedLoopsNotes {
    public static void main(String[] args) {

        /*
        ============================================
        1. What are Nested Loops?
        ============================================
        - A loop inside another loop is called a nested loop.
        - The **inner loop** runs completely for each iteration of the **outer loop**.
        - Useful for **patterns, tables, matrices, and multi-level iteration**.
        */

        // Example 1: Print a 3x3 square of stars
        System.out.println("Example 1: 3x3 star square");
        for (int i = 1; i <= 3; i++) { // outer loop for rows
            for (int j = 1; j <= 3; j++) { // inner loop for columns
                System.out.print("* ");
            }
            System.out.println(); // move to next line after inner loop
        }

        // Output:
        // * * *
        // * * *
        // * * *

        // Example 2: Print a multiplication table 1-5
        System.out.println("\nExample 2: Multiplication table 1-5");
        for (int i = 1; i <= 5; i++) { // outer loop for numbers
            for (int j = 1; j <= 5; j++) { // inner loop for multiplication
                System.out.printf("%d x %d = %d\t", i, j, i * j);
            }
            System.out.println(); // move to next line after inner loop
        }

        // Example 3: Right-angled triangle pattern
        System.out.println("\nExample 3: Right-angled triangle pattern");
        int rows = 5;
        for (int i = 1; i <= rows; i++) { // outer loop for each row
            for (int j = 1; j <= i; j++) { // inner loop for stars in each row
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
        ============================================
        2. Notes for Students
        ============================================
        1. Outer loop controls **rows or major iterations**
        2. Inner loop runs **completely** for each outer loop iteration
        3. Useful for:
           - Printing patterns (triangles, squares, pyramids)
           - Multiplication tables
           - Matrix operations
        4. Use nested loops carefully to avoid **too many iterations** (may slow program)
        5. Inner loop can also use break and continue independently of outer loop
        */

        System.out.println("\n=== End of Nested Loops Notes ===");
    }
}