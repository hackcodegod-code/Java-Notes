// Java Notes: If-Else Statements (Beginner Friendly)

import java.util.Scanner;

public class IfElseNotes {
    public static void main(String[] args) {

        /*
        ============================================
        1. What is If-Else?
        ============================================
        - Used to make decisions in a program
        - Syntax:
          if (condition) {
              // code runs if condition is true
          } else {
              // code runs if condition is false
          }
        */

        Scanner input = new Scanner(System.in);

        /*
        ============================================
        2. Example 1: Check if number is positive, negative, or zero
        ============================================
        */
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        /*
        ============================================
        3. Example 2: Check if user is eligible to vote
        ============================================
        - Voting age = 18
        */
        System.out.print("\nEnter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are NOT eligible to vote.");
        }

        /*
        ============================================
        4. Example 3: Compare two numbers
        ============================================
        */
        System.out.print("\nEnter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater than " + num1);
        } else {
            System.out.println("Both numbers are equal.");
        }

        /*
        ============================================
        5. Tips:
        ============================================
        - Condition inside if() must be boolean (true/false)
        - else-if allows multiple checks
        - else runs when all previous conditions are false
        - Use braces {} even for single-line code for readability
        */

        input.close();

        /*
        ============================================
        END OF IF-ELSE NOTES
        ============================================
        */
    }
}