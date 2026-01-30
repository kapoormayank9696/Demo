// Stack Implementation In Java By Using An Array

import java.util.Scanner;
public class StackUsingArray{
    // Default Access Modifier and Data Members
    int[] arr;
    int top,capacity;

    // Dynamic Constructor
    public StackUsingArray(int size){
        this.capacity=size;
        this.arr=new int[capacity];
        top=-1;
    }

    // Check stack is full or not
    public boolean isFull(){
        return top == capacity-1;
    }

    // Check stack is an empty or not
    public boolean isEmpty(){
        return top == -1;
    }

    // Push Operation
    public void push(int data){
        if(isFull()){
            System.out.println("Stack over flow cannot push more elements!!!");
            return;
        }
        arr[++top]=data;
    }

    // Pop Operation
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is an empty!!!");
            return -1;
        }
        return arr[top--];
    }

    // Peek Operation
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is an empty!!!");
            return -1;
        }
        return arr[top];
    }

    // Display function of queue
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is an empty!!!");
            return;
        }
        for(int i=top; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // Main function
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        StackUsingArray stack =new StackUsingArray(n);
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            stack.push(value);
        }
        System.out.print("Display Stack data: ");
        stack.display();
        System.out.println("Top stack element: "+stack.peek());
        System.out.println("Popped stack element: "+stack.pop());
        System.out.print("After popped the stack data: ");
        stack.display();
        System.out.println("New top stack element: "+stack.peek());
        sc.close();
    }
}
