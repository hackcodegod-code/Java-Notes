// Java Notes: For Loops
// Concepts Used: Variables, Scanner, For Loop, Arithmetic

import java.util.Scanner;

public class ForLoopsNotes {
    public static void main(String[] args) {

        /*
        ============================================
        1. What is a For Loop?
        ============================================
        - A for loop repeats a block of code **a known number of times**
        - Syntax:
          for (initialization; condition; update) {
              // code to repeat
          }
        - Order of execution:
          1. initialization → executed once at the start
          2. condition → checked before each iteration
          3. loop body → executed if condition is true
          4. update → executed after each iteration
        */

        Scanner input = new Scanner(System.in);

        // Example 1: Print numbers from 1 to 5
        System.out.println("Example 1: Numbers from 1 to 5");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Example 2: Sum of first n numbers
        System.out.print("\nEnter a number n to sum 1 to n: ");
        int n = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i; // add current number to sum
        }
        System.out.println("Sum of 1 to " + n + " is: " + sum);

        // Example 3: Print multiplication table of a number
        System.out.print("\nEnter a number to print its multiplication table: ");
        int num = input.nextInt();

        System.out.println("Multiplication table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", num, i, num * i);
        }

        /*
        ============================================
        2. Notes for Students
        ============================================
        1. for(initialization; condition; update) → loop runs while condition is true
        2. Initialization: sets starting value (e.g., int i = 1)
        3. Condition: determines when loop stops (e.g., i <= 5)
        4. Update: modifies loop variable after each iteration (e.g., i++)
        5. Useful when number of iterations is **known**
        6. Can be nested for advanced problems (nested loops)
        7. Use printf for formatted output
        */

        input.close();
        System.out.println("\n=== End of For Loop Notes ===");
    }
}