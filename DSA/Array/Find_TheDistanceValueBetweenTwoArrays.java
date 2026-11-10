// Find the Distance Value Between Two Arrays Algorithm Implementation In Java
public class Find_TheDistanceValueBetweenTwoArrays {
    public static class Solution {

        // Function to find the distance value
        public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
            int count = 0;

            for (int num : arr1) {
                if (isValid(num, arr2, d)) {
                    count++;
                }
            }
            return count;
        }

        // Function to check if number is valid
        public boolean isValid(int num, int[] arr2, int d) {
            for (int i = 0; i < arr2.length; i++) {
                if (Math.abs(num - arr2[i]) <= d) {
                    return false;
                }
            }
            return true;
        }
    }

    // Main function
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 8};
        int[] arr2 = {10, 9, 1, 8};
        int d = 2;

        Solution solution = new Solution();
        int distanceValue = solution.findTheDistanceValue(arr1, arr2, d);
        System.out.println("Distance Value: " + distanceValue);
    }
}
