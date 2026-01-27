// LeetCode Problem 1721: Swapping Nodes in a Linked List

import java.util.Scanner;
public class Solution1721{
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
    
    // Method to swapping the nodes elements from linked list
     public void swapNodes(int k) {
        ListNode temp=head;
        @SuppressWarnings("unused")
        int count=1;
        int n=0;
        while(temp != null){
            temp=temp.next;
            n++;
        }
        ListNode first=head;
        for(int i=1;i<k;i++){
            first=first.next;
        }
        ListNode second=head;
        for(int i=1;i<n-k+1;i++){
            second=second.next;
        }
        int c=first.data;
        first.data=second.data;
        second.data=c;
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
        Solution1721 list=new Solution1721();
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
        System.out.print("Enter position of node: ");
        int k=sc.nextInt();
        list.swapNodes(k);
        System.out.print("After swapping node elements of linked list: ");
        list.display();
    }
}
