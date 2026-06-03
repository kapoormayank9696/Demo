// LeetCode Problem 2540 : Minimum Common Value
public class Solution2540 {

    // Function to find the minimum common value in two sorted arrays
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return -1;
    }

    // Main function
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4};
        Solution2540 solution = new Solution2540();
        int result = solution.getCommon(nums1, nums2);
        System.out.println("The minimum common value is: " + result);
    }
}

