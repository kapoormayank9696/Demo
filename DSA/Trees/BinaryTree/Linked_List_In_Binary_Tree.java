
public class Linked_List_In_Binary_Tree {

    // TreeNode class
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // Linked List Node class
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Solution class
    static class Solution {
        int index = -1;

        // Build binary tree using preorder array (-1 = null)
        TreeNode insert(int[] arr) {
            index++;

            if (index >= arr.length || arr[index] == -1) {
                return null;
            }

            TreeNode node = new TreeNode(arr[index]);

            node.left = insert(arr);
            node.right = insert(arr);

            return node;
        }

        // Check whether linked list matches from this tree node
        boolean checkSubPath(ListNode head, TreeNode root) {
            if (head == null) {
                return true;
            }

            if (root == null || head.val != root.val) {
                return false;
            }

            return checkSubPath(head.next, root.left)
                    || checkSubPath(head.next, root.right);
        }

        // Search every tree node as a possible starting point
        boolean isSubPath(ListNode head, TreeNode root) {
            if (head == null) {
                return true;
            }

            if (root == null) {
                return false;
            }

            return checkSubPath(head, root)
                    || isSubPath(head, root.left)
                    || isSubPath(head, root.right);
        }

        // Print tree in preorder
        void printPreorder(TreeNode root) {
            if (root == null) {
                return;
            }

            System.out.print(root.val + " ");
            printPreorder(root.left);
            printPreorder(root.right);
        }

        // Insert a node at the end of linked list
        ListNode insertList(ListNode head, int val) {
            ListNode newNode = new ListNode(val);

            if (head == null) {
                return newNode;
            }

            ListNode temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
            return head;
        }

        // Print linked list
        void printList(ListNode head) {
            while (head != null) {
                System.out.print(head.val + " ");
                head = head.next;
            }

            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {

        int[] arr = {
            1, 4, 2, -1, 1, 4, 2, -1, 6,
            -1, -1, 8, 1, -1, -1, 3, -1, -1
        };

        Solution sol = new Solution();

        TreeNode root = sol.insert(arr);

        System.out.print("Preorder traversal of the tree: ");
        sol.printPreorder(root);
        System.out.println();

        ListNode head = null;
        int[] headVals = {4, 2, 8};

        for (int val : headVals) {
            head = sol.insertList(head, val);
        }

        System.out.print("Linked List: ");
        sol.printList(head);

        System.out.println(
            "Is the linked list a subpath of the binary tree? "
            + (sol.isSubPath(head, root) ? "Yes" : "No")
        );
    }
}
