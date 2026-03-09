// Convert A String Into UpperCase Algorithm Implmentation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ConvertUpperCase {
    // Main function
    public static void main(String[] args) throws Exception{
        try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in));){
            System.out.print("Enter a String: ");
            String str=br.readLine();
            System.out.println("Original string: "+str);
            System.out.println("Convert a string into uppercase : "+str.toUpperCase());
            br.close();
        }
    }
}
