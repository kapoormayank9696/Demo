// String Tokenizer Algorithm Implementation In Java

import java.util.Scanner;
import java.util.StringTokenizer;
public class Tokenizer {
    
    // Main function
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str= sc.nextLine();
        StringTokenizer st= new StringTokenizer(str);
        System.out.println("\nTokens of string are: ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        sc.close();
    }
}
