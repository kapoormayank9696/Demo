// Reverse Number Print Algorithm Implementation In Java
import java.util.Scanner;
public class Reverse_Number {
    // Function to reverse a number
    public static int reverseNumber(int num) {
        int reversedNum = 0;
        while (num > 0) {
            int digit = num % 10; // Get the last digit
            reversedNum = reversedNum * 10 + digit; // Append the digit to the reversed number
            num /= 10; // Remove the last digit
        }
        return reversedNum;
    }

    // Main function
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            int reversedNum = reverseNumber(num);
            System.out.println("Reversed Number: " + reversedNum);
        }
    }
}
