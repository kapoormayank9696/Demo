// Doubly Linked List Implementation In Java And Delete The Last Element

import java.util.Scanner;

public class DeleteAtEnd {
    class Node{
        // Default Access Modifier and Data Members
        int data;
        Node next;
        @SuppressWarnings("unused")
        Node prev;
        // Parameterized Constructor
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head=null;
    Node tail=null;

    // Function To Tnsert The Linked List Elements
    public void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }

    // Function To Delete The Last Element From doubly Linked List
    @SuppressWarnings("UnnecessaryReturnStatement")
    public void deleteAtEnd(){
        if(head==null){
            System.out.println("Empty Doubly Linked List!!!");
            return;
        }else if(head==tail){
            head=null;
            tail=null;
            return;
        }
        tail=tail.prev;
        tail.next=null;
    }

    // Function To Display The Doubly Linked List
    public void display(){
        if(head==null){
            System.out.println("Empty Linked List!!!");
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
        DeleteAtEnd list=new DeleteAtEnd();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter Elements: ");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            list.insert(value);
        }
        System.out.print("Original Linked List: ");
        // Display The Doubly Linked List
        list.display();
        // Delete the Lst Doubly Linked List Element
        list.deleteAtEnd();
        System.out.print("After deletion the last element of the doubly linked list: ");
        // Display The Doubly Linked List
        list.display();
    }
}
