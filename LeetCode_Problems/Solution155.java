// LeetCode Problem 155 : Min Stack
import java.util.Stack;
public class Solution155 {
    
    // Class Of Minstack
    public static class MinStack {
        // Data Members
        Stack<Integer> stack;
        Stack<Integer> minStack;

        // Parameterized Constructor
        public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
        }
    
        // Push Operation
        public void push(int value) {
            stack.push(value);
            
            if(minStack.isEmpty() || value <= minStack.peek()) {
                minStack.push(value);
            }
        }
    
        // Pop Operation
        public void pop() {
            if(stack.isEmpty()) {
                return;
            }

            int value = stack.pop();

            if(value == minStack.peek()) {
                minStack.pop();
            }
        }
    
        // Top Operation
        public int top() {
            return stack.peek();
        }
    
        // Get Min Value
        public int getMin() {
            return minStack.peek();
        }

        // Display
        public void display() {
            System.out.println(stack);
        }
    }

    // Main function
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        System.out.print("Display stack: ");
        minStack.display();

        System.out.println("Minimum Element of the stack: "+minStack.getMin());
        System.out.println("Top Element into stack: "+minStack.top());
        System.out.print("Display stack: ");
        minStack.display();

        minStack.pop();
        System.out.println("After pop:");
        minStack.display();
        
        System.out.println("Top Element: " + minStack.top());
        System.out.println("Minimum Element: " + minStack.getMin());
    }
}

