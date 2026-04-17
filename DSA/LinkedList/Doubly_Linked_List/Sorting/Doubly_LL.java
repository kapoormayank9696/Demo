// Doubly Linked List Sorting Algorithm Implementation In Java

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Doubly_LL {
    // Node class for doubly linked list
    @SuppressWarnings("unused")
    public static class Node{
        // Default Access Modifier And Data Members
        int data;
        Node next;
        Node prev;
        // Parameterized Constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head=null;
    @SuppressWarnings("unused")
    Node tail=null;

    // Function to insert nodes into the doubly linked list
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        tail = newNode;
    }

    // Function to sort the doubly linked list using bubble sort algorithm
    public void bubbleSort(Node head){
        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            while (current.next != null) {
                if (current.data > current.next.data) {
                    // Swap data
                    int tempData = current.data;
                    current.data = current.next.data;
                    current.next.data = tempData;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    // Function to display the doubly linked list
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main function
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) {
            Doubly_LL list = new Doubly_LL();
            System.out.print("Enter number of nodes: ");
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                System.out.print("Enter data for node " + (i + 1) + ": ");
                int data = Integer.parseInt(br.readLine());
                list.insert(data);
            }
            System.out.println("Doubly linked list before sorting:");
            list.printList();
            list.bubbleSort(list.head);
            System.out.println("Doubly linked list after sorting:");
            list.printList();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
