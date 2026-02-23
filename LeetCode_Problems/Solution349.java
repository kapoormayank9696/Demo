// LeetCode Problem 349: 

import java.util.HashSet;
import java.util.Scanner;
public class Solution349 {
    // Function to find the intersection of two arrays
    public static int[] intersection(int[] nums1, int[] nums2) {
        // Create a HashSet to store the unique elements of the first array
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        // Create a HashSet to store the unique elements of the second array
        HashSet<Integer> result=new HashSet<>();
        for(int num:nums2){
            if(set.contains(num)){
                result.add(num);
            }
        }
        // Convert the result HashSet to an array
        int[] intersection=new int[result.size()];
        int index=0;
        for(int num:result){
            intersection[index++]=num;
        }
        return intersection;
    }

    // Main function
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of nums1 and nums2:  ");
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int[] nums1=new int[n];
        System.out.print("Enter the elements of nums1: ");
        for(int i=0;i<n;i++){
            nums1[i]=sc.nextInt();
        }
        int[] nums2=new int[n1];
        System.out.print("Enter the elements of nums2: ");
        for(int i=0;i<n1;i++){
            nums2[i]=sc.nextInt();
        }
        sc.close();
        int[] result=intersection(nums1,nums2);
        System.out.print("The intersection of the two arrays is: ");
        for(int num:result){
            System.out.print(num+" ");
        }
    }
}

