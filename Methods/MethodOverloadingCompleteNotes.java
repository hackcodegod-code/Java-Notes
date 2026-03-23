// Java Notes: Method Overloading (Complete)
// Concepts Used: Overloading Rules, Examples, Edge Cases, Exam Points

public class MethodOverloadingCompleteNotes {
    public static void main(String[] args) {

        /*
        ============================================
        1. What is Method Overloading?
        ============================================
        - Same method name with different parameters
        - Also called Compile-Time Polymorphism
        - Improves readability and reusability
        */

        System.out.println("=== Method Overloading Demo ===\n");

        /*
        ============================================
        2. Overloading by Number of Parameters
        ============================================
        */
        System.out.println("add(5, 10) = " + add(5, 10));
        System.out.println("add(5, 10, 15) = " + add(5, 10, 15));

        /*
        ============================================
        3. Overloading by Data Type
        ============================================
        */
        System.out.println("multiply(2, 3) = " + multiply(2, 3));
        System.out.println("multiply(2.5, 3.5) = " + multiply(2.5, 3.5));

        /*
        ============================================
        4. Overloading by Order of Parameters
        ============================================
        */
        display(21, "Ram");
        display("Sita", 20);

        /*
        ============================================
        5. Type Promotion in Overloading
        ============================================
        - Java automatically promotes smaller types
        - byte → short → int → long → float → double
        */
        show(10);      // int method
        show(10.5);    // double method

        /*
        ============================================
        6. Automatic Type Conversion Example
        ============================================
        */
        test(5);       // int → matches int method
        test(5.5);     // double → matches double method

        /*
        ============================================
        7. Ambiguity Example (IMPORTANT)
        ============================================
        - If no exact match and multiple possible matches → ERROR
        */
        // ambiguous(10, 20); ❌ Can cause ambiguity in some cases

        /*
        ============================================
        8. Summary Notes (VERY IMPORTANT)
        ============================================
        1. Same method name, different parameters
        2. Change:
           - Number of parameters
           - Data type
           - Order
        3. Return type alone is NOT enough
        4. Happens at compile-time
        5. Type promotion applies if no exact match
        */

        /*
        ============================================
        9. Invalid Overloading (Exam Trap)
        ============================================

        ❌ NOT ALLOWED:

        public static int add(int a, int b)
        public static double add(int a, int b)

        Reason:
        - Only return type changed → NOT valid overloading
        */

        System.out.println("\n=== End of Notes ===");
    }

    /*
    ============================================
    Method Definitions
    ============================================
    */

    // 1. Number of parameters
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // 2. Data type
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    // 3. Order of parameters
    public static void display(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }

    public static void display(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // 4. Type Promotion Example
    public static void show(int a) {
        System.out.println("int method called: " + a);
    }

    public static void show(double a) {
        System.out.println("double method called: " + a);
    }

    // 5. Automatic Conversion
    public static void test(int a) {
        System.out.println("int version: " + a);
    }

    public static void test(double a) {
        System.out.println("double version: " + a);
    }

    /*
    ============================================
    6. Ambiguity Example (Study Only)
    ============================================

    public static void ambiguous(int a, double b) {
        System.out.println("int, double");
    }

    public static void ambiguous(double a, int b) {
        System.out.println("double, int");
    }

    Calling:
    ambiguous(10, 20); ❌ Compiler confused
    */

}