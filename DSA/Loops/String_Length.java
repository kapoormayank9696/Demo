// String Length Algorithm Implementation In Java
import java.util.Scanner;
public class String_Length {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            int length = 0;
            for (int i = 0; i < str.length(); i++) {
                length++;
            }
            System.out.println("Length of the string: " + length);
        }        
    }
}

