// Delete Node From End Algorithm Implementation In Java 

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class DeleteAtEnd {
    // Node class of Circular Linked List
    @SuppressWarnings("unused")
    public static class Node {
        // Default Access Modifier And Data Memebers
        int data;
        Node next;
        // Parameterized Constructor
        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }

    Node head=null;
    // Function to insert the nodes in circular linked list
    public void insert(int data) {
        Node newNode=new Node(data);
        if(head == null) {
            head=newNode;
            newNode.next=head;
        }
        else {
            Node temp=head;
            while(temp.next != head) {
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=head;
        }
    }

    // Function to delete the last node from circular linked list
    public void deleteAtEnd() {
        if(head == null) {
            System.out.println("Empty Circular Linked List....");
            return;
        }
        // If only one node
        if(head.next == head) {
            head = null;
            return;
        }
        Node temp=head;
        while(temp.next.next != head) {
            temp=temp.next;
        }
        // Remove last node from circular linked list
        temp.next=head;
    }

    // Function to display the circular linked list nodes
    public void display() {
        if(head == null) {
            System.out.println("Empty Circular Linked List....");
            return;
        }
        Node temp=head;
        while(temp != null) {
            System.out.print(temp.data+"<-->");
            temp=temp.next;
            if(temp == head) {
                break;
            }
        }
        System.out.println("(head)");
    }

    // Main function 
    public static void main(String[] args) throws Exception{
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) {
            DeleteAtEnd list=new DeleteAtEnd();
            System.out.print("Enter number of terms of nodes: ");
            int n=Integer.parseInt(br.readLine());
            System.out.print("Enter nodes: ");
            for(int i=0;i<n;i++) {
                int values=Integer.parseInt(br.readLine());
                list.insert(values);
            }
            System.out.print("Display Circular Linked List: ");
            list.display();
            list.deleteAtEnd();
            System.out.print("After delete the last node from circular linked list: ");
            list.display();
            br.close();
        }
    }
}
