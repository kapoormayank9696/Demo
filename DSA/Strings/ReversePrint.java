// Reverse Print String Algorithm Implementation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReversePrint {
    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));){
            System.out.print("Enter a string: ");
            String str=br.readLine();
            System.out.println("Original String: "+str);
            // Reverse the string
            String reversedStr = new StringBuilder(str).reverse().toString();
            System.out.println("Reverse the user input string :"+reversedStr);
        }
    }
}
