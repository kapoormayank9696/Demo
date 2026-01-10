// Doubly Linked List Implementation In Java and Delete First Element From Beginning

import java.util.Scanner;

public class DeleteAtSpecific {
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
    
    // Function to delete the specific position element of doubly linked list
    public void deleteAtSpecific(int index){
        if(head==null){
            System.out.println("Empty Linked List!!!");
        }
        else if(index==0){
            head=head.next;
            if(head!=null){
                head.prev=null;
            }
        }
        else{
            int count=1;
            Node temp=head;
            while(temp!=null){
                if(count==index-1){
                    temp=temp.next;
                }
                count++;
                temp=temp.next;
            }
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
        DeleteAtSpecific list=new DeleteAtSpecific();
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
        
        System.out.print("Enter Position For Deletion The Element: ");
        int index=sc.nextInt();
        list.deleteAtSpecific(index);
        System.out.print("After Delete The Specific Position Element Of Doubly Linked List: ");
        // Display The Doubly Linked List
        list.display();
    }
}