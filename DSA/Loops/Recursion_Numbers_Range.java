// Recursion Numbers In Range Algorithm Implementation In Java

import java.util.Scanner;
public class Recursion_Numbers_Range {
    // Function to check number is valid or not
    public static boolean isNumber(int n) {
        int sum=0;
        for(int i=1;i<n;i++) {
            if(n%i==0) {
                sum+=i;
            }
        }
        return sum == n;
    }

    // Main function
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in);) {
            System.out.print("Input the starting range or number : ");
            int start = scanner.nextInt();
            System.out.print("Input the ending range or number : ");
            int end = scanner.nextInt();
            System.out.println("Valid numbers in the range " + start + " to " + end + ":");
            for (int i = start; i <= end; i++) {
                if (isNumber(i)) {
                    System.out.println(i);
                }
            }
        }
    }
}
