// Stack Implementation In Java By Using ArrayList Method

import java.util.ArrayList;
import java.util.Scanner;
public class StackUsingArrayList {
    // Method of stack store by array list
    public static class Stack{

        // Method of ArrayList
        ArrayList<Integer> list=new ArrayList<>();

        // Empty function which check stack is empty or not
        public boolean isEmpty(){
            int k=list.size();
            return k == 0;
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
        public void display(){
            if(isEmpty()){
                System.out.print("Stack is empty!!!");
            }else{
                System.out.println("Stack elements: "+list);
            }
        }
    }

    // Main function
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Stack s=new Stack();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            s.push(sc.nextInt());
        }
        s.display();
        System.out.println("Top element: "+s.peek());
        System.out.println("Popped element: "+s.pop());
        System.out.println("New top element: "+s.peek());
        sc.close();
    }
}
