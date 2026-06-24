// Palindrome Singly Linked List Algorithm Implementation In Java

public class Solution243 {

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

    class Solution {

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

        // Reverse the Singly Linked List
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;
            while (curr != null) {
                ListNode nextTemp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextTemp;
            }
            return prev;
        }

        // Check if the Singly Linked List is Palindrome
        public boolean isPalindrome(ListNode head) {
            if (head == null || head.next == null) {
                return true;
            }

            // Copy 
            ListNode copyHead = new ListNode(head.val);

            // Reverse 
            ListNode tail = reverseList(copyHead);

            // Compare 
            ListNode temp = copyHead;
            ListNode current = tail;

            while (current != null && temp != null) {
                if (current.val != temp.val) {
                    return false;
                }
                current = current.next;
                temp = temp.next;
            }
            return true;
        }

        // Copy the Singly Linked List
        public ListNode copyList(ListNode head) {
            if (head == null) {
                return null;
            }
            ListNode newHead = new ListNode(head.val);
            ListNode current = newHead;
            ListNode temp = head.next;
            while (temp != null) {
                current.next = new ListNode(temp.val);
                current = current.next;
                temp = temp.next;
            }
            return newHead;
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
        Solution243 solution243 = new Solution243();
        Solution solution = solution243.new Solution();
        // Insert nodes into the Singly Linked List
        int[] values = {1, 2, 3, 2, 1};
        for (int val : values) {
            solution.insert(val);
        }

        // Print the original list
        System.out.print("Original List: ");
        solution.printList(solution.head);

        // Check if the list is a palindrome
        boolean isPalindrome = solution.isPalindrome(solution.head);
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}
