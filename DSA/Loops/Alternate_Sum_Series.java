// Alternate Sum Series Algorithm Implementation In Java
import java.util.Scanner;
public class Alternate_Sum_Series {
    // Main function
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of value: ");
            int value = sc.nextInt();
            System.out.print("Enter the number of terms n: ");
            int n = sc.nextInt();
            int  alternateSum = 0,ctr,k;
            for (int i = 1; i <= n; i++) {
                ctr=(2*i-1);
                if (i % 2 == 0) {
                    k=(int)Math.pow(value,ctr);
                } else { 
                    k= - (int)Math.pow(value,ctr);
                }
                System.out.println(k);
                alternateSum += k;
            }        
            System.out.println("The Sum Of Series: " + Math.abs(alternateSum));
        }
    }
}
