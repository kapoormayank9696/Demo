// Permutation of a String Algorithm Implementation in Java
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Permutation {
    // Function to swap characters at position i and j in a string
    private static String swap(String str, int i, int j) {
        char[] charArray=str.toCharArray();
        char temp=charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;
        return String.valueOf(charArray);
    }
    
    // Recursive function to generate permutations of a string
    private static void permute(String str, int left, int right) {
        if(left==right) {
            System.out.println(str);
        } else {
            for(int i=left;i<=right;i++) {
                // Swap the current index with the left index
                str=swap(str, left, i);
                // Recur for the next level of permutation
                permute(str, left + 1, right);
                str=swap(str, left, i); // backtrack
            }
        }
    }

    // Main function
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        try(BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter a string: ");
            String str=reader.readLine();
            System.out.println("Permutations of the string are:");
            permute(str, 0, str.length() - 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
