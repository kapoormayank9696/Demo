// Binary Search Tree Iterator Algorithm Implementation In Java
import java.util.Stack;
public class Binary_Search_Tree_Iterator {
    
    // Class for Binary Search Tree Node
    public static class BSTNode {

        // Data Members
        public int val;
        public BSTNode left;
        public BSTNode right;

        // Parameterized Constructor
        BSTNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // Class for Binary Search Tree Iterator
    public static class BSTIterator {
        
        // Stack to store the nodes of the BST
        Stack<BSTNode> stack;

        // Default Constructor

        BSTIterator() {
            stack = new Stack<>();
        }
        
        // Create BST
        BSTNode insert(BSTNode root, int value) {

            // If root is empty

            if (root == null) {
                root = new BSTNode(value);
                return root;
            }

            // Left Subtree
            if (value < root.val) {
               root.left = insert(root.left, value);
            }

            // Right Subtree
            else {
                root.right = insert(root.right, value);
            }
            
            return root;
        }


        // Print Binary Search Tree

        void printBST(BSTNode root) {

            if (root == null) {
                System.out.println("Empty Binary Search Tree..");
                return;
            }

            // Inorder Traversal
            printBST(root.left);
            System.out.print(root.val + " ");
            printBST(root.right);
        }

        // Constructor for Iterator
        @SuppressWarnings("OverridableMethodCallInConstructor")
        BSTIterator(BSTNode root) {
            stack = new Stack<>();
            pushLeft(root);
        }

        // Push leftmost path into stack
        void pushLeft(BSTNode root) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
        }

        // Return next smallest element
        int next() {
            BSTNode temp = stack.pop();

            if (temp.right != null) {
                pushLeft(temp.right);
            }
            return temp.val;
        }

        // Check whether next element exists
        boolean hasNext() {
            return !stack.isEmpty();
        }
    }
    // Main Class

    public static void main(String[] args) {

        int[] values = {9, 3, 20, 15, 7};


        // Object for creating BST
        BSTIterator bst = new BSTIterator();

        BSTNode root = null;


        // Create BST
        for (int value : values) {

            root = bst.insert(root, value);
        }


        // Print BST
        System.out.print("Inorder Traversal of the BST: ");

        bst.printBST(root);


        System.out.println();


        // Create Iterator using root
        BSTIterator iterator = new BSTIterator(root);


        System.out.print("Binary Search Tree Iterator: ");


        // Iterate through BST
        while (iterator.hasNext()) {

            System.out.print(iterator.next() + " ");
        }


        System.out.println();
    }
}
