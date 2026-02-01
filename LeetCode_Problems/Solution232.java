// LeetCode Problem 232: Implement Queue using Stacks

import java.util.ArrayList;
import java.util.Scanner;

public class Solution232 {
    static class MyQueue {

        ArrayList<Integer> list;
        public MyQueue() {
            list=new ArrayList<>();
        }

        // Enqueue Operation
        public void push(int x) {
            list.add(x);
        }

        // Dequeue Operation
        public int pop() {
            if(empty()){
                return -1;
            }
            int k=list.get(0);
            list.remove(0);
            return k;
        }

        // Peek Operation
        public int peek() {
            if(empty()){
                return -1;
            }
            return list.get(0);
        }

        // Check queue is empty or not
        public boolean empty() {
            return list.isEmpty();
        }

        // Display queue data
        @Override
        public String toString(){
            return list.toString();
        }
    }

    // Main function
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        MyQueue queue=new MyQueue();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            queue.push(sc.nextInt());
        }
        System.out.println("Display the stack data: "+queue.toString());
        System.out.println("Top element: "+queue.peek());
        System.out.println("Popped element: "+queue.pop());
        System.out.println("After popped stack element: "+queue.toString());
        System.out.println("New top element: "+queue.peek());
        sc.close();
    }
}
