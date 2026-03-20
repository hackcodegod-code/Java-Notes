// Java Notes: Logical Operators
// Concepts Used: Variables, Boolean, If-Else, Logical Operators

public class LogicalOperatorsNotes {
    public static void main(String[] args) {

        /*
        ============================================
        1. What are Logical Operators?
        ============================================
        - Logical operators are used to combine multiple conditions
        - Result is always boolean (true/false)
        - Common logical operators in Java:
          1. && → Logical AND
          2. || → Logical OR
          3. !  → Logical NOT
        */

        // Example 1: Logical AND (&&)
        boolean hasID = true;
        boolean hasTicket = true;

        if (hasID && hasTicket) {  // both must be true
            System.out.println("Access granted (AND)");
        } else {
            System.out.println("Access denied (AND)");
        }

        // Example 2: Logical OR (||)
        boolean knowsPassword = false;
        boolean hasBackupKey = true;

        if (knowsPassword || hasBackupKey) { // at least one must be true
            System.out.println("Access granted (OR)");
        } else {
            System.out.println("Access denied (OR)");
        }

        // Example 3: Logical NOT (!)
        boolean isRaining = false;

        if (!isRaining) { // NOT operator reverses boolean
            System.out.println("You can go outside (NOT)");
        } else {
            System.out.println("Stay indoors (NOT)");
        }

        // Example 4: Combined logical operators
        int age = 25;
        boolean hasLicense = true;

        if (age >= 18 && hasLicense) { // AND operator
            System.out.println("Allowed to drive");
        } else {
            System.out.println("Not allowed to drive");
        }

        if (age < 18 || !hasLicense) { // OR + NOT
            System.out.println("Cannot drive (OR + NOT)");
        }

        /*
        ============================================
        2. Summary Notes for Students
        ============================================
        1. && → true only if BOTH conditions are true
        2. || → true if AT LEAST ONE condition is true
        3. !  → reverses boolean value
        4. Can combine operators for complex conditions:
           - Example: if ((age >= 18 && hasLicense) || isAdmin)
        5. Logical operators are often used in if, while, for, and boolean expressions
        */

        System.out.println("\n=== End of Logical Operators Notes ===");
    }
}