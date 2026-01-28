// Java Demonstrate The Singly Linked List

public class SinglyLinkedList {

    // Node class to represent each element in the Singly Linked List
    class Node{
        // Default Access Modifier And Data Memebers
        int data;
        Node next;
        // Parameterized Constructor
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }    
    Node head = null;

    // Method to insert the elements in linked list
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

    // Method to insert the node at beginning position
    public void insertAtBeginning(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    // Method to insert the node at end position
    public void insertAtEnd(int val){
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

    // Method to insert the node at speicifc position
    public void insertAtSpecific(int val,int pos){
        Node newNode = new Node(val);
        if(pos < 0){
            System.out.println("Invalid position");
            return;
        }
        if (pos==0) {
            newNode.next=head;
            head=newNode;
        }else{
            Node temp = head;
            int count=1;
            while(temp.next != null){
                if(count == pos){
                    newNode.next=temp.next;
                    temp.next=newNode;
                    break;
                }
                count++;
                temp = temp.next;
            }
        }
    }

    // Method to delete the node at beginning position
    public void deleteAtBeginning(){
        if(head == null){
            System.out.println("Empty linked list");
        }else{
            head = head.next;
        }
    }

    // Method to delete the node at end position
    public void deleteAtEnd(){
        if(head == null){
            System.out.println("empty Linked list");
        }else{
            Node temp = head;
            while(temp.next != null){
                if(temp.next.next == null){
                    temp.next = null;
                    return;
                }
                temp = temp.next;
            }
        }
    }

    // Method to delete the node at specific position
    public void deleteAtSpecific(int index){
        if(index<0){
            System.out.println("Invalid Position!!!");
        }else if (index==0) {
            head=head.next;
        }else{
            int count=1;
            Node temp=head;
            while(temp.next!=null){
                if(count == index){
                    temp.next=temp.next.next;
                    return;
                }
                temp=temp.next;
                count++;
            }
        }
    }

    // Method to update the node at beginning position
    public void updateAtBeginning(int value){
        if(head == null){
            System.out.println("Empty Linked List!!!");
        }else{
            head.data = value;
        }
    }

    // Method to update the node at end position
    public void updateAtEnd(int value){
        if(head == null){
            System.out.println("Empty Singly Linked List!!!");
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.data = value;
        }
    }

    // Method to delete the node at specificposition
    public void updateAtSpecific(int index,int value){
        if(index<0){
            System.out.println("Empty Singly Linked List!!!");
        }else if(index==0){
            head.data=value;
        }else{
            int count=1;
            Node temp = head;
            while(temp.next != null){
                if(count==index){
                    temp.data = value;
                    break;
                }
                temp = temp.next;
                count++;
            }
        }
    }

    // Method to display the linked list node data
    public void display(){
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main function
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        System.out.print("Original Singly Linked List: ");
        // Insert values in the singly linked list
        list.insert(2);
        list.insert(5);
        list.insert(10);
        list.insert(90);

        // Display the Linked List
        list.display();

        System.out.print("After Insert Element At Beginng: ");
        // Insert at the beginning
        list.insertAtBeginning(85);
        list.display();

        System.out.print("After Insert Element At End: ");
        // Insert at end
        list.insertAtEnd(58);
        list.display();

        System.out.print("After Insert At Specific Position: ");
        // Insert at specific position
        list.insertAtSpecific(34, 2);
        list.display();

        System.out.print("After Delet from beginng: ");
        // Delete first element
        list.deleteAtBeginning();
        list.display();

        System.out.print("After delete from end: ");
        // Delete last element
        list.deleteAtEnd();
        list.display();
        
        System.out.print("After delete from specific position: ");
        // Delete From Specific Position
        list.deleteAtSpecific(3);
        list.display();
        
        System.out.print("Update First element : ");
        // Update From Beginning Value
        list.updateAtBeginning(43);
        list.display();
        
        // Update From End Value
        System.out.print("Update Last element : ");
        list.updateAtEnd(86);
        list.display();
        
        // Update From Specific Value
        System.out.print("Update Specific Position element : ");
        list.updateAtSpecific(3, 24);
        list.display();
    }
}
