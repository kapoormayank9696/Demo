// Count Uppercase, Lowercase, and Other Characters Algorithm Implementation In Java
import java.io.*;
public class Count_Of_String {
    
    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int lowerCount = 0, upperCount = 0, others = 0;

            System.out.println("Input characters: On Linux systems and OS X EOF is CTRL+D. For Windows EOF is CTRL+Z.");

            int ch;
            while((ch = reader.read()) != -1) {
                char chr=(char) ch;
                if(Character.isUpperCase(chr)) {
                    upperCount++;
                }

                else if(Character.isLowerCase(chr)) {
                    lowerCount++;
                }

                else {
                    others++;
                }
            }

            // Displaying the results
            System.out.println("Uppercase letters: "+upperCount);
            System.out.println("Lowercase letters: "+lowerCount);
            System.out.println("Other characters: "+others);

        }
    }    
}
