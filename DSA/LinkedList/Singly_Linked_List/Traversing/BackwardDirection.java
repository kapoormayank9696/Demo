// Java Demonstrate Print The Singly Linked List In Backward Direction

import java.util.Scanner;

public class BackwardDirection {

    // Node class to represent each element in the Singly Linked List
    class Node{

        // Default Access Modifier and Data Members
        int data;
        Node next;
        // Parameterized Constructor
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }    
    Node head = null;

    // Function To Insert In Singly Linked List Value
    public void Insert(int data){
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Display Linked List Function
    public void display(){
        if(head==null){
            System.out.println("Empty Singly Linked List!!");
        }else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }

    // Display Linked List In Backward Direction Function
    public void backwardDirection(){
        Node prev = null;
        Node current = head;
        Node next;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Main function
    public static void main(String[] args) {

        // Call the class of Backward Direction 
        BackwardDirection list = new BackwardDirection();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter Elements: ");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            list.Insert(value);
        }
        System.out.print("Original Singly Linked List Display: ");
        // Display the Linked List 
        list.display();
        // Backward Direction Traversing
        System.out.print("Traversing Singly Linked List In Backward Direction: ");
        list.backwardDirection();

        // Display the Linked List 
        list.display();
    }
}

