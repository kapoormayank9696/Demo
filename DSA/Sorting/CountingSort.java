// Java program for Counting Sort

import java.util.Scanner;

public class CountingSort {
    
    // Function to perform Counting Sort
    public static void countingSort(int[] nums){
        int max=nums[0];
        for(int num:nums){
            if(num>max){
                max=num;
            }
        }
        int[] count=new int[max+1];
        for(int num:nums){
            count[num]++;
        }
        int index=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                nums[index]=i;
                index++;
                count[i]--;
            }
        }
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
        countingSort(nums);
        System.out.print("Sorted Array: ");
        printArray(nums);
    }
}
