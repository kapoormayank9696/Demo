// Stack Implementation In Java By Using ArrayList Method

import java.util.ArrayList;
import java.util.Scanner;
public class StackUsingArrayList {
    // Method of stack store by array list
    public static class Stack{

        // Method of ArrayList
        ArrayList<Integer> list=new ArrayList<>();

        // Empty function which check stack is an empty or not
        public boolean isEmpty(){
            return list.isEmpty();
        }

        // Push operation
        public void push(int data){
            list.add(data);
        }

        // Pop operation
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        // Peek operation
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }

        // Method of display the stack
        @Override
        public String toString(){
            return list.toString();
        }
    }

    // Main function
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Stack stack=new Stack();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            stack.push(sc.nextInt());
        }
        System.out.println("Display the stack data: "+stack.toString());
        System.out.println("Top element: "+stack.peek());
        System.out.println("Popped element: "+stack.pop());
        System.out.println("After popped stack element: "+stack.toString());
        System.out.println("New top element: "+stack.peek());
        sc.close();
    }
}
