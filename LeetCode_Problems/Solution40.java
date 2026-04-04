// LeetCode Problem 40: Combination Sum II
import java.util.*;
public class Solution40 {
    // Function to find all unique combinations that sum to the target, where each number can only be used once
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort the array to handle duplicates
        backtrack(candidates, target, new ArrayList<>(), result, 0);
        return result;
    }
    
    // Backtracking function to explore all combinations
    public static void backtrack(int[] candidates, int target, List<Integer> current, List<List<Integer>> result, int start) {
        if (target < 0) return; // If the target is negative, no valid combination
        if (target == 0) {
            result.add(new ArrayList<>(current)); // Found a valid combination
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue; // Skip duplicates
            current.add(candidates[i]); // Include the current candidate
            backtrack(candidates, target - candidates[i], current, result, i + 1); // Recur with updated target and next index
            current.remove(current.size() - 1); // Backtrack to explore other combinations
        }
    }

    // Main function
    public static void main(String[] args) {
        System.out.print("Enter the number of elements in the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candidates = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            candidates[i] = sc.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();
        List<List<Integer>> result = combinationSum2(candidates, target);
        System.out.println("Combinations that sum to " + target + ":");
        System.out.println(result);
    }
}
