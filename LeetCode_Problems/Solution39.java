// LeetCode Problem 39: Combination Sum
import java.util.*;
public class Solution39 {
    // Function to find all unique combinations that sum to the target
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
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
            current.add(candidates[i]); // Include the current candidate
            backtrack(candidates, target - candidates[i], current, result, i); // Recur with updated target
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
        List<List<Integer>> result = combinationSum(candidates, target);
        System.out.println("Combinations that sum to " + target + ":");
        System.out.println(result);
    }
}
