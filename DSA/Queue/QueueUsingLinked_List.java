// Queue Implementation In Java By Using Linked List

import java.util.Scanner;

public class QueueUsingLinked_List {

    // class node of linked list
    static class Node{

        // Default Access Modifier And Data Memebers
        int data;
        Node next;

        // Parameterized Constructor
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node first=null;
    Node rear=null;

    // Method to check queue is an empty or not
    public boolean isEmpty(){
        return first==null;
    }

    // Method to insert the elements in queue
    public void enqueue(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            first = rear = newNode;
        }else{
            rear.next=newNode;
            rear=newNode;
        }
    }

    // Method to dequeue the element in queue
    public int dequeue(){
        if(isEmpty()){
           System.out.println("Queue is an empty!!!");
           return -1;
        }
        int k=first.data;
        first=first.next;
        return k; 
    }

    // Method to find the peek element data
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is an empty!!!");
            return -1;
        }
        int k=first.data;
        return k;
    }

    // Search Operation
    public boolean search(int value) {
        boolean check=false;
        Node temp=first;
        while(temp != null) {
            if(temp.data == value) {
                check=true;
                break;
            }
            temp=temp.next;
        }
        return check;
    }

    // Method to display the queue data
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is an empty!!!");
        }else{
            Node temp=first;
            while(temp != null){
                System.out.print(temp.data);
                if(temp.next != null){
                    System.out.print("-->");
                }
                temp=temp.next;
            }
            System.out.println();
        }
    }

    // Main function
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        QueueUsingLinked_List queue=new QueueUsingLinked_List();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            queue.enqueue(value);
        }
        System.out.print("Display the queue data: ");
        // Call the display method to print queue elements
        queue.display();
        System.out.println("Top queue element: "+queue.peek());
        System.out.println("Popped element: "+queue.dequeue());
        System.out.print("After popped the queue: ");
        // Call the display method to print queue elements
        queue.display();
        System.out.println("New top queue element: "+queue.peek());
        System.out.print("Enter value for searching: ");
        int value=sc.nextInt();
        if(queue.search(value)) {
            System.out.println("Yes, the value exist into queue..");
        }else {
            System.out.println("No, the value not exist into queue..");
        }
        sc.close();
    }
}
