// Check string is a lowercase or not Algorithm Implementation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class IsLower {
    // Function to check string a lowercase or not
    public static boolean isLowerCase(String str) {
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(Character.isLetter(ch) && !Character.isLowerCase(ch)){
                return false;
            }
        }
        return true;
    }

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));){
            System.out.print("Enter a string: ");
            String str=br.readLine();
            if(isLowerCase(str)) {
                System.out.println("String is a lowercase....\n");
            } else{
                System.out.println("String is not the lowercase....\n");
            }
        }
    }
}
