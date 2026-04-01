// Permutation In String Array Algorithm Implementation In Java

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class Permutation_StringArray {
    // Function to perform the backtracking algorithm to generate permutations of a string array
    public static void permute(String[] arr,List<List<String>> result,List<String> temp) {
        // Base case: if the current permutation is complete, add it to the result list
        if(temp.size()==arr.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (String arr1 : arr) {
            // Skip if the element is already included in the current permutation
            if (temp.contains(arr1)) {
                continue;
            }
            // Include the current element in the permutation(make a choice)
            temp.add(arr1);
            // Recursively generate permutations including the current element
            permute(arr, result, temp);
            // Backtrack to explore other permutations(undo the last choice)
            temp.remove(temp.size() - 1);
        }
    }

    // Main function
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) throws Exception {
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter size of the string array: ");
            int n = Integer.parseInt(br.readLine());
            String[] arr = new String[n];
            System.out.println("Enter the strings: ");
            for (int i = 0; i < n; i++) {
                arr[i] = br.readLine();
            }
            System.out.println("Permutations of the string array are:");
            ArrayList<List<String>> result = new ArrayList<>(); 
            permute(arr, result, new ArrayList<>());
            for (List<String> perm : result) {
                System.out.println(perm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


