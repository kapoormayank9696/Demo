// Singly Linked List Implementation in Java

// Time Complexity O(1)
import java.util.Scanner;
public class Beginng {

    // Node class to represent each element in the Singly Linked List
    class Node{

        // Default Access Modifier and Data Member
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

    // Function to Update At Beginning
    public void UpdateAtBeginning(int value){
        if(head == null){
            System.out.println("Empty Linked List!!!");
        }else{
            head.data = value;
        }
    }

    // Display Linked List Function
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

        // Call the class of insert elements at beginng of singly linked list
        Beginng list = new Beginng();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter Elements: ");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            list.Insert(value);
        }
        System.out.print("Original Singly Linked List: ");
        // Display the Linked List 
        list.display();

        // Update At Begining
        System.out.print("Enter Updation value at beginning: ");
        int value=sc.nextInt();
        list.UpdateAtBeginning(value);
        System.out.print("After Update At Beginning In Singly Linked List: ");
        
        // Display the Linked List 
        list.display();
    }
}