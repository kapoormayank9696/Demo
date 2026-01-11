// Leetcode Problem Number 162

import java.util.Scanner;

public class Solution162 {
    
    // Function To Print An Array
    public static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

    // Function To Find the Peak Index From Array Elements
    public static int findPeakElement(int[] nums){
        int big=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[big]){
                big=i;
            }
        }
        return big;
    }

    // Main function
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter Elements In An Array: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Original Array Print: ");
        printArray(nums);
        int result=findPeakElement(nums);
        System.out.println("Peak Element Index From The Array: "+result);
    }
}
