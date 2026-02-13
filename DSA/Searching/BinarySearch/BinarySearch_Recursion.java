// Binary Search using Recursion Algorithm Implementation In Java

import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch_Recursion {
    // Function to perform binary search using recursion
    public static int binarySearch(int[] arr,int left,int right,int key){
        if(right>=left){
            int mid=left+(right-left)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){
                return binarySearch(arr,left,mid-1,key);
            }
            return binarySearch(arr,mid+1,right,key);
        }
        return -1;
    }
    
    // Function to print an array
    public static void printArray(int[] arr){
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.print("\n");
    }

    // Main function
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Original Array: ");
        printArray(arr);
        System.out.print("Enter Element to be searched: ");
        // Sorting the array before performing binary search
        Arrays.sort(arr);
        int key=sc.nextInt();
        System.out.print("Sorted Array: ");
        printArray(arr);
        int result=binarySearch(arr,0,n-1,key);
        if(result==-1){
            System.out.println("Element not found in the array.");
        }else{
            System.out.println("Element found at index: "+result);
        }
        sc.close();
    }
}
