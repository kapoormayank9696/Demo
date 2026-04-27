// Sum Of Series Algorithm Implementation In Java
// [1 - X²/2! + X⁴/4! - …]
import java.util.Scanner;
public class Sum_Of_Series {
    // Main function
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of X: ");
            int x = sc.nextInt();
            System.out.print("Input the number of terms : ");
            int n = sc.nextInt();
            // Initialize sum with the first term of the series
            double sum = 1.0;
            // Initialize the first term
            double term,t=1.0; 
            for (int i = 1; i < n; i++) {
                // Calculate the next term
                term = (2*i) * (2*i - 1); 
                t = -t * x * x / term; 
                // Add the term to the sum
                sum += t; 
            }
            System.out.println("The sum of the series is: " + sum);
        }
    }
}
