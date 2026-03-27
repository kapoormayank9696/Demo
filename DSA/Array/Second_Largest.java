// Second Largest Element From An Array Algorithm Implementation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Second_Largest {
    // Function to find the second largest number
    public static int secondLargest(int[] arr) {
        if (arr.length < 2) return -1;
        Arrays.sort(arr);
        int n = arr.length;
        int big=arr[n-1];
        for(int i=n-2;i>=0;i--) {
            if(arr[i] != big) {
                return arr[i];
            }
        }
        return -1;
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
            System.out.println("Display an array: "+Arrays.toString(arr));
            System.out.println("Second largest element from an array: "+secondLargest(arr));
        }
    }    
}
