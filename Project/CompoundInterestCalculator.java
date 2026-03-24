package Project;
// Java Mini Project: Compound Interest Calculator
// Concepts Used: Variables, Scanner, Arithmetic, Math.pow(), printf

import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {

        /*
        ============================================
        1. Program Idea
        ============================================
        - Calculate compound interest using formula:
          A = P * (1 + r/n)^(n*t)
        Where:
        P = Principal amount
        r = annual interest rate (in decimal)
        n = number of times interest applied per year
        t = number of years
        A = final amount
        */

        Scanner input = new Scanner(System.in);

        /*
        ============================================
        2. Input from User
        ============================================
        */
        System.out.print("Enter Principal amount (P): ");
        double principal = input.nextDouble();

        System.out.print("Enter Annual Interest Rate (r%) : ");
        double rate = input.nextDouble();
        rate = rate / 100; // convert percentage to decimal

        System.out.print("Enter number of times interest compounded per year (n): ");
        int n = input.nextInt();

        System.out.print("Enter number of years (t): ");
        double t = input.nextDouble();

        /*
        ============================================
        3. Calculate Compound Interest
        ============================================
        Formula: A = P * (1 + r/n)^(n*t)
        */
        double amount = principal * Math.pow(1 + rate / n, n * t);
        double interest = amount - principal;

        /*
        ============================================
        4. Display Results using printf
        ============================================
        */
        System.out.println("\n=== Compound Interest Calculator ===");
        System.out.printf("Principal Amount : $%.2f%n", principal);
        System.out.printf("Annual Rate      : %.2f%%%n", rate * 100);
        System.out.printf("Times Compounded : %d%n", n);
        System.out.printf("Number of Years  : %.2f%n", t);
        System.out.printf("Compound Interest: $%.2f%n", interest);
        System.out.printf("Total Amount     : $%.2f%n", amount);

        /*
        ============================================
        5. Summary Notes:
        ============================================
        1. Compound interest formula: A = P * (1 + r/n)^(n*t)
        2. Math.pow(x, y) → x raised to the power y
        3. printf used for formatted output
        4. Always convert percentage to decimal (r/100)
        5. Scanner used for user input
        */

        input.close();
        System.out.println("\n=== End of Program ===");
    }
}