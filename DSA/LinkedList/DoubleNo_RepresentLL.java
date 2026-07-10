// Double a Number Represented as a Linked List Algorithm Implementation In Java

public class DoubleNo_RepresentLL {
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

        // Double the Number Represented as a Linked List
        public ListNode doubleNumber(ListNode head) {
            if (head.val > 5) {
                ListNode newHead = new ListNode(0);
                newHead.next = head;
                head = newHead;
            }

            ListNode curr = head;
            while (curr != null) {
                curr.val = (curr.val * 2) % 10;
                if (curr.next != null && curr.next.val >= 5) {
                    curr.val++;
                }
                curr = curr.next;
            }
            return head;
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
        solution.insert(1);
        solution.insert(2);
        solution.insert(3);
        System.out.print("Original List: ");
        solution.printList(solution.head);
        ListNode doubledList = solution.doubleNumber(solution.head);
        System.out.print("Doubled List: ");
        solution.printList(doubledList);
    }
}
