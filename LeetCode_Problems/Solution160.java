// LeetCode Problem 160: Intersection Of Two Linked Lists

public class Solution160 {

    // Node class of Singly Linked List
    public static class ListNode {

        // Default Access Modifier And Data Members
        int val;
        ListNode next;

        // Parameterized Constructor
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static class Solution {

        public ListNode head = null;

        // Insert the nodes in the Singly Linked List
        public void insert(int val) {
            ListNode newNode = new ListNode(val);
            if (head == null) {
                head = newNode;
            } else {
                ListNode temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        // Intersection Operation
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null) {
                return null;
            }

            ListNode current = headA;
            ListNode temp = headB;
            while (temp != current) {
                current = (current == null) ? headB : current.next;
                temp = (temp == null) ? headA : temp.next;
            }
            return current;
        }

        // Print the Singly Linked List
        public void printList(ListNode head) {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Main function
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Common part
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        // List A: 4 -> 1 -> 8 -> 4 -> 5
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;

        // List B: 5 -> 6 -> 1 -> 8 -> 4 -> 5
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;

        System.out.print("List A: ");
        solution.printList(headA);

        System.out.print("List B: ");
        solution.printList(headB);

        ListNode intersection = solution.getIntersectionNode(headA, headB);

        if (intersection != null) {
            System.out.println("Intersection Node = " + intersection.val);
        } else {
            System.out.println("No Intersection");
        }
    }
}
