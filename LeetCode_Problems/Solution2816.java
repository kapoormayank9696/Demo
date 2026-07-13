// LeetCode Problem 2816: Double a Number Represented as a Linked List

public class Solution2816 {

    // Node class of Singly Linked List
    public static class ListNode {

        // Public Access Modifier And Data Members
        public int val;
        public ListNode next;

        // Parameterized Constructor
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static class Solution {
        // Public Access Modifier
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

        // Function to double the value of each node in the linked list
        public ListNode doubleIt(ListNode head) {
            if (head.val >= 5) {
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
        solution.insert(8);
        solution.insert(9);

        System.out.print("Original List: ");
        solution.printList(solution.head);
        
        ListNode ans = solution.doubleIt(solution.head);
        
        System.out.print("After Doubling: ");
        solution.printList(ans);
    }
}
