package Projects;
// Java Mini Project: Simple Mad Libs Game
// Uses: Variables + Scanner (User Input)

import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args) {

        /*
        ============================================
        1. What is Mad Libs?
        ============================================
        - A word game where user provides words
        - Program inserts them into a story
        */

        /*
        ============================================
        2. Create Scanner Object
        ============================================
        - Used to take input from user
        */
        Scanner input = new Scanner(System.in);

        /*
        ============================================
        3. Declare Variables (Strings)
        ============================================
        - We store user inputs in variables
        */

        String name;
        String place;
        String animal;
        String food;
        String adjective;

        /*
        ============================================
        4. Take User Input
        ============================================
        - Using nextLine() to allow full sentences
        */

        System.out.print("Enter a name: ");
        name = input.nextLine();

        System.out.print("Enter a place: ");
        place = input.nextLine();

        System.out.print("Enter an animal: ");
        animal = input.nextLine();

        System.out.print("Enter a food: ");
        food = input.nextLine();

        System.out.print("Enter an adjective: ");
        adjective = input.nextLine();

        /*
        ============================================
        5. Create Story using Variables
        ============================================
        - Combine text + variables using +
        */

        System.out.println("\n===== Your Mad Libs Story =====");

        System.out.println("One day, " + name + " went to " + place + ".");
        System.out.println("There, they saw a very " + adjective + " " + animal + ".");
        System.out.println("Surprisingly, the " + animal + " was eating " + food + "!");
        System.out.println(name + " couldn't believe their eyes and started laughing.");
        System.out.println("It was a very " + adjective + " day at " + place + "!");

        /*
        ============================================
        6. Close Scanner
        ============================================
        */
        input.close();

        /*
        ============================================
        END OF PROGRAM
        ============================================
        */
    }
}