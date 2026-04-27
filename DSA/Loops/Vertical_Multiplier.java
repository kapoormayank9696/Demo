// Vertical Multiplier Tables Print Algorithm Implementation In Java
import java.util.Scanner;
public class Vertical_Multiplier {
    // Main function
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of terms: ");
            int n = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(j+" * "+i+" = "+(i*j)+"\t");
                }
                System.out.println();
            }
        }
    }
}
