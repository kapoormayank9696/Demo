// Diagonal Sum Of List Implementation In Java

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class DiagonalSumOf_List {

    // Method to find the sum of diagonals
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int n=arr.size();
        int primarySum = 0;
        int secondarySum = 0;
        for(int i=0;i<n;i++) {
            primarySum += arr.get(i).get(i);
            secondarySum += arr.get(i).get(n - 1 - i);
        }
        return Math.abs(primarySum-secondarySum);

    }

    // Main function
    @SuppressWarnings({"unused", "UnnecessaryTemporaryOnConversionFromString"})
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> list=new ArrayList<>();
        System.out.print("Enter matrix size: ");
        int n=Integer.parseInt(br.readLine());
        System.out.println("Enter matrix elements row by row:");
        for(int i=0;i<n;i++) {
            String[] values = br.readLine().split(" ");
            List<Integer> arr=new ArrayList<>();
            for(int j=0;j<n;j++) {
                arr.add(Integer.parseInt(values[j]));
            }
            list.add(arr);
        }
        int result=diagonalDifference(list);
        System.out.println("Diagonal Difference: "+result);
    }
}
