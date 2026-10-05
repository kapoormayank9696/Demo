// LeetCode Problem 268: Missing Number
public class Solution268 {
    // Function to find the missing number in an array using XOR operation
    public int missingNumber(int[] nums) {  
        int n = nums.length;   
        for(int i=0;i<nums.length;i++) {
            n = n^i^nums[i];
        }
        return n;
    }

    // Main function
    public static void main(String[] args) {
        Solution268 sol = new Solution268();
        int[] nums = {3, 0, 1};
        int missingNum = sol.missingNumber(nums);
        System.out.println("The missing number is: " + missingNum);
    }
}
