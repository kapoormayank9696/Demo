// Delete Node From Specific Position Alogrithm Implementation In Java

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class DeleteAtSpecific {
    // Node class of Circular Linked LIst
    public static class Node {
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
    // Function to insert the nodes in Circular Linked LIst
    public void insert(int data) {
        Node newNode=new Node(data);
        if(head == null) {
            head =newNode;
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

    // Function to delete node from specific position
    public void deleteAtSpecific(int index) {
        if(head == null) {
            System.out.println("Empty Circular Linked List....");
            return;
        }
        if(index <= 0) {
            System.out.println("Invalid Position OF Index...");
            return;
        }
        if(index == 1) {
            head = head.next;
            return;
        }
        Node temp=head;
        int count=1;
        while(count < index-1 && temp.next != head) {
            temp=temp.next;
            count++;
        }
        if(temp != null && temp.next != null) {
            temp.next=temp.next.next;
        }
    }

    // Function to display the circular linked list
    public void display() {
        if(head == null) {
            System.out.println("Empty Circular Linked List....");
            return;
        }
        Node temp=head;
        while(temp.next != null) {
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
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));){
            DeleteAtSpecific list=new DeleteAtSpecific();
            System.out.print("Enter number of terms of nodes: ");
            int n=Integer.parseInt(br.readLine());
            System.out.print("Enter nodes: ");
            for(int i=0;i<n;i++) {
                int value=Integer.parseInt(br.readLine());
                list.insert(value);
            }
            System.out.print("Display Circular Linked List: ");
            list.display();
            System.out.print("Enter index for deleting the node from circular linked list: ");
            int index=Integer.parseInt(br.readLine());
            System.out.print("Display Circular Linked List After Deleting From The Specific Position: ");
            list.deleteAtSpecific(index);
            list.display();
            br.close();
        }
    }
}
