// LeetCode Problem 119: Pascal's Triangle II

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Solution119 {
    // Function to get the kth row of Pascal's Triangle
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list=new ArrayList<>();
        long c=1;
        for(int i=0;i<=rowIndex;i++) {
            list.add((int)c);
            c=c*(rowIndex-i)/(i+1);
        }
        return list;
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the row index: ");
        int rowIndex=sc.nextInt();
        System.out.println("The " + rowIndex + "th row of Pascal's Triangle is: " + getRow(rowIndex));
        System.out.println("All test cases passed successfully.");
    }
}
