// Doubly Linked List Implementation In Java And Print In Backward Direction

import java.util.Scanner;
public class BackwardDirection {
    class Node{
        // Default Access Modifier and Data Members
        int data;
        Node next;
        Node prev;
        // Constructor
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev = null;
        }
    }
    Node head=null;
    Node tail=null;
    
    // Function To Insert The Element In doubly Linked List
    public void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }

     // Display The Doubly Linked List In Forward Direction
     public void displayBackward(){
        if(head==null){
            System.out.println("Empty Doubly Linked List!!!");
        }else{
            Node temp=tail;
            while(temp!=null){
                System.out.print(temp.data+"<-->");
                temp=temp.prev;
            }
            System.out.println("null");
            System.out.println();
        }
    }

    // Function To Display The Linked List
    public void display(){
        if(head==null){
            System.out.println("Empty Doubly Linked List!!!");
        }else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"<-->");
                temp=temp.next;
            }
            System.out.println("null");
            System.out.println();
        }
    }

    // Main function
    public static void main(String[] args) {
        BackwardDirection list=new BackwardDirection();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter Elements: ");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            list.insert(value);
        }
        System.out.print("After Insert Element In Doubly Linked List: ");

        // Display the Linked List 
        list.display();
        // Forward Direction Print The doubly Linked List
        System.out.print("Doubly Linked List Print In Backward Direction: ");
        list.displayBackward();

    }

}
