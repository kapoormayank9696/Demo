// Update The First Node From Circular Linked List Algorithm Implementatioin In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Beginning {
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

    // Function to update first node value from Circular Linked List
    public void updateAtBeginning(int values) {
        if(head == null) {
            System.out.println("Empty Circular Linked List!!!!");
            return;
        }
        head.data=values;
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
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));) {
            Beginning list=new Beginning();
            System.out.print("Enter number of nodes: ");
            int n=Integer.parseInt(br.readLine());
            System.out.print("Enter nodes: ");
            for(int i=0;i<n;i++) {
                int values=Integer.parseInt(br.readLine());
                list.insert(values);
            }
            System.out.print("Display Circular Linked List: ");
            list.display();
            System.out.print("Enter update node for beginning: ");
            int values=Integer.parseInt(br.readLine());
            list.updateAtBeginning(values);
            System.out.print("After update Circular Linked List: ");
            list.display();
        }
    }
}
