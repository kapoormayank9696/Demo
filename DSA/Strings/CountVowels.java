// Count Vowels Algorithm Implementation In Java

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountVowels {
     // Main function
     public static void main(String[] args) throws Exception{
        try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in));){
            System.out.print("Enter a String: ");
            String str=br.readLine();
            System.out.println("User input string: "+str);
            int count=0;
            for(int i=0;i<str.length();i++) {
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    count++;
                }
                if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt
                (i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                    count++;
                }
            }
            System.out.println("String carry "+count+" numbers of vowels...");
            br.close();
        }
    }
}
