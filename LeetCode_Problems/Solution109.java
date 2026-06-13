// LeetCode Problem 109: Convert Sorted List to Binary Search Tree

public class Solution109 {

    @SuppressWarnings("unused")
    // Class Of Singly Linked List Node
    public class ListNode {

        int val;
        ListNode next;

        // Parameterized Constructor
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    @SuppressWarnings("unused")
    // Class Of Binary Tree Node
    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        // Parameterized Constructor
        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // Function to find the middle node of the Linked List
    public ListNode findMiddle(ListNode head) {
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (prev != null) {
            prev.next = null; // Break the link to the second half
        }

        return slow;
    }

    // Function to convert sorted linked list to balanced BST
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return new TreeNode(head.val);
        }
        ListNode mid = findMiddle(head);
        TreeNode root = new TreeNode(mid.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(mid.next);
        return root;
    }

    // Function to print the inorder traversal of the BST
    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }

    // Main function
    public static void main(String[] args) {
        Solution109 converter = new Solution109();
        int[] sortedArray = {-10, -3, 0, 5, 9};
        ListNode head = null;
        ListNode current = null;
        for (int val : sortedArray) {
            // Safely handle potential null 'current' to avoid dereferencing null
            if (current == null) {
                head = converter.new ListNode(val);
                current = head;
            } else {
                current.next = converter.new ListNode(val);
                current = current.next;
            }
        }
        // Convert the sorted linked list to a balanced BST
        TreeNode bstRoot = converter.sortedListToBST(head);

        // Print the inorder traversal of the BST
        System.out.println("Inorder Traversal of the Balanced BST:");
        converter.inorderTraversal(bstRoot);
    }
}
