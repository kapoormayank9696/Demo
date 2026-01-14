// Insertion Sort for Singly Linked List

import java.util.Scanner;

public class InsertionSort {
    class Node{
        // Default Access Modifier and Daat Memebers
        int data;
        Node next;
        // Parameterized Constructor
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;

    // Function to insert the element
    public void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    // Function to sort the singly linked list from insertion sort
    public void insertionSort(){
        if(head==null || head.next==null){
            return;
        }else{
            Node sorted=null;
            Node current=head;
            while(current!=null){
                Node next=current.next;
                sortedInsert(current,sorted);
                current=next;
            }
            head=sorted;
        }
    }

    // Function to insert the node in sorted way
    public void sortedInsert(Node newNode,Node sorted){
        if(sorted==null || sorted.data>=newNode.data){
            newNode.next=sorted;
            sorted=newNode;
        }else{
            Node current=sorted;
            while(current.next!=null && current.next.data<newNode.data){
                current=current.next;
            }
            newNode.next=current.next;
            current.next=newNode;
        }
    }
    
    // Function to display the linked list
    public void display(){
        if(head==null){
            System.out.println("Empty Singly Linked List!!!");
        }else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }
    
    // Main function
    public static void main(String[] args) {
        InsertionSort list=new InsertionSort();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter Elements: ");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            list.insert(value);
        }
        System.out.print("Original Singly Linked List: ");
        // Display original singly linked list
        list.display();
        
        System.out.print("After Insertion Sort Singly Linked List: ");
        list.display();
        sc.close();
    }    
}
