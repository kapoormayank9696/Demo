// LeetCode Problem 453: Minimum Moves to Equal Array Elements
public class Solution453 {

    // Function to calculate minimum moves to equal array elements
   public static int minMoves(int[] nums) {
        int min = nums[0];
        for(int num:nums) {
            min = Math.min(min,num);
        }

        int count = 0;
        for(int num:nums) {
            count = count + num - min;
        }
        return count;
    }

    // Main function
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Solution453 solution = new Solution453();
        
        int[] nums = {1, 2, 3};
        int result = solution.minMoves(nums);
        
        System.out.println("Minimum moves to equal array elements: " + result);
    }
}
