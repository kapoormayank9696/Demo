// Check If Array Is Sorted And Rotated Algorithm Implementation In Java

public class Sorted_Is_Rotated {
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
        Sorted_Is_Rotated solution = new Sorted_Is_Rotated();
        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println(solution.check(nums1)); // Output: true

        int[] nums2 = {2, 1, 3, 4};
        System.out.println(solution.check(nums2)); // Output: false

        int[] nums3 = {1, 2, 3};
        System.out.println(solution.check(nums3)); // Output: true
    }
}
