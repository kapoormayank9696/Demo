// Leetcode Problem Number 154

import java.util.Scanner;

public class Solution154 {
    
    // Function to print array
    public static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println("\n");
    }
    
    // Function to find minimum element from an array
    public static int findMin(int[] nums){
        int small=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<small){
                small=nums[i];
            }
        }
        return small;
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
        int result=findMin(nums);
        System.out.println("Minimum Element From An Array: "+result);
    }
}
