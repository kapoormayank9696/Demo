// Print Diagonal Elements Algorithm Implementation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DiagonalElement {

    // Function to print the diagonals element of an array
    public static void diagonalPrint(int[][] nums) {
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<nums.length;j++) {
                if(i == j){
                    System.out.print(nums[i][j]+" ");
                }
            }
        }
    }

    // Function to print an array
    public static void printArray(int[][] nums) {
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
            System.out.print("Enter number of column: ");
            int m=Integer.parseInt(br.readLine());
            int[][] num=new int[n][m];
            System.out.print("Enter elements: ");
            for(int i=0;i<n;i++) {
                for(int j=0;j<m;j++) {
                    num[i][j]=Integer.parseInt(br.readLine());
                }
            }
            System.out.println("\nPrint 2-d array: ");
            printArray(num);
            System.out.print("\nPrint diagonal elements of an array: ");
            diagonalPrint(num);
        }
    }
}
