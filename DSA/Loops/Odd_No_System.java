// Odd Natural Number Sum Algorithm Implementation In Java
import java.util.Scanner;
public class Odd_No_System {
    // Main function
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of odd natural numbers to sum: ");
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += (2 * i - 1); // Adding the ith odd number
            }
            System.out.println("The sum of the first " + n + " odd natural numbers is: " + sum);
        }
    }
}
