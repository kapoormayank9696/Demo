// LeetCode Problem 961: N-Repeated Element in Size 2N Array

import java.util.HashSet;
import java.util.Scanner;
public class Solution961{

    // Method to perform an algorithm to find n-repeated element in size 2n array
     public static int repeatedNTimes(int[] nums) {
        HashSet<Integer> list=new HashSet<>();
        for(int num:nums){
            if(list.contains(num)){
                return num;
            }
            list.add(num);
        }
        return -1;
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
        System.out.print("Enter elements: ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Original array: ");
        printArray(arr);
        // call the function repeatedNTimes 
        int result=repeatedNTimes(arr);
        System.out.println("Repeated element from an array: "+result);
        sc.close();
    }
}

