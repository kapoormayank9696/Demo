// String Spilts Algorithm Implementation In Java

import java.util.Scanner;
public class StringSplits{

    // Main function
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str= sc.nextLine();
        // Split the string by whitespace
        String[] splits=str.split("\\s+"); 
        System.out.println("\nSplitted strings:");
        for(String s: splits) {
            System.out.println(s);
        }
        sc.close();
    }
}
