// LeetCode Problem 189: Rotate Array
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution189 {
    // Function to reverse the arrays element
    public static void reverse(int[] nums,int start,int end) {
        while(start < end) {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

    // Rotate array by k positions to the right
    public static void rotateArray(int[] nums,int k) {
        int n=nums.length;
        k = ((k % n) + n) % n;
        // Step 1: reverse whole array
        reverse(nums, 0, n-1);
        // Step 2: reverse first k elements
        reverse(nums, 0, k-1);
        // Step 3: reverse remaining n-k elements
        reverse(nums, k, n-1);
    }

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter number of terms: ");
            int n=Integer.parseInt(br.readLine());
            int[] arr=new int[n];
            System.out.println("Enter elements in an array: ");
            for(int i=0;i<n;i++) {
                arr[i]=Integer.parseInt(br.readLine());
            }
            System.out.println("Display the original array: "+Arrays.toString(arr));
            System.out.print("Enter kth value for rotate: ");
            int k=Integer.parseInt(br.readLine());
            rotateArray(arr,k);
            System.out.println("After rotate an array is: "+Arrays.toString(arr));
        }
    }
}
