// Forward Search Implementation In Doubly Linked List In Java
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.Scanner;

public class ForwardSearch {
    // class of Node
    static class Node{
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

    // Method to insert the elements in Doubly Linked List
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
    
    // Method of search the target element from the doubly linked list
    public int forwardSearch(int val){
        if(head==null){
            System.out.println("Empty Doubly Linked List!!!!");
        }else{
            Node temp=head;
            int count=1;
            while(temp!=null){
                if(temp.data==val){
                    return count;
                }
                count++;
                temp=temp.next;
            }
        }
        return -1;
    }

    // Method of display the linked list
    public void display(){
        if(head==null){
            System.out.println("Empty Doubly Linked List!!!");
        }else{
            Node current=head;
            while(current!=null){
                System.out.print(current.data+"<-->");
                current=current.next;
            }
            System.out.println("null");
        }
    }

    // Main function
    public static void main(String[] args) {
        ForwardSearch list=new ForwardSearch();
        @SuppressWarnings("unused")
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
        System.out.print("Enter Target Element: ");
        int val=sc.nextInt();
        int result=list.forwardSearch(val);
        if(result != -1){
            System.out.println("Target element found at forward position: " + result);
        }else{
            System.out.println("Target element not exists!!!");
        }
        sc.close();
    }
}

