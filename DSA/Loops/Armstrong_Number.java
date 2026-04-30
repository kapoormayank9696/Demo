// check Armstrong number or not Algorithm Implementation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Armstrong_Number {
    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int n = String.valueOf(num).length(); // Number of digits

        while (num > 0) {
            int digit = num % 10; // Get the last digit
            sum += Math.pow(digit, n); // Add the digit raised to the power of n
            num /= 10; // Remove the last digit
        }

        return sum == originalNum; // Check if the sum is equal to the original number
    }
    
    // Main function
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter a number: ");
            int num = Integer.parseInt(reader.readLine());
            if (isArmstrong(num)) {
                System.out.println(num + " is an Armstrong number.");
            } else {
                System.out.println(num + " is not an Armstrong number.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
