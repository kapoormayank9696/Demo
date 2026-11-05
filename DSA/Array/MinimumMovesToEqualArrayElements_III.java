// Minimum Moves to Equal Array Elements III Algorithm Implementation In Java

public class MinimumMovesToEqualArrayElements_III {
    // Function to calculate minimum moves to equal array elements
    public static int minMoves(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int num : nums) {
            max = Math.max(num,max);
            sum += num;
        }
        
        return nums.length * max - sum;
    }
    
    // Main function
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 1;
        int result = minMoves(nums, k);
        System.out.println("Minimum moves to equal array elements: " + result);
    }
}
