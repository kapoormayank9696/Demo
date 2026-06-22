// LeetCode Problem 2: Add Two Numbers

public class Solution2 {
    // Node class of Linked List
    public static class ListNode {

        // Default Access Modifier And Data Members
        int data;
        ListNode next;

        // Parameterized Constructor
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function To Add Two Numbers Represented By Linked Lists
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }
        return dummy.next;
    }

    // Function To Print Linked List
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    // Main function
    public static void main(String[] args) {
        // Creating first linked list: 2 -> 4 -> 3
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Creating second linked list: 5 -> 6 -> 4
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Adding the two numbers
        ListNode result = addTwoNumbers(l1, l2);

        // Printing the result: should be 7 -> 0 -> 8
        System.out.print("Resultant Linked List After Adding Two Numbers: ");
        printList(result);
    }
}
