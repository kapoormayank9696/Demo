// LeetCode Problem 328: Odd Even Linked List

import java.util.Scanner;
public class Solution328{

    // class node of linked list
    static class ListNode{
        // Default access modifier and data memebers
        int data;
        ListNode next;
        // Parameterized Constructor
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    ListNode head=null;

    // Method to insert the linked list elements
    public void insert(int data){
        ListNode newNode=new ListNode(data);
        if(head == null){
            head=newNode;
        }else{
            ListNode temp=head;
            while(temp.next != null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    
    // Method to arrange elements by odd even order
    public void oddEvenList() {
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenHead=head.next;
        while(even != null && even.next != null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
    }

    // Method to display the linked list
    @SuppressWarnings("UnnecessaryReturnStatement")
    public void display(){
        if(head == null){
            System.out.println("Empty Linked List!!!");
            return;
        }else{
            ListNode temp=head;
            while(temp != null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }

    // Main function
    public static void main(String[] args) {
        Solution328 list=new Solution328();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            list.insert(value);
        }
        System.out.print("Original Linked List: ");
        list.display();
        list.oddEvenList();
        System.out.print("After arrangement of elements by odd-even order : ");
        list.display();
    }
}
