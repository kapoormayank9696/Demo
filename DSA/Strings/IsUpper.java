// Check string is a uppercase or not Algorithm Implementation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class IsUpper {
    // Function to check string a uppercase or not
    public static boolean isUpperCase(String str) {
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(Character.isLetter(ch) && !Character.isUpperCase(ch)){
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
            if (isUpperCase(str)) {
                System.out.println("String is a uppercase....\n");
            } else{
                System.out.println("String is not the uppercase....\n");
            }
        }
    }
}
