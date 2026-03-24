package Methods;
// Java Notes: Methods in Java
// Concepts Used: Method Creation, Parameters, Return Types, Method Calling

public class MethodNotes {
    public static void main(String[] args) {

        /*
        ============================================
        1. What is a Method?
        ============================================
        - A method is a block of code that performs a task
        - It runs only when called
        - Helps in code reusability and organization
        */

        System.out.println("Calling methods...\n");

        /*
        ============================================
        2. Calling a Void Method (No Return)
        ============================================
        */
        greet();

        /*
        ============================================
        3. Calling Method with Parameters
        ============================================
        */
        greetUser("Ram");
        greetUser("Sita");

        /*
        ============================================
        4. Calling Method with Return Value
        ============================================
        */
        int sum = add(5, 10);
        System.out.println("Sum = " + sum);

        /*
        ============================================
        5. Using Return Value in Expression
        ============================================
        */
        int result = add(3, 4) * 2;
        System.out.println("Result (add * 2) = " + result);

        /*
        ============================================
        6. Method Overloading (Same name, different parameters)
        ============================================
        */
        int square1 = square(5);
        double square2 = square(2.5);

        System.out.println("Square of 5 = " + square1);
        System.out.println("Square of 2.5 = " + square2);

        /*
        ============================================
        7. Summary Notes:
        ============================================
        1. Method = reusable block of code
        2. void → no return value
        3. return → sends value back
        4. Parameters → inputs to method
        5. Method Overloading → same name, different parameters
        */

        System.out.println("\n=== End of Method Notes ===");
    }

    /*
    ============================================
    Method Definitions
    ============================================
    */

    // 1. Simple void method
    public static void greet() {
        System.out.println("Hello! Welcome to Java Methods.");
    }

    // 2. Method with parameter
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // 3. Method with return value
    public static int add(int a, int b) {
        return a + b;
    }

    // 4. Method Overloading
    public static int square(int num) {
        return num * num;
    }

    public static double square(double num) {
        return num * num;
    }
}