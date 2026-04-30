// Armstrong Numbers in a Range Algorithm Implementation In Java

import java.util.Scanner;
public class Armstrong_Numbers_Range {
    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == originalNumber;
    }

    // Main function
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);) {
            System.out.print("Enter the lower limit of the range: ");
            int lowerLimit = sc.nextInt();
            System.out.print("Enter the upper limit of the range: ");
            int upperLimit = sc.nextInt();
            
            System.out.println("Armstrong numbers in the range " + lowerLimit + " to " + upperLimit + ":");
            for (int i = lowerLimit; i <= upperLimit; i++) {
                if (isArmstrong(i)) {
                    System.out.println(i);
                }
            }
        }
    }
}

