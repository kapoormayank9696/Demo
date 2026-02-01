// LeetCode Problem 225: Implement Stack using Queues

import java.util.ArrayList;
import java.util.Scanner;

public class Solution225 {
    static class MyStack {
        ArrayList<Integer> list;
        public MyStack() {
            list=new ArrayList<>();
        }

        // Push Operation
        public void push(int x) {
            list.add(x);
        }

        // Pop Operation
        public int pop() {
            if(empty()){
                return -1;
            }
            int k=list.get(list.size()-1);
            list.remove(list.size()-1);
            return k;
        }

        // Peek Operation
        public int top() {
            if(empty()){
                return -1;
            }
            return list.get(list.size()-1);
        }

        // Check Stack is empty or not
        public boolean empty() {
            return list.isEmpty();
        }

        // Display Stack Data
        @Override
        public String toString(){
            return list.toString();
        }
    }

    // Main function
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        MyStack stack=new MyStack();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            stack.push(sc.nextInt());
        }
        System.out.println("Display the stack data: "+stack.toString());
        System.out.println("Top element: "+stack.top());
        System.out.println("Popped element: "+stack.pop());
        System.out.println("After popped stack element: "+stack.toString());
        System.out.println("New top element: "+stack.top());
        sc.close();
    }
}
