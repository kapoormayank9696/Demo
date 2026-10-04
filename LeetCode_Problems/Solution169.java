// LeetCode Problem 169: Majority Element
import java.util.Arrays;

public class Solution169 {
    // Function to find the majority element
    public static int findMajorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
    
    // Main function
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int majorityElement = findMajorityElement(nums);
        System.out.println("Majority Element: " + majorityElement);
    }
}
