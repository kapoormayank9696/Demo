// LeetCode Problem 136: Single Number
public class Solution136 {

    // Method to find the single number in an array where every element appears twice except for one
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int num : nums) {
            ans = ans ^ num; // XOR operation to find the single number
        }
        return ans;
    }

    // Main function
    public static void main(String[] args) {
        Solution136 solution = new Solution136();
        int[] nums = {4,1,2, 2, 1};
        System.out.println("Single Number: " + solution.singleNumber(nums)); // Output: 4
    }
}

