// LeetCode Problem 3857: Minimum Cost To Split Into Ones

import java.util.Scanner;
public class Solution3857{
    // Function to find the minmum cost
    public static int minCost(int n) {
        return n*(n-1)/2;
    }

    // Main Function
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        System.out.println("Minimum cost to split into ones: "+minCost(n));
        sc.close();
    }
}

