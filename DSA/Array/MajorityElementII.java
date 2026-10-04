// Majority Element II Algorithm Implemented In Java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElementII {
    
    // Function to find majority elements in an array
    public static List<Integer> majorityElement(int[] nums) {

        // Sort the array to group identical elements together
        Arrays.sort(nums);

        // Define a list to store the majority elements
        List<Integer> result = new ArrayList<>();

        // Store the length of the array
        int n = nums.length;

        int count  = 1;

        // Iterate through the sorted array to count occurrences of each element
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count > n / 3) {
                    result.add(nums[i - 1]);
                }
                count = 1;
            }
        }

        // Check the last element
        if (count > n / 3) {
            result.add(nums[n - 1]);
        }
        return result;
    }

    // Main function
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 2, 2};
        List<Integer> result = majorityElement(nums);
        System.out.println("Majority elements: " + result);
    }
}
