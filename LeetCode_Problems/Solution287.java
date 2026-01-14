// LeetCode Problem 287: Find the Duplicate Number

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution287 {

    // Function to find the duplicate number in the array
    public static int findDuplicate(int[] nums){
        Set<Integer> list=new HashSet<>();
        for(int num:nums){
            if(list.contains(num)){
                return num;
            }else{
                list.add(num);
            }
        }
        return -1; // Placeholder return statement
    }

    // Function to print the array
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }

    // Main function
    public static void main(String[] args) {   
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter Elements: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Print Array Elements: ");
        printArray(nums);
        int result=findDuplicate(nums);
        System.out.println("Duplicate Number: " + result);
    }   
}
