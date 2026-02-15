// Heap Sort Algorithm Implementation In Java

import java.util.Scanner;
public class HeapSort{
    // Function to heapify a subtree rooted with node i which is an index in arr[]. n is the size of the heap
    public static void heapify(int[] arr,int n,int i){
        int largest=i; // Initialize largest as root
        int left=2*i+1; // left child index
        int right=2*i+2; // right child index

        // If left child is larger than root
        if(left<n && arr[left]>arr[largest]){
            largest=left;
        }

        // If right child is larger than largest so far
        if(right<n && arr[right]>arr[largest]){
            largest=right;
        }

        // If largest is not root
        if(largest!=i){
            int swap=arr[i];
            arr[i]=arr[largest];
            arr[largest]=swap;

            // Recursively heapify the affected sub-tree
            heapify(arr,n,largest);
        }
    }
    
    // Main function to perform heap sort
    public static void heapSort(int[] arr){
        int n=arr.length;

        // Build heap (rearrange array)
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }

        // One by one extract elements from heap
        for(int i=n-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            // call max heapify on the reduced heap
            heapify(arr,i,0);
        }
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
        sc.close();
    }
}
