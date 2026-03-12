// Update The Node From Specific Position Circular Linked List Algorithm Implementation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class SpecificPosition {
    // Node class of Circular Linked List
    @SuppressWarnings("unused")
    static class Node {
        // Default Access Modifier And Data Members
        int data;
        Node next;
        // Parameterized Constructor
        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    // Function to insert the nodes into Circular Linked List
    public void insert(int data) {
        Node newNode=new Node(data);
        if(head == null) {
            head=newNode;
            newNode.next=head;
        } else {
            Node temp=head;
            while(temp.next != head) {
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=head;
        }
    }
    
    // Function to update specific index value from Circular Linked List
    public void updateAtSpecific(int index,int values) {
        if(head == null) {
            System.out.println("Empty Circular Linked List!!!!");
            return;
        }
        if(index <= 0) {
            System.out.println("Invalid Index From Updation!!!!!");
            return;
        }
        Node temp=head;
        int count=1;
        do { 
            if(count == index) {
                temp.data=values;
                return;
            }
            temp=temp.next;
            count++;
        } while (temp != head);
        System.out.println("Index exceeds the number of nodes!");
    }
    
    // Function to display the Circular Linked List
    public void display() {
        if(head == null) {
            return;
        }
        Node temp=head;
        do {
            System.out.print(temp.data + "<-->");
            temp=temp.next;
        } while(temp != head);
        System.out.println("(head)");
    }
    
    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));){
            SpecificPosition list=new SpecificPosition();
            System.out.print("Enter number of nodes: ");
            int n=Integer.parseInt(br.readLine());
            System.out.print("Enter nodes: ");
            for(int i=0;i<n;i++) {
                int values=Integer.parseInt(br.readLine());
                list.insert(values);
            }
            System.out.print("Display Circular Linked List: ");
            list.display();
            System.out.print("Enter index: ");
            int index=Integer.parseInt(br.readLine());
            System.out.print("Enter update node for end: ");
            int values=Integer.parseInt(br.readLine());
            list.updateAtSpecific(index,values);
            System.out.print("After update Circular Linked List: ");
            list.display();
        }
    }
}
