// Java Notes: Variable Scope (Local & Class Variables)
// Concepts Used: Variables, Scope, Local Variables, Class Variables, Access Modifiers

public class VariableScopeNotes {

    /*
    ============================================
    1. What is Variable Scope?
    ============================================
    - Scope defines where a variable can be accessed in a program
    - In Java, scope depends on where the variable is declared
    - Main types:
      1. Local Variables (inside methods/blocks)
      2. Class Variables (inside class, outside methods)

    - Scope helps:
      ✔ Organize code
      ✔ Prevent errors
      ✔ Control data access
    */

    // Class Variable (also called Instance Variable)
    int classVar = 100;

    public static void main(String[] args) {

        /*
        ============================================
        2. Local Variables
        ============================================
        - Declared inside a method, constructor, or block
        - Accessible only within that method/block
        - Must be initialized before use
        - Stored in stack memory
        */

        int localVar = 10; // Local variable

        System.out.println("Local Variable: " + localVar);

        // Example: Block scope
        if (true) {
            int blockVar = 20; // Only accessible inside this block
            System.out.println("Block Variable: " + blockVar);
        }

        // System.out.println(blockVar); ❌ ERROR (out of scope)

        /*
        Key Points:
        - Cannot be accessed outside the method/block
        - No default value (must initialize)
        - Created when method starts, destroyed when method ends
        */


        /*
        ============================================
        3. Class Variables (Instance Variables)
        ============================================
        - Declared inside class but outside methods
        - Belong to an object (instance of class)
        - Accessible by all methods of the class
        - Have default values
        */

        VariableScopeNotes obj = new VariableScopeNotes();

        System.out.println("Class Variable: " + obj.classVar);

        obj.modifyClassVar();

        /*
        Key Points:
        - Accessible throughout the class
        - Default values assigned (int = 0, boolean = false, etc.)
        - Stored in heap memory
        - Requires object to access (non-static)
        */


        /*
        ============================================
        4. Difference: Local vs Class Variables
        ============================================
        Local Variable:
        - Declared inside methods
        - Limited scope
        - No default value
        - Must be initialized
        - Stored in stack

        Class Variable:
        - Declared inside class, outside methods
        - Wider scope
        - Has default value
        - Stored in heap
        - Accessed using object
        */


        /*
        ============================================
        5. Summary Notes:
        ============================================
        1. Scope = where variable can be used
        2. Local variables exist only inside methods/blocks
        3. Class variables exist throughout the class
        4. Local variables must be initialized manually
        5. Class variables get default values
        6. Use local variables for temporary data
        7. Use class variables for object-level data
        */

        System.out.println("\n=== End of Variable Scope Notes ===");
    }

    // Method to demonstrate class variable usage
    void modifyClassVar() {
        classVar = 200;
        System.out.println("Modified Class Variable: " + classVar);
    }
}