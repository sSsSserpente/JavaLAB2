package Task_3;

public class Main {
    public static void main(String[] args) {
        // Display headers for each column
        System.out.println("multiplication table:");
        System.out.print("  ");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n-------------------------------------");

        // Derivation of the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d|", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
