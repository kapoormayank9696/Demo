// Sum Of Even Natural Numbers Algorithm Implementation In Java
import java.util.Scanner;
public class Even_No_System {
    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Even numbers up to " + n + ": ");
        int sum = 0;
        for(int i=1;i<=n;i++) {
            sum += (2*i); // Adding the even number to sum
            System.out.print(2*i + " ");
        }
        System.out.println("\nSum of even numbers up to " + n + ": " + sum);
    }
}
