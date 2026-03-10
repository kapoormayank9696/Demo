// Count Length of String Algorithm Implementation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class LengthOfString {
    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));) {
            System.out.print("Enter a string: ");
            String str=br.readLine();
            System.out.println("Length of String is: "+str.length());
        }
    }
}

