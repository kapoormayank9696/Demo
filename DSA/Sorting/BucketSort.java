// Bucket Sort Algorithm Implementation In Java

import java.util.Scanner;
public class BucketSort {

    // Method of insertion sort algorithm perform
    public static void insertionSort(int[] nums,int size){
        for(int i=1;i< size;i++){
            int j=i-1;
            int k=nums[i];
            while(j >= 0 && nums[j] > k){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=k;
        }
    }
    
    // Method of bucket sort algorithm perform
    public static void bucketSort(int[] nums){
        int n=nums.length;
        if(n <= 0) return;
        int max=nums[0];

        // Find maximum value from an array
        for(int num:nums){
            if(num > max){
                max=num;
            }
        }

        // Create buckets
        int[][] buckets=new int[n][n];
        int[] bucketSize=new int[n];

        // Distribute elements into buckets
        for(int num:nums){
            int index = (num*n)/(max+1);
            buckets[index][bucketSize[index]++] = num;
        }

        // Sort each bucket
        for(int i=0;i<n;i++){
            if(bucketSize[i] > 0){
                insertionSort(buckets[i], bucketSize[i]);
            }
        }

        // Merge sorted buckets
        int k=0;
        for (int i =0; i < n; i++) {
            for(int j=0; j<bucketSize[i];j++)  {
                nums[k++]=buckets[i][j];
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
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter Elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Original Array: ");
        printArray(arr);
        bucketSort(arr);
        System.out.print("After sorted an array: ");
        printArray(arr);
        sc.close();
    }
}
