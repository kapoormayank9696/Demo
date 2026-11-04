// Minimum Moves to Equal Array Elements II Algorithm Implementation In Java

import java.util.Arrays;

public class MinimumMoves_ToEqualArrayElements_II {

    // Function to calculate minimum moves to equal array elements II
    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median = nums[nums.length / 2];
        long count = 0;
        
        for(int num:nums) {
            count += Math.abs(num - median);
        }
        
        return (int)count;
    }

    // Main function
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println("Input array: " + Arrays.toString(nums));
        int result = minMoves2(nums);
        System.out.println("Minimum moves to equal array elements II: " + result);
    }
}
