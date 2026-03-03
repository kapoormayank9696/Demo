// 1-D Array Implementation In Java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array_1D{
    
    // Main function
    public static void main(String[] args) throws IOException {
        @SuppressWarnings("unused")
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter matrix size: ");
        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++) {
            arr[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Print original 1-d array: "+Arrays.toString(arr));
        br.close();
    }
}

