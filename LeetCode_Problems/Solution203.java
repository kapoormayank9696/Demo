// LeetCode Problem 203: Remove Linked List Elements

import java.util.Scanner;
public class Solution203{
    // Definition for singly-linked list.
    static class ListNode{
        // Default Access Modifier and data members of class
        int val;
        ListNode next;
        public ListNode(int x) {
            this.val = x; 
            this.next = null;
        }
    }

    ListNode head=null;
    // Function to insert the elements in the linked list
    public void insert(int data){
        ListNode newNode=new ListNode(data);
        if(head==null){
            head=newNode;
        }else{
            ListNode temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    // Function to display the linked list
    public void display(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+"--> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    // Function to remove elements from the linked list
    public void removeElements(int val) {
        while(head != null && head.val==val){
            head=head.next;
        }
        ListNode current=head;
        while(current!=null && current.next!=null){
            if(current.next.val==val){
                current.next=current.next.next;
            }else{
            current=current.next;
            }
        }
    }

    // Main function
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Solution203 list=new Solution203();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements in the linked list: ");
        int n=sc.nextInt();
        System.out.print("Enter elements of the linked list: ");
        for(int i=0;i<n;i++){
            list.insert(sc.nextInt());
        }
        System.out.print("Original Linked List:");
        list.display();
        System.out.print("Enter value to be removed: ");
        int val=sc.nextInt();
        list.removeElements(val);
        System.out.println("Linked List after removing elements with value " + val + ":");
        list.display();
        sc.close();
    }
}
