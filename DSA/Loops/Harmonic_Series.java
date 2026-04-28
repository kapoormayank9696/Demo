// Harmonic Series Algorithm Implementation In Java
import java.util.Scanner;
public class Harmonic_Series {
    // Main function
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of n: ");
            int n = sc.nextInt();
            double harmonicSum = 0.0;
            for (int i = 1; i <= n; i++) {
                if(i < n) {
                    System.out.print("1/" + i + " + ");
                } else {
                    System.out.print("1/" + i);
                }
            harmonicSum += 1.0 / i; // Adding the reciprocal of i to the sum
            }        
        System.out.printf("\nSum of Series upto %d terms: %.6f%n", n, harmonicSum);
        }
    }
}

