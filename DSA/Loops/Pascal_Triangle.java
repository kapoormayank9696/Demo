// Pascal's Triangle Algorithm Implementation in Java
import java.util.Scanner;
public class Pascal_Triangle {
    // Main function
    public static void main(String[] args) {
        // System.out.format:- format string → contains text + placeholders 
        // (like %d, %s) values → the data you want to insert
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows for Pascal's Triangle: ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int number = 1;
                System.out.format("%" + (n - i) * 2 + "s", ""); // Formatting for center alignment
                for (int j = 0; j <= i; j++) {
                    // %4d Print an integer (d), Use at least 4 spaces, 
                    // Right-align by default
                    System.out.format("%4d", number); // Print the current number with spacing
                    number = number * (i - j) / (j + 1); // Calculate the next number in the row
                }
                System.out.println(); // Move to the next line after each row
            }
        }
    }
}
