// Prime Number Algorithm Implementation In Java
import java.util.Scanner;
public class Prime_Number {
    // Main function
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            boolean isPrime = true; // Assume the number is prime until proven otherwise
            
            if (num <= 1) {
                isPrime = false; // 0 and 1 are not prime numbers
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) { // Check up to the square root of num
                    if (num % i == 0) { // If num is divisible by any number other than 1 and itself
                        isPrime = false;
                        break; // No need to check further
                    }
                }
            }
            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }
}

