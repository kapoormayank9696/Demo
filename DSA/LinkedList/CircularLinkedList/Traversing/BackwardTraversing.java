// Backward Traversing Algorithm Implementation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

// Forward Traversing Circular Linked List Algorithm Implementation In Java
public class BackwardTraversing {
    // Node class of circular linked list
    public static class Node {
        // Default Access Modifier And Data Members
        int data;
        Node next;
        // Parameterized Constructor
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head=null;
    // Function to insert the nodes into circular Linked list
    public void insert(int data){
        Node newNode=new Node(data);
        if(head == null) {
            head=newNode;
            newNode.next=head;
        }else {
            Node temp=head;
            while(temp.next != head) {
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=head;
        }
    }

    // Function to traverse into forward direction
    public void traverse() {
         if(head == null) {
            System.out.println("Empty circular Linked List!!!!");
            return;
        }
        Node temp=head;
        do { 
            System.out.print(temp.data+" <--> ");
            temp=temp.next;
        } while (temp != head);
        System.out.println("(head)");
    }

    // Function to traverse backward direction
    public void backwardTraverse() {
        if(head == null) {
            System.out.println("Empty circular Linked List!!!!");
            return;
        }
        Stack<Node> st=new Stack<>();
        Node temp=head;
        do{
            st.push(temp);
            temp=temp.next;
        }while(temp != head);
        while(!st.isEmpty()) {
            System.out.print(st.pop().data+" <--> ");
        }
        System.out.println("(head)");
    }

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));) {
            // Create the object of the class
            BackwardTraversing list=new BackwardTraversing();
            System.out.print("Enter number of terms: ");
            int n=Integer.parseInt(br.readLine());
            System.out.print("Enter nodes: ");
            for(int i=0;i<n;i++) {
                int values=Integer.parseInt(br.readLine());
                list.insert(values);
            }
            System.out.print("Display The Circular Linked List: ");
            list.traverse();
            System.out.print("Backward Traversing: ");
            list.backwardTraverse();
        }
    }    
}
