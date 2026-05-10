// LeetCode Problem 17: Combinations of a Phone Number

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution17 {
    // Class to carry the Combinations of a Phone Number Function
    public static class Solution {
        List<String> result=new ArrayList<>();
        String[] map= {
            "" ,    // 0
            "" ,    // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

        // Function to check the solution
        public void solve(String digits,int index,String temp) {
            if(digits.length() == index) {
                result.add(temp);
                return;
            }

            // Store The Value In Letters Variables
            String letters=map[digits.charAt(index)-'0'];

            // Traversing
            for(char ch:letters.toCharArray()) {
                solve(digits,index+1,temp+ch);
            }

        }

        // Function to perform the Combinations of a Phone Number 
        public List<String> letterCombinations(String digits) {
            if(digits.length() == 0) {
                return result;
            }
            solve(digits,0,"");
            return result;
        }
    }

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("digits = ");
            String str=reader.readLine();
            Solution obj=new Solution();
            List<String> result=obj.letterCombinations(str);
            for(String s:result) {
                System.out.print(s+" ");
            }
        }
    }
}
