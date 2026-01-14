// Leetcode Problem Number 192

import java.util.Scanner;

public class Solution192 {

    // Function to print array
    public static void printArray(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n");
    }

    // Function to perform Merge Sort
    public static int[] Mergesort(int[] nums){
        if(nums.length<=1){
            return nums;
        }else{
            int mid=nums.length/2;
            int[] left=new int[mid];
            int[] right;
            if(nums.length%2==0){
                right=new int[mid];
            }else{
                right=new int[mid+1];
            }
            System.arraycopy(nums, 0, left, 0, mid);
            System.arraycopy(nums, mid+1, right, 0, right.length);
            return merge(Mergesort(left),Mergesort(right));
        }
    }
    
    // Function to merge two sorted arrays
    public static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }
        while (i < left.length) {
            merged[k++] = left[i++];
        }
        while (j < right.length) {
            merged[k++] = right[j++];
        }
        return merged;
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter Elements: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Original Array Print: ");
        printArray(nums);
        System.out.print("After Sorting An Array: ");
        int[] result=Mergesort(nums);
        printArray(result);
    }
}
