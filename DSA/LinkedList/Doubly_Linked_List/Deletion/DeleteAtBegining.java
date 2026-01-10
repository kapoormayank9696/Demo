// Doubly Linked List Implementation In Java and Delete First Element From Beginning

import java.util.Scanner;

public class DeleteAtBegining {
    class Node{
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

    // Function to insert the element in doubly linked list
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
    
    // Function to delete the beginning element of doubly linked list
    @SuppressWarnings("UnnecessaryReturnStatement")
    public void deleteAtBegining(){
        if(head==null){
            System.out.println("Empty Doubly Linked List!!!");
        }
        else{
            head=head.next;
            if (head!=null) {
                head.prev=null;
            }
            return;
        }
    }
    
    // Function to display the linked list
    public void display(){
        if(head==null){
            System.out.println("Empty Doubly Linked L;ist!!!");
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
        DeleteAtBegining list=new DeleteAtBegining();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter Elements: ");
        for (int i=0;i<n;i++) {
            int value=sc.nextInt();
            list.insert(value);
        }
        System.out.print("Original Doubly Linked List: ");
        // Display The Doubly Linked List
        list.display();
        
        System.out.print("After Delete The First Element Of Doubly Linked List: ");
        list.deleteAtBegining();
        // Display The Doubly Linked List
        list.display();
    }
}
