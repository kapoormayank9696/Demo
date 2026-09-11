// LeetCode Problem 485: Max Consecutive Ones
public class Solution485 {

    public static class Solution {
        
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

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 0, 1, 1, 1};
        int result = solution.findMaxConsecutiveOnes(nums);
        System.out.println(result); // Output: 3
    }
}
