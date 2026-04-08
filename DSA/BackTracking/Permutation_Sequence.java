// Permutation Sequence Algorithm Implementation In Java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class Permutation_sequence {

    // Function to get the k-th permutation sequence
     public static String getPermutation(int n, int k) {
        // Create a array list object
        List<Integer> temp=new ArrayList<>();
        // Create a array of size n
        int[] fact=new int[n];
        // Declare first array index value
        fact[0]=1;
        // store value in an array
        for(int i=1;i<n;i++) {
            fact[i]=fact[i-1]*i;
        }
        // Store the value in array list at n number
        for(int i=1;i<=n;i++) {
            temp.add(i);
        }
        // Decrease the k value
        k--;
        // Create String Builder class Object
        StringBuilder str=new StringBuilder();
        // Build the string
        for(int i=n;i>0;i--) {
            // Find the index
            int index=k/fact[i-1];
            // Store the value in a string
            str.append(temp.get(index));
            // Remove array list value form the index
            temp.remove(index);
            // Update the k value
            k=k%fact[i-1];
        }
        return str.toString();
    }
     
    // Main function
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) throws Exception{
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Enter the value of n: ");
            int n = Integer.parseInt(br.readLine());
            System.out.print("Enter the value of k: ");
            int k = Integer.parseInt(br.readLine());
            String result = getPermutation(n, k);
            System.out.println("The " + k + "-th permutation sequence of numbers from 1 to " + n + " is: " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
