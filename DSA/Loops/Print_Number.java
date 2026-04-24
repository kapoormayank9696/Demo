// Print Number From 1 To N Using For Loop In Java
import java.util.Scanner;
public class Print_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
