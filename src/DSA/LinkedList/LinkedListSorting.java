public class LinkedListSorting{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    public void insert(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    //Sorting the Linked List using Bubble Sort

    public void sort(){
        if(head==null || head.next==null){
            return;
        }
        boolean swapped;
        do{
            swapped=false;
            Node current=head;
            while(current.next!=null){
                if(current.data > current.next.data){
                    int temp=current.data;
                    current.data=current.next.data;
                    current.next.data=temp;
                    swapped=true;
                }
                current=current.next;
            }
        }while(swapped);
        }
        public void display(){
        if(head==null){
            System.out.println("Empty List");
        }else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        LinkedListSorting list=new LinkedListSorting();
        list.insert(5);
        list.insert(3);
        list.insert(8);
        list.insert(1);
        System.out.println("Original List:");
        list.display();
        list.sort();
        System.out.println("Sorted List:");
        list.display();
    }
}