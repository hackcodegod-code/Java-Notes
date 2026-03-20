// Java Notes: Math Class Constants and Methods
// Concepts Used: Variables, Arithmetic, Math Methods, Math.PI, Math.E

public class MathConstantsNotes {
    public static void main(String[] args) {

        /*
        ============================================
        1. Math Class Constants
        ============================================
        - Math.PI → value of π ≈ 3.141592653589793
        - Math.E  → value of e ≈ 2.718281828459045
        */
        System.out.println("Math.PI = " + Math.PI);
        System.out.println("Math.E  = " + Math.E);

        /*
        ============================================
        2. Using Math.PI in Calculations
        ============================================
        - Circle area = π * r^2
        - Circle circumference = 2 * π * r
        */
        double radius = 5.0;
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;

        System.out.println("\nCircle with radius " + radius);
        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);

        /*
        ============================================
        3. Using Math.E in Calculations
        ============================================
        - Math.E is useful in exponential calculations
        - Example: e^x = Math.pow(Math.E, x)
        */
        double x = 2.0;
        double exponential = Math.pow(Math.E, x);
        System.out.println("\nExponential e^" + x + " = " + exponential);

        /*
        ============================================
        4. Other Useful Math Methods
        ============================================
        - Absolute value: Math.abs(x)
        - Maximum: Math.max(x, y)
        - Minimum: Math.min(x, y)
        - Square root: Math.sqrt(x)
        - Power: Math.pow(x, y)
        - Rounding: Math.round(x), Math.floor(x), Math.ceil(x)
        - Random: Math.random() → 0.0 ≤ x < 1.0
        - Trigonometry: Math.sin(rad), Math.cos(rad), Math.tan(rad)
        - Degree to radians: Math.toRadians(degree)
        */
        System.out.println("\nOther Math Examples:");
        System.out.println("Math.abs(-7) = " + Math.abs(-7));
        System.out.println("Math.max(5, 10) = " + Math.max(5, 10));
        System.out.println("Math.min(5, 10) = " + Math.min(5, 10));
        System.out.println("Math.sqrt(49) = " + Math.sqrt(49));
        System.out.println("Math.pow(2, 5) = " + Math.pow(2, 5));
        System.out.println("Math.round(4.7) = " + Math.round(4.7));
        System.out.println("Math.floor(4.7) = " + Math.floor(4.7));
        System.out.println("Math.ceil(4.7) = " + Math.ceil(4.7));
        System.out.println("Math.random() = " + Math.random());

        double degree = 45.0;
        double radian = Math.toRadians(degree);
        System.out.println("Math.sin(45°) = " + Math.sin(radian));
        System.out.println("Math.cos(45°) = " + Math.cos(radian));
        System.out.println("Math.tan(45°) = " + Math.tan(radian));

        /*
        ============================================
        5. Summary Notes:
        ============================================
        1. Math.PI → π value for circle calculations
        2. Math.E → e value for exponential calculations
        3. Math.pow(Math.E, x) → calculate e^x
        4. Math.sqrt(x), Math.abs(x), Math.max(x,y), Math.min(x,y)
        5. Math.round(x), Math.floor(x), Math.ceil(x)
        6. Math.random() → random decimal [0.0, 1.0)
        7. Trigonometry functions: sin, cos, tan (use radians)
        */

        System.out.println("\n=== End of Math Class Notes ===");
    }
}