// LeetCode Problem 20: Valid Parentheses
import java.util.Scanner;
import java.util.Stack;

public class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    // Main function
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string of parentheses: ");
            String input = scanner.nextLine();
            Solution20 solution = new Solution20();
            if (solution.isValid(input)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
