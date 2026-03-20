// Java Notes: Substring + Email Validation
// Concepts Used: String, substring(), indexOf(), contains(), Scanner

import java.util.Scanner;

public class EmailValidationNotes {
    public static void main(String[] args) {

        /*
        ============================================
        1. What are we doing?
        ============================================
        - Validate if a string is an email (basic check for '@')
        - Extract username (before '@') and domain (after '@')
        - Learn how to use:
          - .contains() → check if string contains a character or substring
          - indexOf() → find position of a character
          - substring() → extract parts of the string
        */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = input.nextLine();

        // 2. Validate if email contains '@'
        if (email.contains("@")) {  // basic email check
            System.out.println("Valid email format!");

            // 3. Find index of '@'
            int atIndex = email.indexOf('@');

            // 4. Extract username
            String username = email.substring(0, atIndex);
            System.out.println("Username: " + username);

            // 5. Extract domain
            String domain = email.substring(atIndex + 1);
            System.out.println("Domain: " + domain);

        } else {
            System.out.println("Invalid email! Missing '@' symbol.");
        }

        /*
        ============================================
        6. Additional Example: First Name / Last Name
        ============================================
        - Extract first and last name from full name using substring and indexOf
        */
        System.out.print("\nEnter your full name (First Last): ");
        String fullName = input.nextLine();

        if (fullName.contains(" ")) { // check if there is a space
            int spaceIndex = fullName.indexOf(' ');
            String firstName = fullName.substring(0, spaceIndex);
            String lastName = fullName.substring(spaceIndex + 1);

            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
        } else {
            System.out.println("No space found! Cannot extract first and last name.");
        }

        /*
        ============================================
        7. Summary Notes for Students:
        ============================================
        1. .contains("text") → check if string contains the text
        2. indexOf('char') → returns index of character (-1 if not found)
        3. substring(start, end) → extract from start to end-1
        4. substring(start) → extract from start to end of string
        5. Useful for:
           - Email validation and username/domain extraction
           - Extracting first and last name
        6. Always check for character existence before using indexOf/substrings
        */

        input.close();
        System.out.println("\n=== End of Email + Substring Notes ===");
    }
}