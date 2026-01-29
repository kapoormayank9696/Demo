// Binary Search Algorithm Implementation In Java

import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {

    // Method to perform the binary search algorithm
    public static int binarySearch(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start+(end - start)/2;
            if (target < nums[mid]){
                end = mid-1;
            }else if (target > nums[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    // Method to print an array
    public static void printArray(int[] nums){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println("\n");
    }

    // Main function 
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter elements: ");
        int[] nums=new int[n];
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Original Array: ");
        printArray(nums);
        System.out.print("Enter a target element: ");
        int target=sc.nextInt();
        Arrays.sort(nums);
        int result = binarySearch(nums, target);
        if(result != -1){
            System.out.println("Target element at index: "+result);
        }else{
            System.out.println("Target element not exist!!!");
        }
        sc.close();
    }
}
