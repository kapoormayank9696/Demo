// Leetcode Problem 35: Search Insert Position

import java.util.Scanner;
public class Solution35 {

    // Function to search insert position
    public static int searchInsert(int[] nums,int target){
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }else if(nums[i]<target){
                k++;
            }
        }
        return k;
    }

    // Function To Display the array
    public static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println("\n");
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
        System.out.print("Print Array Elements: ");
        printArray(nums);
        System.out.print("Enter target elemnt: ");
        int target=sc.nextInt();
        int result=searchInsert(nums, target);
        System.out.println("Insert Position Of Target Element: "+result);
    }
}
