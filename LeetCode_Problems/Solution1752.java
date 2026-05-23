// LeetCode Problem 1752: Check If Array Is Sorted And Rotated

public class Solution1752 {

    // Function to check if the array is sorted and rotated
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[(i + 1)%n]) {
                count++;
            }
        }
        return count <= 1;
    }

    // Main function
    public static void main(String[] args) {
        Solution1752 solution = new Solution1752();
        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println(solution.check(nums1)); // Output: true

        int[] nums2 = {2, 1, 3, 4};
        System.out.println(solution.check(nums2)); // Output: false

        int[] nums3 = {1, 2, 3};
        System.out.println(solution.check(nums3)); // Output: true
    }
}
