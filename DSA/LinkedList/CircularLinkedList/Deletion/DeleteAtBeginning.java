// Delete At Beginning Algorithm Implementation In Java

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DeleteAtBeginning {
    // Node class of circular linked list
    @SuppressWarnings("unused")
    public static class Node {
        // Defalut Access Modifier And Data Members
        int data;
        Node next;
        // Parameterized Constructor
        public Node (int data) {
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
            // Pointing to itself as it's the only node in the list
            newNode.next=head;
        }else {

            Node temp=head;
            while(temp.next != head) {
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=head;
        }
    }

    // Function to delete the first node from circular linked list
    public void deleteAtBeginning() {
        if(head == null) {
            System.out.println("Empty circular linked list....");
            return;
        }
        if(head.next == head) {
            head=null;
            return;
        }
        Node temp=head;
        // Find head node
        while(temp.next != head) {
            temp=temp.next;
        }
        temp.next=head.next; // last node points to second node
        head=head.next; // Move head towards
    }
    
    // Function to display the circular linked list
    public void display() {
        if(head == null) {
            System.out.println("Empty circular linked list....");
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
            System.out.print("Enter number of terms of nodes: ");
            int n=Integer.parseInt(br.readLine());
            DeleteAtBeginning list=new DeleteAtBeginning();
            System.out.print("Enter nodes: ");
            for(int i=0;i<n;i++) {
                int value=Integer.parseInt(br.readLine());
                list.insert(value);
            }
            System.out.print("Display nodes of circular linked list: ");
            list.display();
            list.deleteAtBeginning();
            System.out.print("After delete node from beginning: ");
            list.display();
        }
    }
}

