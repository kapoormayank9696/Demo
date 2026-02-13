// Insertion at the beginning of a circular linked list in Java

import java.util.Scanner;
public class InsertAtBeginning {

    // Node class for circular linked list
    @SuppressWarnings("unused")
    public class Node{
        // Default Access Modifier And Data Members
        int data;
        Node next;
        // Parameterized Constructor
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head=null;

    // Insertion function
    public void insert(int data){
        Node newNode =new Node(data);
        if(head == null){
            head=newNode;
            // First node points to itself
            newNode.next = head;   
        }
        else{
            Node temp=head;
            while(temp.next != head){
                temp=temp.next;
            }
            temp.next=newNode;
            // Making the last node point to head to maintain circular nature
            newNode.next=head;
        }
    }

    // Insertion function at beginning of circular linked list
    public void insertAtBeginning(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            // Pointing to itself as it's the only node in the list
            newNode.next=head; 
        }
        else{
            Node temp=head;
            while(temp.next != head){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=head;
            head=newNode;
        }
    }

    // Display function
    public void display(){
        if(head == null){
            System.out.println("Empty Circular Linked List!!!");
        }else{
            Node temp=head;
            while(temp != null){
                System.out.print(temp.data+"<-->");
                temp=temp.next;
                if(temp==head){
                    break;
                }
            }
            System.out.println("null");
        }
    }

    // Main function
    public static void main(String[] args) {
        InsertAtBeginning list = new InsertAtBeginning();
        @SuppressWarnings("unused")
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter element: ");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            list.insert(data);
        }
        System.out.print("Display Circular Linked List: ");
        list.display();
        System.out.print("Enter element to be inserted at beginning: ");
        int data=sc.nextInt();
        list.insertAtBeginning(data);
        System.out.print("Display Circular Linked List after insertion at beginning: ");
        list.display();
        sc.close();
    }
}
