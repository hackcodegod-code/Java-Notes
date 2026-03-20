package Conditionals;
// Java Notes: Random Numbers, Dice Roll, Coin Flip (All-in-One)
// Concepts Used: Variables, Arithmetic, Boolean, Loops, Scanner, Math.random()

import java.util.Scanner;

public class RandomAllInOne {
    public static void main(String[] args) {

        /*
        ============================================
        1. Random Numbers in Java
        ============================================
        - Use Math.random() to generate random numbers between 0.0 and 1.0
        - Multiply by range and cast to int to get integer numbers
        */

        System.out.println("=== Random Numbers Examples ===");

        // Random number between 0-9
        int randomNum = (int)(Math.random() * 10); // 0 to 9
        System.out.println("Random number between 0-9: " + randomNum);

        // Random number between 1-6 (dice)
        int dice = (int)(Math.random() * 6) + 1; // 1 to 6
        System.out.println("Dice roll: " + dice);

        // Random number between 1-100
        int random100 = (int)(Math.random() * 100) + 1;
        System.out.println("Random number between 1-100: " + random100);

        /*
        ============================================
        2. Coin Flip Using Boolean
        ============================================
        - true = Heads, false = Tails
        - 50% chance for each
        */
        boolean coin = Math.random() < 0.5; // random boolean

        if (coin) {
            System.out.println("Coin flip: Heads");
        } else {
            System.out.println("Coin flip: Tails");
        }

        /*
        ============================================
        3. Dice Roll Simulation Multiple Times
        ============================================
        */
        Scanner input = new Scanner(System.in);
        System.out.print("\nHow many times do you want to roll the dice? ");
        int rolls = input.nextInt();

        System.out.println("Rolling the dice " + rolls + " times:");
        for (int i = 1; i <= rolls; i++) {
            int roll = (int)(Math.random() * 6) + 1;
            System.out.println("Roll " + i + ": " + roll);
        }

        /*
        ============================================
        4. Key Concepts Summary
        ============================================
        1. Math.random()
           - Returns double between 0.0 (inclusive) and 1.0 (exclusive)
           - Example: 0.0 <= Math.random() < 1.0

        2. Generating integer in range [min, max]
           - Formula: (int)(Math.random() * (max - min + 1)) + min
           - Dice (1-6): (int)(Math.random()*6)+1
           - Random 1-100: (int)(Math.random()*100)+1

        3. Boolean for Coin Flip
           - boolean coin = Math.random() < 0.5
           - true = Heads, false = Tails

        4. Loops for Repeated Random Actions
           - Use for-loop to repeat dice rolls or coin flips

        5. Scanner for user input
           - Scanner input = new Scanner(System.in)
           - input.nextInt() to read integer

        6. Variables
           - int → whole numbers
           - double → decimal numbers
           - boolean → true/false
        */

        input.close();

        System.out.println("\n=== End of Random Numbers Notes ===");
    }
}