// Concatenation of two String Algorithm Implementation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Concatenation {
    // Main function
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter the first string: ");
            String str = br.readLine();
            System.out.print("Enter the second string: ");
            String str1 = br.readLine();
            // Printing the input strings
            System.out.println("First string: " + str);
            System.out.println("Second string: " + str1);

            // Concatenating the two strings using + operator
            String concatenatedStr = str + str1;
            System.out.println("After concatenation (using + operator): " + concatenatedStr);

            // Using StringBuilder to concatenate strings (efficient for multiple concatenations)
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str1);
            System.out.println("After concatenation (using StringBuilder): " + sb.toString());
        }
    }
}