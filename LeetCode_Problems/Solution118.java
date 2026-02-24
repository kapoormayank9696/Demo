// LeetCode Problem 118: Pascal's Triangle

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Solution118 {

    // Function to generate the first numRows of Pascal's triangle
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        int c=1;
        for(int i=0;i<numRows;i++) {
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++) {
                if(j==0 || j==i) {
                    c=1;
                }else {
                    c=c*(i-j+1)/j;
                }
                row.add(c);
            }
            list.add(row);
        }
        return list;
    }

    // Main function
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's triangle: ");
        int numRows=sc.nextInt();
        List<List<Integer>> result=generate(numRows);
        System.out.println("The first "+numRows+" rows of Pascal's triangle are:");
        for(List<Integer> row:result) {
            System.out.println(row);
        }
        sc.close();
    }
}
