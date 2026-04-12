// Circular Linked List All Operations Algorithm Implemented In Java

import java.io.BufferedReader;
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

    // Update node data at the beginning of circular linked list
    public void updateAtBeginning(int data){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head.data=data;
    }

    // Update node data at a specific position in circular linked list
    public void updateAtPosition(int data, int position){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        for(int i=1; i<position; i++){
            temp=temp.next;
            if(temp==head){
                System.out.println("Position out of bounds");
                return;
            }
        }
        temp.data=data;
    }

    // Update node data at the end of circular linked list
    public void updateAtEnd(int data){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp.next != head){
            temp=temp.next;
        }
        temp.data=data;
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
    public static void main(String[] args) throws Exception{
        CircularLinkedList list = new CircularLinkedList();
        try(BufferedReader br=new BufferedReader(new java.io.InputStreamReader(System.in))){
            System.out.println("Enter number of nodes to insert:");
            int n=Integer.parseInt(br.readLine());
            for(int i=0; i<n; i++){
                System.out.println("Enter data for node "+(i+1)+":");
                int data=Integer.parseInt(br.readLine());
                list.insertAtEnd(data);
            }
            list.display();
            // Insertions Operations
            System.out.println("Enter data to insert at the beginning:");
            int beginningData=Integer.parseInt(br.readLine());
            list.insertAtBeginning(beginningData);
            list.display();
            System.out.println("Enter position to insert new node:");
            int position=Integer.parseInt(br.readLine());
            System.out.println("Enter data for new node:");
            int data=Integer.parseInt(br.readLine());
            list.insertAtPosition(data, position);
            list.display();
            System.out.println("Enter data to insert at the end:");
            int endData=Integer.parseInt(br.readLine());
            list.insertAtEnd(endData);
            list.display();
            // Update Operations
            System.out.println("Enter data to update at the beginning:");
            int updateBeginningData=Integer.parseInt(br.readLine());
            list.updateAtBeginning(updateBeginningData);
            list.display();
            System.out.println("Enter position to update node:");
            position=Integer.parseInt(br.readLine());
            System.out.println("Enter data to update node:");
            int updatePositionData=Integer.parseInt(br.readLine());
            list.updateAtPosition(updatePositionData, position);
            list.display();
            System.out.println("Enter data to update at the end:");
            int updateEndData=Integer.parseInt(br.readLine());
            list.updateAtEnd(updateEndData);
            list.display();
            // Deletion Operations
            list.deleteAtBeginning();
            list.display();
            System.out.println("Enter position to delete node:");
            position=Integer.parseInt(br.readLine());
            list.deleteAtPosition(position);
            list.display();
            list.deleteAtEnd();
            list.display();
            // Final Display of Circular Linked List
            System.out.println("Final Circular Linked List:");
            list.display();
        }
    }
}

