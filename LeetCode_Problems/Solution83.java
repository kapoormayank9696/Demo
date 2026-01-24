// Leet Code Problem 83: Remove Duplicate from Sorted List

import java.util.Scanner;
public class Solution83{
    // Node class
    static class ListNode{
        // Default Access Modifier And Data Memebers
        int val;
        ListNode next;
        // Parameterized Constructor
        public ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }

    ListNode head=null;
    // Method of insert the node element in singly linked list
    public void insert(int val){
        ListNode newNode=new ListNode(val);
        if(head == null){
            head=newNode;
        }else{
            ListNode temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    // Method of remove duplicate the node element from singly linked list
    public void deleteDuplicates() {
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.val == temp.next.val){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
    }

    // Method to display the linked list
    public void display(){
        if(head == null){
            System.out.println("Empty Singly Linked List!!!");
        }else{
            ListNode temp=head;
            while(temp!=null){
                System.out.print(temp.val+"-->");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }

    // Main function
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Solution83 list=new Solution83();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter node elements: ");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            list.insert(value);
        }
        System.out.print("Original Singly Linke List: ");
        list.display();
        list.deleteDuplicates();
        System.out.print("After deletion the duplicate node elements from singly linked list: ");
        list.display();
        sc.close();
    }
}
