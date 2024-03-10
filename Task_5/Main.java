package Task_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        
        // Loop until user inputs 1
        while (true) {
            // Asking the user to input two numbers
            System.out.print("Enter the first number: ");
            num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            num2 = scanner.nextInt();
            
            // Calculating and displaying the product of the two numbers
            System.out.println("The product of " + num1 + " and " + num2 + " is: " + (num1 * num2));
            
            // Asking the user if they want to continue
            System.out.print("Enter 1 to finish or any other number to continue: ");
            int choice = scanner.nextInt();
            
            // Exiting the loop if the user inputs 1
            if (choice == 1) {
                break;
            }
        }
        
        // Closing the Scanner
        scanner.close();
    }
}
