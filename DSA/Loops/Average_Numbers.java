// Average Of N Numbers Algorithm Implementation In Java
import java.util.Scanner;
public class Average_Numbers {
    // Main function
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            double sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i; // sum = sum + num
            }
            double average = sum / n;
            System.out.println("Average of the numbers is: " + average);
        }
    }
}

