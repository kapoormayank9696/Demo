// LeetCode Problem 34: Find First and Last Position of Element in Sorted Array

public class Solution34 {
    // Function to find the first and last position of a target element in a sorted array
    public static int[] searchRange(int[] nums, int target) {
        int result[]={-1,-1};
        result[0]=findFirst(nums,target);
        result[1]=findLast(nums,target);
        return result;
    }
    
    public static int findFirst(int[] nums,int target){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static int findLast(int nums[],int target){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;
                start=mid+1;
            }
            else if(target>nums[mid]){
                start=mid+1;

            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }

    // Main function
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        int[] result=searchRange(nums,target);
        System.out.println("First and Last Position of Element in Sorted Array: ["+result[0]+", "+result[1]+"]");
    }
}
