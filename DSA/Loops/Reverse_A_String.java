// Reverse a String Algorithm Implementation In Java
import java.util.Scanner;
public class Reverse_A_String {
    // Function to reverse a string
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    // Main function
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            String reversedStr = reverseString(str);
            System.out.println("Reversed string: " + reversedStr);
        }
    }
}
