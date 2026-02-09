// LeetCode Problem 23: Merge k Sorted Lists

public class Solution23{
    // Node class for Linked List
    static class ListNode{
        // Default Access Modifier and Data Members
        int val;
        ListNode next;
        // Parameterized Constructor
        public ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }

    // Method to return the sorted ListNode
    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        return mergesort(lists,0,lists.length-1);
    }

    // Method to sort the each part of ListNode
    public static ListNode mergesort(ListNode[] lists,int low,int high){
        if(low == high){
            return lists[low];
        }
        int mid=low+(high-low)/2;
        ListNode l1=mergesort(lists,low,mid);
        ListNode l2=mergesort(lists,mid+1,high);
        return mergeSortedLists(l1,l2);
    }

    // Method to merge the sorted ListNode parts together
    public static ListNode mergeSortedLists(ListNode l1,ListNode l2){
        ListNode temp=new ListNode(0);
        ListNode current=temp;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                current.next=l1;
                l1=l1.next;
            }
            else{
                current.next=l2;
                l2=l2.next;
            }
            current=current.next;
        }

        while(l1 != null){
            current.next=l1;
            l1=l1.next;
            current=current.next;
        }

        while(l2 != null){
            current.next=l2;
            l2=l2.next;
            current=current.next;
        }
        return temp.next;
    }

    // Method to final ListNode
    @SuppressWarnings("UnnecessaryReturnStatement")
    public static void printList(ListNode l1){
        if(l1 == null){
            System.out.println("[]");
            return;
        }
        ListNode current=l1;
        System.out.print("Listnode data: ");
        while(current != null){
            System.out.print(current.val+" ");
            current=current.next;
        }
    }

    // Main function
    public static void main(String[] args){

        // Build input lists: [[1,4,5],[1,3,4],[2,6]]
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode[] lists = { l1, l2, l3 };
        ListNode result = mergeKLists(lists);
        printList(result);
    }
}

