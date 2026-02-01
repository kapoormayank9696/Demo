// LeetCode Problem 3010: Divide an Array Into Subarrays With Minimum Cost I

import java.util.Scanner;
public class Solution3010 {

    // Method to find the minimum cost sum from subarrayss
    public static int minimumCost(int[] nums) {
        int left=nums[1];
        int ans=Integer.MAX_VALUE;
        for(int i=2;i<nums.length;i++){
            ans=Math.min(ans,nums[0]+left+nums[i]);
            left=Math.min(left,nums[i]);
        }
        return ans;
    }

    // Method to print an array
    public static void printArray(int[] nums){
        for(int num:nums){
            System.out.print(num+" ");
        }
        System.out.println("\n");
    }

    // Main function
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Original Array: ");
        printArray(arr);
        int result= minimumCost(arr);
        System.out.print("Minimum possible sum of cost: "+result);
        sc.close();
    }
}
