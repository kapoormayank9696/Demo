// Insert At End Algorithm Implementation In Java

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class InsertAtEnd {
    // Node class of Linked List
    @SuppressWarnings("unused")
    static class Node {
        // Default Access Modifier And Data Members
        int data;
        Node next;
        // Parameterized Constructor
        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }

    Node head=null;
    // Function to insert the nodes in Linked List
    public void insert(int data) {
        Node newNode=new Node(data);
        if(head == null) {
            head=newNode;
            newNode.next=head; // Point to itself
            return;
        }
        Node temp=head;
        // Traverse to the last node
        while(temp.next != head) {
            temp=temp.next;
        }
        temp.next=newNode;
        // Making the last node point to head to maintain circular nature
        newNode.next=head;
    }

    // Function to insert the node in circular linked list at end point
    public void insertAtEnd(int data) {
        Node newNode=new Node(data);
        if(head == null) {
            head=newNode;
            newNode.next=head; // Point to itself
            return;
        }
        Node temp=head;
        // Traverse to the last node
        while(temp.next != head) {
            temp=temp.next;
        }
        temp.next=newNode;
        // Making the last node point to head to maintain circular nature
        newNode.next=head;
    }

    // Function to display the linked list
    public void display() {
        if(head == null) {
            System.out.println("Empty Circular Linked List....");
            return;
        }
        Node temp=head;
        while(temp != null) {
            System.out.print(temp.data+"<-->");
            temp=temp.next;
            if(temp == head){
                break;
            }
        }
        System.out.println("(head)");
    }

    // Main function
    public static void main(String[] args) throws Exception{
        @SuppressWarnings("unused")    
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of terms of nodes : ");
        int n=Integer.parseInt(br.readLine());
        InsertAtEnd list=new InsertAtEnd();
        System.out.print("Enter nodes: ");
        for(int i=0;i<n;i++) {
            int value=Integer.parseInt(br.readLine());
            list.insert(value);
        }
        System.out.print("Display Circular Linked List: ");
        list.display();
        System.out.print("Enter node element: ");
        int k=Integer.parseInt(br.readLine());
        list.insertAtEnd(k);
        System.out.print("After inserting node at last position circular linked list: ");
        list.display();
        br.close();
    }
}
