// Spiral Matrix Algorithm Implementation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SpiralMatrix {

    // Display matrix
    public static void printMatrix(int[][] arr) {
        for(int[] nums : arr) {
            for(int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // Spiral traversal
    public static void spiralMatrix(int[][] arr) {

        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;

        while(top <= bottom && left <= right) {

            // Left → Right
            for(int i = left; i <= right; i++)
                System.out.print(arr[top][i] + " ");
            top++;

            // Top → Bottom
            for(int i = top; i <= bottom; i++)
                System.out.print(arr[i][right] + " ");
            right--;

            // Right → Left
            if(top <= bottom) {
                for(int i = right; i >= left; i--)
                    System.out.print(arr[bottom][i] + " ");
                bottom--;
            }

            // Bottom → Top
            if(left <= right) {
                for(int i = bottom; i >= top; i--)
                    System.out.print(arr[i][left] + " ");
                left++;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of rows: ");
        int n = Integer.parseInt(br.readLine());
        System.out.print("Enter number of columns: ");
        int m = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][m];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }
        System.out.println("\nMatrix:");
        printMatrix(arr);

        System.out.println("\nSpiral Order:");
        spiralMatrix(arr);
    }
}