// Recursion Numbers Checking Algorithm Implementation In Java
import java.util.Scanner;
public class Recursion_Numbers {
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if (isNumber(n)) {
            System.out.println(n + " is a valid number.");
        } else {
            System.out.println(n + " is not a valid number.");
        }
    }
}
