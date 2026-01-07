// Java Demonstrate Print The Singly Linked List In Backward Direction
public class BackwardDirection {
    // Class Node
    class Node{
        int data;
        Node next;
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
    // Display Linked List In Backward Direction Function
    public void backwardDirection(){
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
        BackwardDirection list = new BackwardDirection();
        System.out.print("After Insert Element In Singly Linked List: ");
        list.Insert(7);
        list.Insert(-2);
        list.Insert(0);
        list.Insert(89);
        list.Insert(35);
        list.Insert(-96);
        list.Insert(1);
        list.Insert(0);
        list.display();
        // Backward Direction Traversal
        System.out.print("Traversing Singly Linked List In Backward Direction: ");
        list.backwardDirection();
        list.display();
    }
}

