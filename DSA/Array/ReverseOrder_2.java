// Reverse Print 2-d matrix Algorithm Implementation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseOrder_2 {
    // Function to print 2-d matrix into reverse order
    public static void reverseMatrix(int[][] num) {
        for(int i=num.length-1;i>=0;i--) {
            for(int j=num.length-1;j>=0;j--) {
                System.out.print(num[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    // Function to print 2-d matrix
    public static void printMatrix(int[][] nums) {
        for(int[] num:nums) {
            for(int arr:num) {
                System.out.print(arr+" ");
            }
            System.out.print("\n");
        }
    }

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));) {
            System.out.print("Enter number of rows: ");
            int n=Integer.parseInt(br.readLine());
            System.out.print("Enter number of columns: ");
            int m=Integer.parseInt(br.readLine());
            int[][] num=new int[n][m];
            System.out.print("Enter elements: ");
            for(int i=0;i<n;i++) {
                for(int j=0;j<m;j++) {
                    num[i][j]=Integer.parseInt(br.readLine());
                }
            }
            System.out.println("\nPrint 2-d matrix: ");
            printMatrix(num);
            System.out.println("\nReverse print 2-d matrix: ");
            reverseMatrix(num);
        }
    }
}
