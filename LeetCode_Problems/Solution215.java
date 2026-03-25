// LeetCode Problem 215: Kth Largest Element in an Array
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Solution215 {
    // Method to find the kth largest value from an array
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter number of terms: ");
            int n=Integer.parseInt(br.readLine());
            int[] arr=new int[n];
            System.out.print("Enter elements: ");
            for(int i=0;i<n;i++) {
                arr[i]=Integer.parseInt(br.readLine());
            }
            System.out.print("Enter value of k: ");
            int k = Integer.parseInt(br.readLine());
            if (k <= 0 || k > n) {
                System.out.println("Invalid value of k!");
                return;
            }
            System.out.println("Array: " + Arrays.toString(arr));
            int result = findKthLargest(arr, k);
            System.out.println(k + "th largest element is: " + result);
        }
    }
}
