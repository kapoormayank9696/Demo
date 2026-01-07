// Java Demonstrate Insert The Element At End Of Singly Linked List
public class InsertAtEnd {
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
    // Function to Insert At End
    public void insertAtEnd(int data){
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
    // Main Method
    public static void main(String[] args) {
        InsertAtEnd list = new InsertAtEnd();
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
        // Insert At End
        System.out.print("After Insert At end In Singly Linked List: ");
        list.insertAtEnd(56);
        list.display();
    }
}

