// House Robber II Algorithm Implementation In Java    
public class House_RobberII {

    // Function to Help the Rob Method
     public static int checkRob(int[] nums,int start,int end) {
        int prev2 = 0;
        int prev1 = 0;
        for(int i=start;i<end;i++) {
            int money = nums[i];
            int current = Math.max(prev1,prev2+money);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }

    // Function to Rob The Money From House
    public static int rob(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        return Math.max(checkRob(nums, 0, nums.length-1),checkRob(nums, 1, nums.length));
    }

    // Main function
    public static void main(String[] args) {
        int[] nums = {2,3,2};
        System.out.print("Print Orignal Array: ");
        for(int num : nums) {
            System.out.print(num+" ");
        }

        System.out.println("\nRobbery House Maximum: "+rob(nums));
    }
}
