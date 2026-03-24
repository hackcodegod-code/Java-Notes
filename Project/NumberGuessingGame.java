package Project;
// Java Mini Project: Number Guessing Game
// Concepts Used: Variables, Scanner, Random, While Loop, If-Else, Counters

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {

        /*
        ============================================
        1. Game Idea
        ============================================
        - Computer selects a random number between 1 and 100
        - User tries to guess the number
        - Program gives hints: "Too low" or "Too high"
        - Count how many turns the user takes to guess correctly
        */

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1; // Random number 1-100
        int userGuess = 0;
        int turns = 0;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Try to guess it!");

        // Loop until user guesses the number
        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = input.nextInt();
            turns++; // count each attempt

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try a higher number.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try a lower number.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
                System.out.println("It took you " + turns + " turns.");
            }
        }

        /*
        ============================================
        2. Notes for Students
        ============================================
        1. Random random = new Random(); → to generate random numbers
        2. random.nextInt(100) + 1 → generates number 1 to 100
        3. while(userGuess != numberToGuess) → repeat until correct
        4. Use counter (turns) to count attempts
        5. Give hints using if-else:
           - userGuess < numberToGuess → too low
           - userGuess > numberToGuess → too high
        6. Scanner used to get user input
        7. Loop stops when userGuess == numberToGuess
        */

        input.close();
        System.out.println("\n=== End of Number Guessing Game ===");
    }
}