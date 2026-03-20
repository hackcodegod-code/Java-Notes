// Java Notes: String Methods
// Concepts Used: Variables, String, Scanner, String Methods

import java.util.Scanner;

public class StringMethodsNotes {
    public static void main(String[] args) {

        /*
        ============================================
        1. What is a String?
        ============================================
        - A String is a sequence of characters in Java.
        - Strings are objects and have many useful methods.
        - Example:
          String name = "Alice";
        */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println("\n=== String Methods Examples ===");

        /*
        ============================================
        2. Common String Methods
        ============================================
        */

        // Length of string
        System.out.println("Length of name: " + name.length());

        // Convert to uppercase
        System.out.println("Uppercase: " + name.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + name.toLowerCase());

        // Check if string contains a word
        System.out.println("Contains 'a'? " + name.contains("a"));

        // Check if string starts with a character or word
        System.out.println("Starts with 'A'? " + name.startsWith("A"));

        // Check if string ends with a character or word
        System.out.println("Ends with 'e'? " + name.endsWith("e"));

        // Character at a specific index
        System.out.println("Character at index 0: " + name.charAt(0));

        // Index of a character or substring
        System.out.println("Index of 'i': " + name.indexOf("i"));

        // Substring
        System.out.println("Substring (0 to 3): " + name.substring(0, 3));

        // Replace characters or words
        System.out.println("Replace 'a' with '@': " + name.replace('a', '@'));

        // Trim (removes leading and trailing spaces)
        String nameWithSpaces = "  " + name + "  ";
        System.out.println("Trimmed name: '" + nameWithSpaces.trim() + "'");

        /*
        ============================================
        3. Comparing Strings
        ============================================
        - equals(): checks if two strings are exactly equal
        - equalsIgnoreCase(): ignores case differences
        */
        String name2 = "alice";
        System.out.println("Equals name2? " + name.equals(name2));
        System.out.println("EqualsIgnoreCase name2? " + name.equalsIgnoreCase(name2));

        /*
        ============================================
        4. Summary of Important String Methods
        ============================================
        1. length() → length of string
        2. toUpperCase() / toLowerCase() → change case
        3. charAt(index) → character at specific index
        4. substring(start, end) → extract part of string
        5. contains("text") → check if text exists
        6. startsWith()/endsWith() → check beginning/end
        7. replace(oldChar, newChar) → replace characters
        8. trim() → remove leading/trailing spaces
        9. equals() / equalsIgnoreCase() → compare strings
        10. indexOf("text") → find index of substring
        */

        input.close();
        System.out.println("\n=== End of String Methods Notes ===");
    }
}