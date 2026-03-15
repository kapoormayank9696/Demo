// Find The Maximum Value From An Array Algorithm Implementation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MinValue {
    // Function to find the minimum value from an array
    public static int minValue(int[] arr) {
        int min= arr[0];
        for(int num:arr) {
            if(num < min){
                min=num;
            }
        }
        return min;
    }

    // Function to print array elements
    public static void printArray(int[] arr) {
        for(int num:arr) {
            System.out.print(num+" ");
        }
        System.out.print("\n");
    }

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));) {
            System.out.print("Enter size of an array: ");
            int n=Integer.parseInt(br.readLine());
            int[] arr=new int[n];
            System.out.print("Enter elements: ");
            for(int i=0;i<n;i++) {
                arr[i]=Integer.parseInt(br.readLine());
            }
            System.out.print("Display array: ");
            printArray(arr);
            System.out.println("Minimum value from an array: "+minValue(arr));
        }
    }    
}
