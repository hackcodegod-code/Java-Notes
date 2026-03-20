
// Java Mini Project: Shopping Cart Program (Well-Documented)
// Concepts Used: Variables, Scanner (User Input), Arithmetic

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {

        /*
        ============================================
        1. Create Scanner Object
        ============================================
        - Used to take input from the user
        */
        Scanner input = new Scanner(System.in);

        /*
        ============================================
        2. Declare Variables
        ============================================
        - String  -> for text (item name)
        - double  -> for price (decimal values)
        - int     -> for quantity (whole number)
        */
        String itemName;
        double price;
        int quantity;
        double totalCost;

        /*
        ============================================
        3. Take User Input
        ============================================
        */

        // Input item name (full line allowed)
        System.out.print("Enter item name: ");
        itemName = input.nextLine();

        // Input price
        System.out.print("Enter price of item: ");
        price = input.nextDouble();

        // Input quantity
        System.out.print("Enter quantity: ");
        quantity = input.nextInt();

        /*
        ============================================
        4. Perform Calculation
        ============================================
        - Total cost = price × quantity
        */
        totalCost = price * quantity;

        /*
        ============================================
        5. Display Output
        ============================================
        */
        System.out.println("\n========== Shopping Cart ==========");
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : " + price);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Total Cost: " + totalCost);

        /*
        ============================================
        6. Close Scanner
        ============================================
        - Good practice to free resources
        */
        input.close();

        /*
        ============================================
        END OF PROGRAM
        ============================================
        */
    }
}