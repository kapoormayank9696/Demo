// Java Demonstrate The Singly Linked List
public class SinglyLinkedList {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }    
    Node head = null;
    public void insert(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void insertatbeging(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void insertatend(int val){
        Node newNode = new Node(val);
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
    // public void insertatspecificposition(int val,int pos){
        // Node newNode = new Node(val,pos);
        // if(head == null){
            // head = newNode;
        // }else{
            // Node temp = head;
            // while(temp.next != null){
                // temp = temp.next;
            // }
        // }
    // }
    public void delete(){
        if(head == null){
            System.out.println("Empty linked list");
        }else{
            head = head.next;
        }
    }
    public void deleteatend(){
        if(head == null){
            System.out.println("empty Linked list");
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
                if(temp.next.next == null){
                    temp.next = null;
                    return;
                }
            }
        }
    }
    public void display(){
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        //Insert values in the singly linked list
        list.insert(2);
        list.insert(5);
        list.insert(10);
        list.insert(90);
        //Display the Linked List
        list.display();
        //Insert at the beginning
        list.insertatbeging(85);
        //Insert at end
        list.insertatend(58);
        //Display again the linked list 
        list.display();
        //Delete first element
        list.delete();
        //Display again Linked List
        list.display();
        //Delete last element
        list.deleteatend();
        //Display again Linked List
        list.display();
    }
}
