// Check String has Space or not Algorithm Implementation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class IsSpace {
    
    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));) {
            System.out.print("Enter a string: ");
            String str=br.readLine();
            System.out.println("Print the string: "+str);
            // Loop through the string to check for spaces
            boolean hasSpace = false;  // Flag to track if a space is found
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    hasSpace = true;  // Set flag to true if space is found
                    break;  // Exit the loop early when a space is found
                }
            }
            // Output result based on whether a space was found or not
            if (hasSpace) {
                System.out.println("Yes, the string has a space.");
            } else {
                System.out.println("No, the string has no space.");
            }
        }
    }
}
