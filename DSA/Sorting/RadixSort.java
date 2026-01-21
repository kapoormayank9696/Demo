// Radix Sort implementation in Java

import java.util.Scanner;
public class RadixSort {
    // Method to get the maximum value in the array
    public static int getMax(int[] arr){
        int max=arr[0];
        for(int num: arr){
            if(num > max){
                max=num;
            }
        }
        return max;
    }

    // Method to perform counting sort based on the digit represented by exp
    @SuppressWarnings("ManualArrayToCollectionCopy")
    public static void CountSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10]; // digits 0–9
        // Count digit occurrences
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }
        // Cumulative count
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        // Build output array (stable)
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }
        // Copy back
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // Function to perform Radix Sort Algorithm
    public static void radixSort(int[] arr){
        int max=getMax(arr);
        for(int exp=1;max/exp > 0;exp*=10){
            CountSort(arr, exp);
        }
    }
    // Function to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    // Main function
    @SuppressWarnings("ConvertToTryWithResources")
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
        radixSort(arr);
        System.out.print("Sorted array: ");
        printArray(arr);
        sc.close();
    }
}
