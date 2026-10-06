// Score of Parentheses Algorithm Implement in a Java

import java.util.Stack;

public class Score_Of_Parentheses {

    // Solution class
    public static class Solution {
        
        // Function to calculate the score of parentheses
        public int scoreOfParentheses(String s) {
            Stack<Integer> stack = new Stack<>();
            
            // Initialize with a base score of 0
            stack.push(0); 
            
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    stack.push(0);
                } else {
                    int innerScore = stack.pop();
                    int score = 0;
                    if(innerScore == 0) {
                        score = 1;
                    } else {
                        score = 2 * innerScore;
                    }
                    stack.push(stack.pop() + score);
                }
            }

            return stack.pop();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "(()(()))";
        int score = solution.scoreOfParentheses(s);
        System.out.println("Score of Parentheses: " + score);
    }
}
