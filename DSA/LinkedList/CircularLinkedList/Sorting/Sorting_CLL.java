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

    // Function to sort the Circular Linked List using Selection Sort
    public void selectionSort(Node head) {
        if (head == null) {
            return;
        }
        Node temp = head;
        do {
            Node min = temp;
            Node r = temp.next;
            while (r != head) {
                if (r.data < min.data) {
                    min = r;
                }
                r = r.next;
            }
            // Swap data
            int x = temp.data;
            temp.data = min.data;
            min.data = x;
            temp = temp.next;
        } while (temp != head);
    }

    // Function to display the Circular Linked List
    public void display(Node head) {
        if (head == null) {
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(head)");
    }

    // Main function
    public static void main(String[] args) {
        Sorting_CLL cll = new Sorting_CLL();
    }
}
