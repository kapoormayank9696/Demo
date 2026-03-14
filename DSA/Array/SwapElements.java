// Swap Elements Algorithms Implementation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SwapElements {
    // Function to swap the elements
    public static void swapElements(int[] nums){
        int k=nums.length;
        for(int i=0;i<nums.length/2;i++) {
            int c=nums[i];
            nums[i]=nums[k-i-1];
            nums[k-i-1]=c;
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
            System.out.print("Enter size of array: ");
            int n=Integer.parseInt(br.readLine());
            int[] num=new int[n];
            System.out.print("Enter elements: ");
            for(int i=0;i<n;i++) {
                num[i]=Integer.parseInt(br.readLine());
            }
            System.out.print("Print the 1-d array: ");
            printArray(num);
            swapElements(num);
            System.out.print("After swap the elements: ");
            printArray(num);
        }
    }
}

