// Sum Of Series Algorithm Implementation In Java
import java.util.Scanner;
public class Sum_Of_Serie {
    // Main function
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of n: ");
            int n = sc.nextInt();
            int sum = 0,t=9;
            for (int i = 1; i <= n; i++) {
                sum += t; // sum = sum + i
                t=t*10+9; // t = t*10 + 9
            }
            System.out.println("The sum of the series is: " + sum);
        }
    }
}
