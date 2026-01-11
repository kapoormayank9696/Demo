// Leetcode Problem Number 167

import java.util.Scanner;

public class Solution167 {
    
    // Function to print array
    public static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println("\n");
    }
    
    // Function to find minimum element from an array
    public static int[] twoSum(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            for(int j=i+1;j<nums.length;j++){
                int sum=n+nums[j];
                if(sum==target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{-1,-1};
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter Elements: ");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Original Array Print: ");
        printArray(nums);
        System.out.print("\nEnter Target Element: ");
        int target=sc.nextInt();
        int[] result=twoSum(nums,target);
        System.out.print("Indexes: ");
        printArray(result);
    }
}
