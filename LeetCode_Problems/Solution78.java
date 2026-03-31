// LeetCode Problem 78: Subsets
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class Solution78 {
    // Function to generate subsets
    public static void generateSubsets(int[] set,List<List<Integer>> result,List<Integer> temp,int index) {
        // Add the current subset to the result list
        result.add(new ArrayList<>(temp));
        for (int i = index; i < set.length; i++) {
            // Include the current element in the subset(make a choice)
            temp.add(set[i]);
            // Recursively generate subsets including the current element
            generateSubsets(set, result, temp, i + 1);
            // Backtrack to explore other subsets(undo the last choice)
            temp.remove(temp.size() - 1);
        }
    }

    // Main function
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) throws Exception{
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Enter the number of elements in the set: ");
            int n = Integer.parseInt(br.readLine());
            int[] set = new int[n];
            System.out.println("Enter the elements of the set: ");
            for (int i = 0; i < n; i++) {
                set[i] = Integer.parseInt(br.readLine());
            }
            System.out.println("Subsets:");
            List<List<Integer>> result = new ArrayList<>();
            generateSubsets(set, result,new ArrayList<>(), 0);
            for(List<Integer> num:result) {
                System.out.println(num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
