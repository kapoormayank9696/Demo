// Singly Linked List Implementation in Java

// Time Complexity O(n)
import java.util.Scanner;
public class Specific {

    // Node class to represent each element in the Singly Linked List
    class Node{

        // Default Access modifer and Data Members
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

    // Function to Update At Specific
    public void UpdateAtSpecific(int index,int value){
        if(index<0)
        {
            System.out.println("Empty Singly Linked List!!!");
        }else if(index==0){
            head.data=value;
        }else{
            int count=1;
            Node temp = head;
            while(temp.next != null){
                if(count==index){
                    temp.data = value;
                }
                temp = temp.next;
                count++;
            }
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

    // Main function
    public static void main(String[] args) {
        
        // Call the class of insert elements at end of singly linked list
        Specific list = new Specific();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter Elements: ");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            list.Insert(value);
        }
        // Display the Linked List 
        System.out.print("Original Singly Linked List: ");
        list.display();

        // Update At Specific Position
        System.out.print("Enter index for updation the value: ");
        int index=sc.nextInt();
        System.out.print("Enter Updation Value at specific position:  ");
        int value=sc.nextInt();
        list.UpdateAtSpecific(index, value);
        System.out.print("After Update At Specific Position In Singly Linked List: ");

        // Display the Linked List 
        list.display();
    }
}