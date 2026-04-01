// Permutation Algorithm Implementation in Java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class Combination {
    // Function to generate Combination
    public static void generateCombination(int[] set,List<List<Integer>> result,List<Integer> temp,int index) {
        // Add the current subset to the result list
        if(temp.size()==set.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = index; i < set.length; i++) {
            // Skip if the element is already included in the current combination
            if(temp.contains(set[i])) continue;
            // Include the current element in the combination(make a choice)
            temp.add(set[i]);
            // Recursively generate combinations including the current element
            generateCombination(set, result, temp, i + 1);
            // Backtrack to explore other combinations(undo the last choice)
            temp.remove(temp.size() - 1);
        }
    }

    // Main function
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) throws Exception{
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Enter the number of elements in the combination: ");
            int n = Integer.parseInt(br.readLine());
            int[] set = new int[n];
            System.out.println("Enter the elements of the set: ");
            for (int i = 0; i < n; i++) {
                set[i] = Integer.parseInt(br.readLine());
            }
            System.out.println("Combinations:");
            List<List<Integer>> result = new ArrayList<>();
            generateCombination(set, result, new ArrayList<>(), 0);
            for (List<Integer> num : result) {
                System.out.println(num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

