// Java Notes: User Input using Scanner (All-in-One)

import java.util.Scanner;

public class ScannerNotes {
    public static void main(String[] args) {

        /*
        ============================================
        1. Scanner Introduction
        ============================================
        - Scanner is used to take input from user (keyboard)
        - Must import: java.util.Scanner
        - Create object: Scanner input = new Scanner(System.in);
        */

        Scanner input = new Scanner(System.in);

        /*
        ============================================
        2. Input Methods
        ============================================
        nextInt()    -> Integer
        nextDouble() -> Decimal number
        next()       -> Single word (no spaces)
        nextLine()   -> Full line (with spaces)
        charAt(0)    -> First character of input
        */

        // Integer Input
        System.out.print("Enter age: ");
        int age = input.nextInt();

        // Double Input
        System.out.print("Enter price: ");
        double price = input.nextDouble();

        // String (single word)
        System.out.print("Enter name: ");
        String name = input.next();

        /*
        ============================================
        IMPORTANT NOTE
        ============================================
        - After nextInt() / nextDouble(), a newline is left
        - So we must clear it before using nextLine()
        */
        input.nextLine(); // clear buffer

        // String (full line)
        System.out.print("Enter address: ");
        String address = input.nextLine();

        // Character Input
        System.out.print("Enter grade: ");
        char grade = input.next().charAt(0);

        /*
        ============================================
        3. Output
        ============================================
        */

        System.out.println("\n--- User Data ---");
        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Grade: " + grade);

        /*
        ============================================
        4. Closing Scanner
        ============================================
        - Always close Scanner to free resources
        */
        input.close();

        /*
        ============================================
        END OF NOTES
        ============================================
        */
    }
}