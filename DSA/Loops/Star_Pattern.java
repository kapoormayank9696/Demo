// Star Pattern Algorithm Implementation In Java
import java.io.BufferedReader;

public class Star_Pattern {
    // Function to print star pattern
    public static void printStarPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Main function
    public static void main(String[] args) throws Exception {
        try(BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in))) {
            System.out.print("Enter the number of rows for the star pattern: ");
            int rows = Integer.parseInt(br.readLine());
            printStarPattern(rows);
        }
    }
}
