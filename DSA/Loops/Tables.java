// Tables Print Algorithm Implementation In Java
import java.util.Scanner;
public class Tables {
    // Function to print the multiplication table of a given number
    public static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.print("\n"); // Print a new line after each table
        }
    }

    // Main function
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();
        printTable(number);
        sc.close();
    }
}
