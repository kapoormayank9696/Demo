// Searching In Singly Linked List Algorithm Implementation In Java
import java.util.Scanner;

public class Searching_SinglyLL {
    // Node class of singly linked list
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

    // Method to insert nodes into singly linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Method for searching in singly linked list
    public boolean search(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == value) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Method to display the singly linked list
    public void display() {
        if (head == null) {
            System.out.println("Empty Singly Linked List.....");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Main function
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Searching_SinglyLL list = new Searching_SinglyLL();
            System.out.print("Enter number of terms: ");
            int n = sc.nextInt();
            System.out.print("Enter nodes: ");
            for (int i = 0; i < n; i++) {
                int value = sc.nextInt();
                list.insert(value);
            }
            System.out.print("Display the singly linked list: ");
            list.display();
            System.out.print("Enter node for searching: ");
            int value = sc.nextInt();
            if (list.search(value)) {
                System.out.println("Yes, the node exists in the singly linked list.");
            } else {
                System.out.println("No, the node does not exist in the singly linked list.");
            }
        }
    }
}