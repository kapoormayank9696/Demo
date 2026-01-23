// Doubly Linked List Implementation In Java And Update Element At End Position

import java.util.Scanner;
public class UpdateAtEnd{
    // class of node
    static class Node{
        // Default access modifier and Data members
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
    // Method of insert the value in doubly linked list
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

    // Method to update the first beginning value
    public void updateLastNode(int val){
        if(head==null){
            System.out.println("Empty Doubly Linked List!!!");
        }else{
            tail.data=val;
        }
    }

    // Method to display the Doubly Linked List
    public void display(){
        if(head == null){
            System.out.println("Empty Doubly Linked List!!!");
        }else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"<-->");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }

    // Main function
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        UpdateAtEnd list=new UpdateAtEnd();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter Elements: ");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            list.insert(value);
        }
        System.out.print("Original Doubly Linked List: ");
        list.display();
        System.out.print("Update value of End: ");
        int val=sc.nextInt();
        list.updateLastNode(val);
        System.out.print("After Updating The Value Of Linked List: ");
        list.display();
        sc.close();
    }
}
