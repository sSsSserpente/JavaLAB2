package Task_4;

import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // Creating a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Asking the user to input a positive number
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        // Checking if the number is indeed positive
        if (number <= 0) {
            System.out.println("The entered number is not positive.");
            return; // Exiting the program
        }

        // Computing the sum of numbers from 1 to the input number
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        // Displaying the sum on the screen
        System.out.println("The sum of numbers from 1 to " + number + " is " + sum);

        // Closing the Scanner
        scanner.close();
    }
}
