// Sequentail Search Algorithm Implementation In Java

import java.util.Scanner;
public class SequentailSearch{

    // Method to perform an Sequentail Search/ Linear Search Algorithm
    public static int LinearSearch(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                return i;
            }
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
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Original Array: ");
        // Call the display method/function
        printArray(arr);
        System.out.print("Enter target element: ");
        int target = sc.nextInt();
        int result = LinearSearch(arr, target);
        if(result != -1){
            System.out.println("Target element at index: "+result);
        }else{
            System.out.println("Target element not exist!!!");
        }
        sc.close();
    }
}
