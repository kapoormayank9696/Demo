// Diamond Pattern Algorithm Implementation In Java
import java.util.Scanner;
public class Diamond_Pattern {
    // Function to print the diamond pattern
    public static void printDiamond(int n) {
        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }

    // Main function
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)) {
            System.out.print("Enter the number of rows for the diamond pattern: ");
            int n = sc.nextInt();
            printDiamond(n);
        }
    }
}
