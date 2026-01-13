// Doubly Linked List Implementation In Java and Delete First Element From Specific Position

import java.util.Scanner;

public class DeleteAtSpecific{
    class Node{
        // Default Access Modifier and Data Memebers
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
    // Function To Insert The Linked List Elements
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
    
    // Function To Delete The Element At Specific Position
    @SuppressWarnings("UnnecessaryReturnStatement")
    public void deleteAtSpecific(int position){
        if(head==null){
            System.out.println("Empty Doubly Linked List!!!");
            return;
        }else{
            Node current=head;
            int count=1;
            while(current!=null && count<=position){
                if(count==position){
                    if(current==head){
                        head=head.next;
                        if(head!=null){
                            head.prev=null;
                        }
                    }else if(current == tail){
                        tail=tail.prev;
                        tail.next=null;
                    }else{
                        current.prev.next=current.next;
                        current.next.prev=current.prev;
                    }
                    break;
                }
                current=current.next;
                count++;
            }
        }
    }
    
    // Function To Display The Doubly Linked List
    public void display(){
        if(head==null){
            System.out.println("Empty Linked List!!!");
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
    public static void main(String[] args) {
        DeleteAtSpecific list=new DeleteAtSpecific();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            int value=sc.nextInt();
            list.insert(value);
        }
        System.out.print("Original Linked List: ");
        // Diplay The Original Linked List
        list.display();
        System.out.print("Enter Position To Delete Element: ");
        int position=sc.nextInt();
        list.deleteAtSpecific(position);
        System.out.print("After Deletion At Specific Position: ");
        list.display();
    }
}
