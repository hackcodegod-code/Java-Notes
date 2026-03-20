// Java Notes: Nested If Statements
// Concepts Used: Variables, Scanner, If-Else, Nested If

import java.util.Scanner;

public class NestedIfNotes {
    public static void main(String[] args) {

        /*
        ============================================
        1. What is a Nested If?
        ============================================
        - A nested if is an if statement **inside another if statement**.
        - Useful when you need to check multiple conditions in a hierarchy.
        - Syntax:
          if (condition1) {
              if (condition2) {
                  // code if both conditions are true
              } else {
                  // code if condition1 true but condition2 false
              }
          } else {
              // code if condition1 is false
          }
        */

        Scanner input = new Scanner(System.in);

        /*
        ============================================
        2. Example 1: Grading System
        ============================================
        - Nested if to assign grades based on marks
        */
        System.out.print("Enter marks (0-100): ");
        int marks = input.nextInt();
        char grade;

        if (marks >= 0 && marks <= 100) { // outer if: valid marks
            if (marks >= 90) {
                grade = 'A';
            } else if (marks >= 75) {
                grade = 'B';
            } else if (marks >= 50) {
                grade = 'C';
            } else {
                grade = 'F';
            }
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid marks entered!");
        }

        /*
        ============================================
        3. Example 2: Nested If for Age and Voting
        ============================================
        - Check if user is eligible to vote and check special category
        */
        System.out.print("\nEnter your age: ");
        int age = input.nextInt();

        if (age >= 18) { // eligible to vote
            System.out.println("You are eligible to vote.");
            if (age >= 60) { // special category
                System.out.println("You are eligible for senior citizen benefits.");
            }
        } else {
            System.out.println("You are NOT eligible to vote.");
        }

        /*
        ============================================
        4. Important Notes for Students
        ============================================
        1. Nested if means an if inside another if
        2. Inner if executes **only if outer if is true**
        3. Can have multiple else-if blocks inside outer if
        4. Helps check hierarchical conditions
        5. Avoid too deep nesting for readability
        */

        input.close();
        System.out.println("\n=== End of Nested If Notes ===");
    }
}