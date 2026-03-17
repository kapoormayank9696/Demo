// Check Strings are Anagram or not Algorithm Implementation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Anagram {
    // Function to check strings are anagram or not
    public static boolean isAnagram(String str,String str1) {
        if(str.length() != str1.length()) return false;
        int[] count=new int[256];
        for(int i=0;i<str.length();i++) {
            char c=str.charAt(i);
            count[c]++;
        }
        for(int i=0;i<str1.length();i++) {
            char c=str1.charAt(i);
            count[c]--;
        }
        for(int i=0;i<256;i++) {
            if(count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));) {
            System.out.print("Enter first string: ");
            String str=br.readLine();
            System.out.print("Enter second string: ");
            String str1=br.readLine();
            System.out.println("\nDisplay the first string: "+str);
            System.out.println("Display the second string: "+str1);
            if(isAnagram(str,str1)) {
                System.out.println("\nYes, strings are anagram....");
            }else {
                System.out.println("\nNo, strings are not anagram....");
            }
        }
    }
}
