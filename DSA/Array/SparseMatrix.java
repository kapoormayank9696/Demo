// Sparse Matrix Algorthim Implementation In Java
import java.util.Scanner;
public class SparseMatrix {
    // Main function
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int n=sc.nextInt();
            System.out.print("Enter number of column: ");
            int m=sc.nextInt();
            int[][] num=new int[n][m];
            System.out.println("Enter matrix elements (space-separated):");
            for(int i=0;i<n;i++) {
                for(int j=0;j<m;j++) {
                    num[i][j]=sc.nextInt();
                }
            }
            // Count non-zero elements
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    // Check the matrix is zero or not
                    if (num[i][j] != 0) {
                        count++;
                    }
                }
            }
            // Create sparse matrix
            int[][] sparse = new int[count][3];
            int k = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    // Check the matrix is zero or not
                    if (num[i][j] != 0) {
                        sparse[k][0] = i;
                        sparse[k][1] = j;
                        sparse[k][2] = num[i][j];
                        k++;
                    }
                }
            }
            // Display the sparse matrix
            System.out.println("Sparse Matrix (row, col, value):");
            for (int i = 0; i < count; i++) {
                System.out.println(sparse[i][0] + " "+sparse[i][1] + " "+sparse[i][2]);
            }
        }
    }
}
