// Alphabet Pyramid Pattern Algorithm Implementation In Java
import java.util.Scanner;
public class Alphabet_Pyramid_Pattern {
    // Function to print the alphabet pyramid pattern
    public static void printAlphabetPyramid(int n) {
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print alphabets
            for (int k = 0; k <= i; k++) {
                char alphabet = (char) ('A' + k);
                System.out.print(alphabet + " ");
            }
            System.out.println();
        }
    }

    // Main function
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)) {
            System.out.print("Enter the number of rows for the alphabet pyramid: ");
            int n = sc.nextInt();
            printAlphabetPyramid(n);
        }
    }
}
