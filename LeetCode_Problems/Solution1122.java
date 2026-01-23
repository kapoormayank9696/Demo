// Leetcode Problem 1122: Relative Sort Array

public class Solution1122 {
    // Function of Relative Sort Array
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max=arr1[0];
        int min=arr1[0];
        for(int nums:arr1){
            if(nums > max){
                max=nums;
            }
            if(nums < min){
                min=nums;
            }
        }
        int[] count=new int[max-min+1];
        for(int num:arr1){
            count[num-min]++;
        }
        int n=arr1.length;
        int[] output=new int[n];
        int k=0;
        for(int num:arr2){
            while(count[num-min] > 0){
                output[k++]=num;
                count[num-min]--;
                }
        }
        for(int i=0;i<count.length;i++){
            while(count[i] > 0){
                output[k++]=i+min;
                count[i]--;
            }
        }
        return output;
    }

    // Function to print an array
    public static void printArray(int[] nums){
        for(int num:nums){
            System.out.print(num+" ");
        }
        System.out.print("\n");
    }

    // Main function
    public static void main(String[] args) {
        int[] arr1={2,3,1,3,2,4,6,7,9,2,19};
        System.out.print("Print First Original Array: ");
        printArray(arr1);
        int[] arr2={2,1,4,3,9,6};
        System.out.print("Print Second Original Array: ");
        printArray(arr2);
        int[] num=relativeSortArray(arr1,arr2);
        System.out.print("After sorted the array: ");
        printArray(num);
    }    
}
