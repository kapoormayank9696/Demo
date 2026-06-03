// Prefix Common Array of Two Arrays Algorithm Implementation In Java
public class Prefix_Common_Array {
    
    // Class to solve the problem
    public static class Solution {
        public int[] findThePrefixCommonArray(int[] A, int[] B) {
            int n = Math.min(A.length, B.length);
            int[] frequency = new int[n+1];
            int[] ans = new int[n];
            int count = 0;
            for (int i = 0; i < n; i++) {

                frequency[A[i]]++;
                if (frequency[A[i]] == 2) {
                    count ++;
                }

                frequency[B[i]]++;
                if (frequency[B[i]] == 2) {
                    count ++;
                }

                ans[i] = count;
            }
            return ans;
        }   
    }

    // Main function
    public static void main(String[] args) {
        int[] A = {1, 3, 2, 4};
        int[] B = {3, 1, 2, 4};
        Solution solution = new Solution();
        int[] result = solution.findThePrefixCommonArray(A, B);
        System.out.print("Prefix Common Array: ");
        for(int num : result) {
            System.out.print(num + " ");
        }
    }
}
