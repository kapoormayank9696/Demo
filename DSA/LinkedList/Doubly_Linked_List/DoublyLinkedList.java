// Doubly Linked List Implementation In Java With All Operations

public class DoublyLinkedList {
    // class of node
    static class Node{
        // Default Access Modifier And Data Memebers
        int data;
        Node next;
        Node prev;
        // Parameterized Constructor
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    Node head=null;
    Node tail=null;
    // Methods of insert the elements in doubly linked list
    public void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
    // Method of insert the element at beginning of doubly linked list
    public void insertAtBeginning(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }
    // Method of insert the element at end of doubly linked list
    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }

    // Method of insert the new node at specific position 
    public void insertAtSpecific(int index, int data){
        if(index <= 0){
            System.out.println("Position Out Of Range!!!");
            return;
        }
        if(index == 1){
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int count = 1;
        while(temp != null && count < index - 1){
            temp = temp.next;
            count++;
        }
        if(temp == null){
            System.out.println("Position Out Of Range!!!");
            return;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        if(temp.next != null){
            temp.next.prev = newNode;
        } else {
            tail = newNode;
        }
        temp.next = newNode;
    }

    // Method of delete the first node from doubly linked list
    public void deleteAtBeginning(){
        if(head==null){
            System.out.println("Empty Doubly Linked List!!!");
        }
        else if(head == tail){
            head=tail=null;
        }
        else{
            head=head.next;
            head.prev=null;
        }
    }

    // Method of delete the last node from doubly linked list
    public void deleteAtEnd(){
        if(head==null){
            System.out.println("Empty Doubly Linked List!!!");
        }
        else if (head == tail) {
            head=tail=null;
        }else{
            tail=tail.prev;
            tail.next=null;
        }
    }

    // Method of delete the node from specific position
    @SuppressWarnings("UnnecessaryReturnStatement")
    public void deleteAtSpecific(int position){
        if(head==null){
            System.out.println("Empty Doubly Linked List!!!");
            return;
        }else{
            Node current=head;
            int count=1;
            while(current!=null && count<=position){
                if(count==position){
                    if(current==head){
                        head=head.next;
                        if(head!=null){
                            head.prev=null;
                        }
                    }else if(current == tail){
                        tail=tail.prev;
                        tail.next=null;
                    }else{
                        current.prev.next=current.next;
                        current.next.prev=current.prev;
                    }
                    break;
                }
                current=current.next;
                count++;
            }
        }
    }

    // Method of update the node element value of doubly linked list
    public void UpdateAtBeginning(int val){
        if(head==null){
            System.out.println("Empty Doubly Linked List!!!!");
        }else{
            head.data=val;
        }
    }

    // Method of update the node element value of doubly linked list
    public void updateAtEnd(int val){
        if(head==null){
            System.out.println("Empty Doubly Linked List!!!");
        }else{
            tail.data=val;
        }
    }

    // Method of update the specific position of node element value
    public void updateAtSpecific(int index,int val){
        if(head==null){
            System.out.println("Empty Doubly Linked List!!!");
        }
        else if(index <= 0){
            System.out.println("Position Out Of Range");
        }
        else{
            Node temp=head;
            int count=1;
            while(temp!=null){
                if(index==count){
                    temp.data=val;
                    break;
                }
                count++;
                temp=temp.next;
            }
        }
    }

    // Method of display the doubly linked list
    public void display(){
        if(head==null){
            System.out.println("Empty Doubly Linked List!!!");
        }else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"<-->");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }

    // Main function
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        System.out.print("Original Doubly Linked List: ");
        // Insert values in the doublyly linked list
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
        list.UpdateAtBeginning(43);
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
