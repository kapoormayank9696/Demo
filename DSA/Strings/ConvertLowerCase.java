// Convert A String Into LowerCase Algorithm Implmentation In Java

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConvertLowerCase {
    // Main function
    public static void main(String[] args) throws Exception{
        try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in));){
            System.out.print("Enter a String: ");
            String str=br.readLine();
            System.out.println("Original string: "+str);
            System.out.println("Convert a string into lowercase : "+str.toLowerCase());
            br.close();
        }
    }
}
