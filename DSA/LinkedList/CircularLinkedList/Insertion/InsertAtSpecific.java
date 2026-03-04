// Insert At Specific Position Node Algorithm Implementation In Java

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class InsertAtSpecific {
    @SuppressWarnings("unused")
    // Node class of Circular Linked List
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
    // Function to insert the nodes in circular linked list
    public void insert(int data) {
        Node newNode=new Node(data);
        if(head == null) {
            head=newNode;
            newNode.next=head;  // Point to itself
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

    // Function to insert node at specific positionin circular linked list
    public void insertAtSpecific(int index, int k){
        if(index <= 0) {
            System.out.println("Invalid Position Of Index....");
            return;
        }
        Node newNode = new Node(k);
        // Empty list
        if(head == null) {
            if(index == 1) {
                head = newNode;
                newNode.next = head;
            } else {
                System.out.println("Empty circular linked list....");
            }
            return;
        }
        // Insert at beginning
        if(index == 1) {
            Node temp = head;
            while(temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
            return;
        }
        Node temp = head;
        int count = 1;
        while(count < index - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }
        if(count != index - 1) {
            System.out.println("Position out of range....");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Function to display the circular linked list
    public void display() {
        if(head == null) {
            System.out.println("Empty Circular Linked List....");
            return;
        }
        Node temp=head;
        while(temp != null) {
            System.out.print(temp.data+"<-->");
            if(temp.next == head) {
                break;
            }
            temp=temp.next;
        }
        System.out.println("(head)");
    }

    // Main function
    public static void main(String[] args) throws Exception{
        @SuppressWarnings("unused")
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of terms: ");
        int n=Integer.parseInt(br.readLine());
        InsertAtSpecific list=new InsertAtSpecific();
        System.out.print("Enter nodes: ");
        for(int i=0;i<n;i++) {
            int value=Integer.parseInt(br.readLine());
            list.insert(value);
        }
        System.out.print("Display the circular linked list: ");
        list.display();
        System.out.print("Enter position: ");
        int index=Integer.parseInt(br.readLine());
        System.out.print("Enter node element: ");
        int k=Integer.parseInt(br.readLine());
        list.insertAtSpecific(index,k);
        System.out.print("After inserting node at specific position circular linked list: ");
        list.display();
        br.close();
    }
}
