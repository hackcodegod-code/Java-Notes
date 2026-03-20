// Java Notes: Arithmetic Operations (Clean & Warning-Free)

public class ArithmeticNotes {
    public static void main(String[] args) {

        /*
        ============================================
        1. What are Arithmetic Operators?
        ============================================
        - Used to perform mathematical calculations
        */

        /*
        ============================================
        2. Basic Arithmetic Operators
        ============================================
        +  -> Addition
        -  -> Subtraction
        *  -> Multiplication
        /  -> Division
        %  -> Modulus (remainder)
        */

        int a = 10;
        int b = 3;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("\n--- Basic Operations ---");
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b)); // integer division
        System.out.println("Modulus (a % b): " + (a % b));

        /*
        ============================================
        3. Integer vs Double Division
        ============================================
        - int / int → integer result
        - double / double → decimal result
        */

        double x = 10.0;
        double y = 3.0;

        System.out.println("\n--- Division Difference ---");
        System.out.println("Integer division (a / b): " + (a / b));
        System.out.println("Double division (x / y): " + (x / y));

        /*
        ============================================
        4. Increment and Decrement
        ============================================
        ++ -> increase by 1
        -- -> decrease by 1
        */

        int num = 5;

        System.out.println("\n--- Increment / Decrement ---");
        num++; // num = num + 1
        System.out.println("After increment: " + num);

        num--; // num = num - 1
        System.out.println("After decrement: " + num);

        /*
        ============================================
        5. Compound Assignment Operators
        ============================================
        +=  -> add and assign
        -=  -> subtract and assign
        *=  -> multiply and assign
        /=  -> divide and assign
        */

        int value = 10;

        System.out.println("\n--- Compound Assignment ---");
        value += 5;
        System.out.println("After += 5: " + value);

        value -= 3;
        System.out.println("After -= 3: " + value);

        value *= 2;
        System.out.println("After *= 2: " + value);

        value /= 4;
        System.out.println("After /= 4: " + value);

        /*
        ============================================
        6. Order of Operations (BODMAS)
        ============================================
        - Brackets ()
        - Division / Multiplication
        - Addition / Subtraction
        */

        int result = (a + b) * 2;
        System.out.println("\n--- Order of Operations ---");
        System.out.println("(a + b) * 2 = " + result);

        /*
        ============================================
        END OF NOTES
        ============================================
        */
    }
}