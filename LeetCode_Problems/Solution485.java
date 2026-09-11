// LeetCode Problem 485: Max Consecutive Ones
public class Solution485 {
    // Solution class for finding max consecutive ones
    public static class Solution {

        // Function to find the maximum number of consecutive 1s in the array
        public int findMaxConsecutiveOnes(int[] nums) {
            int count = 0, max = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 1) {
                    max = Math.max(count, max);
                    count = 0;
                    continue;
                }
                count++;
            }
            max = Math.max(count, max);
            return max;
        }
    }

    // Main function
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 0, 1, 1, 1};
        int result = solution.findMaxConsecutiveOnes(nums);
        System.out.println(result); // Output: 3
    }
}
