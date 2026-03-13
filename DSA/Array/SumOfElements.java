// Sum Of Elements Algorithm Implementation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SumOfElements {
    // Function to sum the elements of the array
    public static int sumOfArray(int[] arr) {
        int sum=0;
        for(int num:arr) {
            sum=sum+num;
        }
        return sum;
    }

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader br =new BufferedReader(new InputStreamReader(System.in));) {
            System.out.print("Enter size of matrix: ");
            int n=Integer.parseInt(br.readLine());
            int[] arr=new int[n];
            System.out.print("Enter elements: ");
            for(int i=0;i<n;i++) {
                arr[i]=Integer.parseInt(br.readLine());
            }
            System.out.println("Print array: "+Arrays.toString(arr));
            System.out.println("Sum of elements: "+sumOfArray(arr));
        }
    }
}
