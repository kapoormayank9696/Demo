// LeetCode Problem 561: Array Partition

import java.util.Scanner;
public class Solution561 {
    
    // Method of sorting an array in ascending order
    public static int arrayPairSum(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int num:nums){
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
        }
        int[] count=new int[max-min+1];
        for(int num:nums){
            count[num-min]++;
        }
        int k=0;
        for(int i=0;i<count.length;i++){
            while(count[i] > 0){
                nums[k++]=i+min;
                count[i]--;
            }
        }
        int possibleSum=0;
        for(int i=0;i<nums.length;i=i+2){
            int sum=Math.min(nums[i],nums[i+1]);
            possibleSum=possibleSum+sum;
        }
        return possibleSum;
    }

    // Function to print an array
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
        System.out.print("Enter Elements: ");
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Original Array: ");
        printArray(nums);
        int result=arrayPairSum(nums);
        System.out.print("Maximum sum from the minimum value from the pairs: "+result);
        sc.close();
    }
}
