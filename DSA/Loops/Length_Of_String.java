// Length Of String Algorithm Implementation In Java
import java.io.*;
public class Length_Of_String {

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))) {
            
            System.out.print("Input a string : ");
            String str=reader.readLine();

            int sum=0;
            for(int i=0;i<str.length();i++) {
                sum++;
            }

            System.out.println("The string contains "+sum+" number of characters.");
            System.out.println("So, the length of the string welcome is : "+sum);
        }
    }
}
