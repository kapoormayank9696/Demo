// String Tokens Implementation In Java

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringTokens{
    
    // Main function
    public static void main(String[] args) throws Exception{
        @SuppressWarnings("unused")
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string: ");
        String s=br.readLine();
        // Remove leading /trailing spaces
        s=s.trim();
        // If String s is an empty after trimming
        if(s.isEmpty()){
            System.out.println(0);
            return;
        }
        String[] token=s.split("[^A-Za-z]+");
        System.out.println("Length of String: "+token.length);
        for(String str:token) {
            System.out.println(str);
        }
        br.close();
    }
}

