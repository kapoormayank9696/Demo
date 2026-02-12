// Heap Sort Algorithm Implementation In Java

import java.util.Scanner;
public class HeapSort{
    
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
        sc.close();
    }
}
