// Java Demonstrate Reverse Print The Singly Linked List
public class Reverse_Print {
    // class Node
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    // Function to Insert In Singly Linked List Value
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    // Display Linked List Function
    public void display(){
        if(head == null){
            System.out.println("Empty Linked List");
        }else{
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.print("null\n");
        }
    }
    // Function to Reverse Linked List
    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    // Main Method
    public static void main(String[] args) {
        Reverse_Print list = new Reverse_Print();
        System.out.print("Original Singly Linked List: ");
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(18);
        list.insert(21);
        list.display();
        System.out.print("Reversed Singly Linked List: ");
        list.reverse();
        list.display();
    }
}
