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
    // Method to insert the value in stack
    public void push(int data){
        Node newNode=new Node(data);
        newNode.next=top;
        top=newNode;
    }

    // Method of pop operation
    public void pop(){
        if(top==null){
            System.out.println("Stack Underflow!!!");
        }else{
            System.out.println("Popped Element From Stack: "+top.data);
            top=top.next;
        }
    }

    // Method of peek operation
    public void peek(){
        if(top==null){
            System.out.println("Stack is Empty!!!");
        }else{
            System.out.println("Top element: "+top.data);
        }
    }

    // Method to check stack is empty or not
    public boolean isEmpty(){
        return top==null;
    }

    // Function to display the stack data
    public void display(){
        if(top==null){
            System.out.println("Stack Is Empty!!!");
        }else{
            Node current=top;
            while(current!=null){
                System.out.print(current.data+"-->");
                current=current.next;
            }
            System.out.println("null");
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
        // Call pop operation method
        list.pop();
        System.out.print("After Pop From Stack: ");
        // Call to display method
        list.display();
        // Call the peek operation method
        list.peek();
        // Check stack is empty or not
        boolean result=list.isEmpty();
        System.out.print("Stack is Empty : "+result);
        sc.close();
    }
}
