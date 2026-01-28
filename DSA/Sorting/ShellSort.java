// Shell Sort Algorithm Implementation In Java 

import java.util.Scanner;
public class ShellSort {

    // Mehod to perform shell sort Algorithm
    public static void shellSort(int[] nums){
        int n=nums.length;
        for(int gap=n/2;gap > 0;gap=gap/2){
            for(int i=gap;i<n;i++){
                int k=nums[i];
                int j=i;
                while (j >= gap && nums[j-gap] > k){
                    nums[j]=nums[j-gap];
                    j=j-gap;
                }
                nums[j]=k;
            }
        }
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
        System.out.print("Enter eLements: ");
        int[] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        System.out.print("Original Array : ");
        printArray(num);
        shellSort(num);
        System.out.print("Sorted Array : ");
        printArray(num);
        sc.close();
    }
}
