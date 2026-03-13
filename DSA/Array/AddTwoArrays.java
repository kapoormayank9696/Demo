// Add Two Arrays In First Array Implementation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AddTwoArrays {
    // Function to add both arrays in first array
    public static int[] addArray(int[] num,int n,int[] nums1) {
        int[] result=new int[num.length+nums1.length];
        // Copy First array
        System.arraycopy(num, 0, result, 0, num.length);
        // Copy Second Array
        System.arraycopy(nums1, 0, result, n, nums1.length);
        return result;
    }

    // Function to print an array
    public static void printArray(int[] nums) {
        for(int num:nums) {
            System.out.print(num+" ");
        }
    }

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));) {
            System.out.print("Enter size of first array: ");
            int n=Integer.parseInt(br.readLine());
            int[] arr=new int[n];
            System.out.print("Enter elements: ");
            for(int i=0;i<n;i++) {
                arr[i]=Integer.parseInt(br.readLine());
            }
            System.out.print("Print the first array: ");
            printArray(arr);
            System.out.print("\nEnter size of second array: ");
            int n1=Integer.parseInt(br.readLine());
            int[] arr1=new int[n1];
            System.out.print("Enter elements: ");
            for(int i=0;i<n1;i++) {
                arr1[i]=Integer.parseInt(br.readLine());
            }
            System.out.print("Print the second array: ");
            printArray(arr1);
            System.out.print("\nAfter adding two arrays: "+Arrays.toString(addArray(arr, n, arr1)));
        }
    }
}
