// LeetCode Problem 2095: Delete the Middle Node of a Linked List

import java.util.Scanner;
public class Solution2095{
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
    
    // Method to delete the midle element node from linked list
    public void deleteMiddle() {
        if(head == null || head.next == null){
            head=head.next;
        }
        ListNode fast=head.next;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
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
        Solution2095 list=new Solution2095();
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
        list.deleteMiddle();
        System.out.print("After deleting middle node element of linked list: ");
        list.display();
    }
}

