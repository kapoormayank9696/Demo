// Circular Linked List All Operations Algorithm Implemented In Java
public class CircularLinkedList{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;

    // Insertion nodes in circular linked list
    public void insert(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            newNode.next=head;
        }else{
            Node temp=head;
            while(temp.next != head){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=head;
        }
    }

    // Insertion at the beginning of circular linked list
    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            newNode.next=head;
        }else{
            Node temp=head;
            while(temp.next != head){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=head;
            head=newNode;
        }
    }

    // Insertion at a specific position in circular linked list
    public void insertAtPosition(int data, int position){
        Node newNode = new Node(data);
        if(position==1){
            insertAtBeginning(data);
            return;
        }
        Node temp=head;
        for(int i=1; i<position-1; i++){
            temp=temp.next;
            if(temp==head){
                System.out.println("Position out of bounds");
                return;
            }
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    // Insertion at the end of circular linked list
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            newNode.next=head;
        }else{
            Node temp=head;
            while(temp.next != head){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=head;
        }
    }

    // Deletion at the beginning of circular linked list
    public void deleteAtBeginning(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==head){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next != head){
            temp=temp.next;
        }
        temp.next=head.next;
        head=head.next;
    }

    // Deletion at a specific position in circular linked list
    public void deleteAtPosition(int position){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(position==1){
            deleteAtBeginning();
            return;
        }
        Node temp=head;
        for(int i=1; i<position-1; i++){
            temp=temp.next;
            if(temp.next==head){
                System.out.println("Position out of bounds");
                return;
            }
        }
        temp.next=temp.next.next;
    }

    // Deletion at the end of circular linked list
    public void deleteAtEnd(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==head){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next != head){
            temp=temp.next;
        }
        temp.next=head;
    }
    
    // Display nodes in circular linked list
    public void display(){
        Node temp=head;
        do{
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        while(temp != head);
        System.out.println("Back to head <->"+head.data);
    }
    
    // Main function
    public static void main(String[] args){
        CircularLinkedList list = new CircularLinkedList();
        list.insert(5);
        list.insert(23);
        list.insert(33);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.display();
    }
}

