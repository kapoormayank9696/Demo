// Palindrome Number Check Algorithm Implementation In Java
import java.util.Scanner;
public class Palindrome_Number {
    // Main function
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            int originalNum = num;
            int reversedNum = 0;

            while (num > 0) {
                int digit = num % 10; // Get the last digit
                reversedNum = reversedNum * 10 + digit; // Append the digit to the reversed number
                num /= 10; // Remove the last digit
            }

            if (originalNum == reversedNum) {
                System.out.println(originalNum + " is a palindrome number.");
            } else {
                System.out.println(originalNum + " is not a palindrome number.");
            }
        }
    }
}
