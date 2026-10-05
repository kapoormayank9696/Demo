public class MissingNumber {
    // Function to find the missing number in an array using XOR operation
    public int missingNumber(int[] nums) {  
        int n = nums.length;   
        for(int i=0;i<nums.length;i++) {
            n = n^i^nums[i];
        }
        return n;
    }

    public static void main(String[] args) {
        MissingNumber mn = new MissingNumber();
        int[] nums = {3, 0, 1};
        int missingNum = mn.missingNumber(nums);
        System.out.println("The missing number is: " + missingNum);
    }
}
