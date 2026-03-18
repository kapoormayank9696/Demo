// LeetCode Problem 344: Reverse String

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution344 {
    // Function to reverse the string
    public static void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        while(left < right){
            char c=s[left];
            s[left]=s[right];
            s[right]=c;
            left++;
            right--;
        }
    }
    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));){
            System.out.print("Enter first string: ");
            int n=Integer.parseInt(br.readLine());
            char[] str1=new char[n];
            System.out.println("Enter the characters one by one: ");
            for(int i=0;i<n;i++) {
                str1[i]=br.readLine().charAt(0);
            }
            System.out.println("Display the array string: "+Arrays.toString(str1));
            reverseString(str1);
            System.out.println("Reverse print the array of string: "+Arrays.toString(str1));
        }
    }
}
