// Sum Of Two Arrays Algorithm Implementation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumTwoArrays {
    // Function to sum two arrays
    public static void sumOfArrays(int[] num,int[] nums) {
        int k=num.length;
        int k1=nums.length;
        int size=Math.min(k,k1);
        for(int i=0;i<size;i++) {
            num[i]=num[i]+nums[i];
        }
    }

    // Function to print the array
    public static void printArray(int[] nums) {
        for(int num:nums) {
            System.out.print(num+" ");
        }
        System.out.print("\n");
    }

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));) {
            System.out.print("Enter size of first array: ");
            int n=Integer.parseInt(br.readLine());
            int[] num=new int[n];
            System.out.print("Enter elements: ");
            for(int i=0;i<n;i++) {
                num[i]=Integer.parseInt(br.readLine());
            }
            System.out.print("\nPrint first 1-d array: ");
            printArray(num);
            System.out.print("Enter size of second array: ");
            int m=Integer.parseInt(br.readLine());
            int[] num1=new int[m];
            System.out.print("Enter elements: ");
            for(int i=0;i<num1.length;i++) {
                num1[i]=Integer.parseInt(br.readLine());
            }
            System.out.print("\nPrint second 1-d array: ");
            printArray(num1);
            sumOfArrays(num, num1);
            System.out.print("After sum of two arrays all elements: ");
            printArray(num);
        }
    }
}
