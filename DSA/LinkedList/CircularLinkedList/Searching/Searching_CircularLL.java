// Searching In Circular Linked List Algorithm Implementation In Java
import java.util.Scanner;

public class Searching_CircularLL {
    // Node class
    public static class Node {
        int data;
        Node next;
        // Parameterized Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    // Insert into circular linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        // If list is empty
        if (head == null) {
            head = newNode;
            newNode.next = head; // circular link
            return;
        }
        Node temp = head;
        // Traverse to last node
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head; // maintain circular link
    }

    // Search in circular linked list
    public boolean search(int value) {
        if (head == null) {
            return false;
        }
        Node temp = head;
        do {
            if (temp.data == value) {
                return true;
            }
            temp = temp.next;
        } while (temp != head);
        return false;
    }

    // Display circular linked list
    public void display() {
        if (head == null) {
            System.out.println("Empty Circular Linked List.....");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    // Main function
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Searching_CircularLL list = new Searching_CircularLL();
            System.out.print("Enter number of terms: ");
            int n = sc.nextInt();
            System.out.print("Enter nodes: ");
            for (int i = 0; i < n; i++) {
                int value = sc.nextInt();
                list.insert(value);
            }
            System.out.print("Display the circular linked list: ");
            list.display();
            System.out.print("Enter node for searching: ");
            int value = sc.nextInt();
            if (list.search(value)) {
                System.out.println("Yes, the node exists in the circular linked list.");
            } else {
                System.out.println("No, the node does not exist in the circular linked list.");
            }
        }
    }
}
