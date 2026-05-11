// Remove Non Alphabets Algorithm Implementation In Java
import java.io.*;
public class Remove_Non_Alphabets {
    // Function to Remove non Alphabets
    public static String removeAlphabets(String str) {
        String result= "";
        for(int i=0;i<str.length();i++) {
            if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') ||
               (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                result=result+str.charAt(i);
               }
        }
        return result;
    }

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Input the string : ");
            String str=reader.readLine();
            String output=removeAlphabets(str);
            System.out.println( "String after removing non-alphabets: "+output);
        }
    }
}

