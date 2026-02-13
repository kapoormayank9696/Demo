// Bubble Sort Alogrithm Implementation In Java

import java.util.Scanner;

public class Bubblesort {

    // Method to perform the bubble sort algorithms
    public static void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int c=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=c;
                }
            }
        }
    }
    
    // Method to print an array
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // Main function
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Original Array");
        printArray(arr);
        System.out.print("After Sorting an array using bubble Sort");
        bubbleSort(arr);
        printArray(arr);
        sc.close();
    }
}



