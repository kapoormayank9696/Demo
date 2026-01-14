// Merge Sort implementation in Java

public class MergeSort {
    
    // Function to print the arrays
    public static void printArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println("\n");
    }

    // Function to merge two sorted arrays
    public static  void mergeSort(int[] nums,int[] nums1){
        int p=nums.length;
        int q=nums1.length;
        int r=p+q;
        int[] arr=new int[r];
        int i=0,j=0,k=0;
        while(j<p && k<q){
            if(nums[j]<=nums[k]){
                arr[i++]=nums[j++];
            }else{
                arr[i++]=nums1[k++];
            }
        }
        while(j<p){
            arr[i++]=nums[j++];
        }
        while(k<q){
            arr[i++]=nums1[k++];
        }
        System.out.print("After Merging Both Arrays: ");
        printArray(arr);
    }
    
    // Main function
    public static void main(String[] args) {
        int[] nums={38,27,43,3,9,82,10};
        int[] nums1={12,11,13,5,6,7};
        System.out.print("First Array: ");
        printArray(nums);
        System.out.print("Second Array: ");
        printArray(nums1);
        mergeSort(nums, nums1);
    }    
}
