// User Input String Print Algorithm Implementation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class UserInput {
    // Main function
    public static void main(String[] args) throws Exception{
        try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in));){
            System.out.print("Enter a String: ");
            String str=br.readLine();
            System.out.println("User input string: "+str);
            br.close();
        }

    }
}
