// Java Notes: Variables (Beginner Level)

public class Variables {
    public static void main(String[] args) {

        // -------------------------------
        // 1. What is a Variable?
        // -------------------------------
        // A variable is a container that stores data.
        // It has a type and a name.

        int age = 20; // 'int' stores whole numbers
        System.out.println("Age: " + age);

        // -------------------------------
        // 2. Data Types in Java
        // -------------------------------

        // Integer types
        int number = 10;

        // Decimal numbers
        double price = 99.99;

        // Single character
        char grade = 'A';

        // Boolean (true/false)
        boolean isJavaFun = true;

        // String (text)
        String name = "John";

        System.out.println(number);
        System.out.println(price);
        System.out.println(grade);
        System.out.println(isJavaFun);
        System.out.println(name);

        // -------------------------------
        // 3. Variable Declaration
        // -------------------------------
        // Syntax: dataType variableName = value;

        int marks;       // declaration
        marks = 85;      // assignment

        System.out.println("Marks: " + marks);

        // -------------------------------
        // 4. Changing Variable Value
        // -------------------------------
        int score = 50;
        System.out.println("Old score: " + score);

        score = 80; // updated value
        System.out.println("New score: " + score);

        // -------------------------------
        // 5. Constants (final keyword)
        // -------------------------------
        final double PI = 3.14159;

        System.out.println("PI value: " + PI);

        // PI = 3.14; // ERROR: cannot change final variable

        // -------------------------------
        // 6. Naming Rules
        // -------------------------------
        // - Cannot start with a number
        // - Cannot use keywords (like int, class)
        // - Use meaningful names
        // - Use camelCase (recommended)

        int studentAge = 18; // good
        // int 1age = 18;   // invalid
        // int class = 10;  // invalid

        System.out.println("Student Age: " + studentAge);

        // -------------------------------
        // End of Notes
        // -------------------------------
    }
}