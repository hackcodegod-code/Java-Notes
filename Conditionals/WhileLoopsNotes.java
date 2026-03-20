// Java Notes: While Loops
// Concepts Used: Variables, Scanner, While Loop, Arithmetic

import java.util.Scanner;

public class WhileLoopsNotes {
    public static void main(String[] args) {

        /*
        ============================================
        1. What is a While Loop?
        ============================================
        - A while loop repeats a block of code **as long as a condition is true**.
        - Syntax:
          while (condition) {
              // code to repeat
          }
        - Check condition **before** executing the loop
        */

        Scanner input = new Scanner(System.in);

        // Example 1: Print numbers from 1 to 5
        System.out.println("Example 1: Numbers from 1 to 5");
        int i = 1; // loop counter
        while (i <= 5) { // condition
            System.out.println(i);
            i++; // increment counter to avoid infinite loop
        }

        // Example 2: Sum of numbers until user enters 0
        System.out.println("\nExample 2: Sum numbers until 0 is entered");
        int sum = 0;
        int num;
        do {
            System.out.print("Enter a number (0 to stop): ");
            num = input.nextInt();
            sum += num;
        } while (num != 0); // continue until user enters 0
        System.out.println("Total sum: " + sum);

        // Example 3: Simple password check
        String password = "Java123";
        String inputPassword;
        System.out.println("\nExample 3: Password check (type 'exit' to quit)");

        while (true) { // infinite loop, controlled inside
            System.out.print("Enter password: ");
            inputPassword = input.next();
            if (inputPassword.equals(password)) {
                System.out.println("Correct password!");
                break; // exit loop
            } else if (inputPassword.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Wrong password, try again.");
            }
        }

        /*
        ============================================
        2. Important Notes for Students
        ============================================
        1. while(condition) checks the condition **before** loop body
        2. Can become an **infinite loop** if condition never becomes false
        3. Always update variables inside loop if needed (i++ in Example 1)
        4. Use break to exit a loop early if needed
        5. Suitable for situations where number of iterations is **unknown**
        */

        input.close();
        System.out.println("\n=== End of While Loop Notes ===");
    }
}