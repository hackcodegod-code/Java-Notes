// Java Notes: Break and Continue
// Concepts Used: For Loop, While Loop, If-Else, Break, Continue

public class BreakContinueNotes {
    public static void main(String[] args) {

        /*
        ============================================
        1. What is break?
        ============================================
        - The break statement **exits the current loop immediately**.
        - Can be used in for, while, or do-while loops.
        - Useful to stop a loop based on a condition.
        */

        System.out.println("Example 1: Break in a for loop");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) { // stop the loop when i is 5
                System.out.println("Breaking the loop at i = " + i);
                break;
            }
            System.out.println("i = " + i);
        }

        /*
        Output:
        i = 1
        i = 2
        i = 3
        i = 4
        Breaking the loop at i = 5
        */

        /*
        ============================================
        2. What is continue?
        ============================================
        - The continue statement **skips the current iteration** of the loop.
        - Loop continues with the next iteration.
        - Useful when you want to **skip certain values** but continue the loop.
        */

        System.out.println("\nExample 2: Continue in a for loop");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { // skip even numbers
                continue;
            }
            System.out.println("Odd number: " + i);
        }

        /*
        Output:
        Odd number: 1
        Odd number: 3
        Odd number: 5
        Odd number: 7
        Odd number: 9
        */

        /*
        ============================================
        3. Notes for Students
        ============================================
        1. break → exits the loop immediately
           - Useful for stopping loops when condition is met
        2. continue → skips the current iteration, moves to next
           - Useful for ignoring certain cases without exiting
        3. Can be used in:
           - for loops
           - while loops
           - do-while loops
        4. Always use carefully to avoid infinite loops
        5. Common examples:
           - break → stop guessing game when correct
           - continue → skip negative numbers or invalid inputs
        */

        System.out.println("\n=== End of Break and Continue Notes ===");
    }
}