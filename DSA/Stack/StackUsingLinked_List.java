// Stack Implementation In Java By Using Linked List Algorithm
import java.util.Scanner;

public class StackUsingLinked_List {
    // Node Class
    static class Node{
        // Default Access Modifier and Data Memebers
        int data;
        Node next;
        // Parameterized Constructor
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    Node top=null;

    // Method to check stack is empty or not
    public boolean isEmpty(){
        return top == null;
    }

    // Method to insert the value in stack
    public void push(int data){
        Node newNode=new Node(data);
        newNode.next=top;
        top=newNode;
    }

    // Method of pop operation
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is an empty!!!");
            return -1;
        }
        int k=top.data;
        top=top.next;
        return k;
    }

    // Method of peek operation
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty!!!");
            return -1;
        }
        int k=top.data;
        return k;
    }

    // Method of search operation
    public boolean search(int value) {
        boolean check=false;
        Node temp=top;
        while(temp != null) {
            if(temp.data == value) {
                check=true;
                break;
            }
            temp=temp.next;
        }
        return check;
    }

    // Function to display the stack data
    public void display(){
        if(top==null){
            System.out.println("Stack Is Empty!!!");
        }else{
            Node current=top;
            while(current!=null){
                System.out.print(current.data);
                if(current.next != null){
                    System.out.print("-->");
                }
                current=current.next;
            }
            System.out.println();
        }
    }

    // Main function
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        StackUsingLinked_List list=new StackUsingLinked_List();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter Elements: ");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            list.push(value);
        }
        System.out.print("Stack data display: ");
        // Call to display method
        list.display();
        System.out.println("Top stack element: "+list.peek());
        System.out.println("Popped the stack element: "+list.pop());
        System.out.print("After popped the stack element: ");
        // Call to display method
        list.display();
        System.out.println("New top stack element: "+list.peek());
        System.out.print("Enter value for searching: ");
        int value=sc.nextInt();
        // Call to search operation
        if(list.search(value)) {
            System.out.println("Yes,the value is exist into stack...");
        }else {
            System.out.println("No,the value is not exist into stack..");
        }
        sc.close();
    }
}
