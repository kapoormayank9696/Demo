// Merge two sorted arrays into another sorted array 

import java.util.Scanner;
public class Merge_Sorted_Array {

    // Function to print an array
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }
    
    // Function of two sorted array
    public static int[] mergeSortArray(int[] arr1,int[] arr2){
        int p=arr1.length-1;
        int q=arr2.length-1;
        int r=arr1.length+arr2.length;
        int[] num=new int[r];
        int i=0,j=0,k=0;
        while(i<=p && j<=q){
            if(arr1[i]<arr2[j]){
                num[k++]=arr1[i++];
            }else{
                num[k++]=arr2[j++];
            }
        }
        while(i<=p){
            num[k++]=arr1[i++];
        }
        while(j<=q){
            num[k++]=arr2[j++];
        }
        return num; // Return the merged array
    }

    // Main function
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number of terms: ");
    int n=sc.nextInt();
    int[] nums=new int[n];
    System.out.print("Enter Elements of first sorted array: ");
    for (int i = 0; i < n; i++) {
        nums[i]=sc.nextInt();
    }
    System.out.print("Enter number of terms in second sorted array: ");
    int m=sc.nextInt();
    int[] nums2=new int[m];
    System.out.print("Enter Elements of second sorted array: ");
    for (int i = 0; i < m; i++) {
        nums2[i]=sc.nextInt();
    }
    System.out.println("First Array: ");
    // Printing the first array
    printArray(nums);
    System.out.println("Second Array: ");
    printArray(nums2);
    int[] result=mergeSortArray(nums, nums2);
    System.out.println("Merged Sorted Array: ");
    // Printing the merged sorted array
    printArray(result);
   } 
}
