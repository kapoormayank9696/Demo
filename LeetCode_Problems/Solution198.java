// LeetCode Problem 198 : House Robber
public class Solution198 {

    // Function to Rob
     public static int rob(int[] nums) {
        int prev2 = 0;
        int prev1 = 0;
        for(int money:nums) {
            int current = Math.max(prev1,prev2+money);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }

    // Main function
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.print("Print Orignal Array: ");
        for(int num : nums) {
            System.out.print(num+" ");
        }

        System.out.println("\nRobbery House Maximum: "+rob(nums));
    }
}
