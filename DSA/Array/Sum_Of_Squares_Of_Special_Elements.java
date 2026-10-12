// Sum of Squares of Special Elements Algorithm Implmentation In Java
public class Sum_Of_Squares_Of_Special_Elements {
    // Function of Sum Of Squares From An Array
    public static int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            if(n%(i+1) == 0) {
                sum = sum + (nums[i] * nums[i]);
            }
        }
        return sum;
    }

    // Main function
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.print("Print Original Array: ");
        for(int num:nums) {
            System.out.print(num+" ");
        }
        System.out.println("\nSum of Square is : "+sumOfSquares(nums));
    }
}
