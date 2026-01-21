// LeetCode Problem 1365: How Many Numbers Are Smaller Than the Current Number

import java.util.Scanner;
public class Solution1365 {
    // Method to find how many numbers are smaller than the current number
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int num:nums){
            if(num > max){
                max=num;
            }
            if(num < min){
                min=num;
            }
        }
        int[] count=new int[max-min+1];
        for(int num:nums){
            count[num-min]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] == min){
                nums[i]=0;
            }else{
                nums[i]=count[nums[i]-min-1];
            }
        }
        return nums;
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Original array: ");
        printArray(arr);
        int[] result=smallerNumbersThanCurrent(arr);
        System.out.print("Result array: ");
        printArray(result);
    }
}
