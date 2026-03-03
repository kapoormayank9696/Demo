// 2-D Array Implementation In Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_2D {
    
    // Main function
    public static void main(String[] args) throws IOException {
        @SuppressWarnings("unused")
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of rows: ");
        int n=Integer.parseInt(br.readLine());
        System.out.print("Enter number of columns: ");
        int m=Integer.parseInt(br.readLine());
        int [][] arr=new int[n][m];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                arr[i][j]=Integer.parseInt(br.readLine());
            }
        }
        System.out.println("\nPrint 2-D Array");
        for(int[] nums:arr) {
            for(int num:nums) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
        br.close();
    }
}
