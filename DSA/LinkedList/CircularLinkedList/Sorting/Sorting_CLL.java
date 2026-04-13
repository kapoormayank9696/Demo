// Sorting a Circular Linked List
public class Sorting_CLL {
    // Node class for Circular Linked List
    public class Node {
        // Default Access Modifier And Data Members
        int data;
        Node next;
        // Parameterized Constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head=null;
    // Insert node in Circular Linked List
    public Node insert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode; // Point to itself
            return newNode;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
        return head;
    }
    
    // Main function
    public static void main(String[] args) {
        Sorting_CLL cll = new Sorting_CLL();
    }
}
