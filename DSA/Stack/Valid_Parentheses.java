// Valid Parentheses Algorithm Implementation In Java

import java.util.Scanner;
import java.util.Stack;
public class Valid_Parentheses {
    // function to check if the parentheses are valid
    public static boolean isValid(String s) {
        // Stack to keep track of opening parentheses
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // If it's an opening parenthesis, push it onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // If it's a closing parenthesis, check if it matches the top of the stack
                if (stack.isEmpty()) {
                    return false; // No matching opening parenthesis
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false; // Mismatched parentheses
                }
            }
        }

        // If the stack is empty, all parentheses are valid
        return stack.isEmpty();
    }

    // Main function
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string of parentheses: ");
            String input = scanner.nextLine();
            if (isValid(input)) {
                System.out.println("The parentheses are valid.");
            } else {
                System.out.println("The parentheses are not valid.");
            }
        }
    }
}
