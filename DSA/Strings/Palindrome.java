// Check String Is Palindrome Or Not Implementation In Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Palindrome{

    // Main function
    public static void main(String[] args) throws IOException {
        @SuppressWarnings("unused")
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string : ");
        String A=br.readLine();
        boolean isPalindrome = true;
        for(int i=0;i<A.length()/2;i++){
            if(A.charAt(i) != A.charAt(A.length()-i-1)){
                isPalindrome = false;
                break;
            }
        }
        // Ternary operation
        System.out.println(isPalindrome ? "Yes" : "No");
        br.close();
    }
}
