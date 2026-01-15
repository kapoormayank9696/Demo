// Java program to implement Quick Sort

import java.util.Scanner;

public class QuickSort {
    
    // Function to perform Quick Sort
    public static void quicksort(int[] nums,int low,int high){
        if(low<high){
            int pi=partition(nums,low,high);
            quicksort(nums,low,pi-1); // Recursively sort elements before partition
            quicksort(nums,pi+1,high); // Recursively sort elements after partition
        }
    }

    // Function to partition the array
    public static int partition(int[] nums,int low,int high){
        int pivot=nums[high];
        int i=(low-1);
        for(int j=low;j<high;j++){
            if(nums[j]<pivot){
                i++;
                // swap nums[i] and nums[j]
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        // swap nums[i+1] and nums[high] (or pivot)
        i++;
        int temp=nums[i];
        nums[i]=nums[high];
        nums[high]=temp;
        return i;
    }

    // Function to print the array
    public static void printArray(int[] nums){
        for(int num:nums){
            System.out.print(num+" ");
        }
        System.out.println("\n");
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter Elemnts: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Original Array: ");
        printArray(nums);
        quicksort(nums,0,n-1);
        System.out.print("Sorted Array: ");
        printArray(nums);
    }
}
