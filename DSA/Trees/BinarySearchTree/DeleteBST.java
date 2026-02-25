// Delete Node From BST Algorithm Implementation in Java

public class DeleteBST {
    // Node class of Binary Tree(BST)
    public static class Node {
        // Default Access Modifier And Data Members
        int data;
        Node left;
        Node right;
        // Parameterized Constructor
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    // Function to insert a node in BST
    public static Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // Function to perform preorder traversal of the BST
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Function to find the minimum value in a subtree
    public static int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    // Function to delete a node from BST
    public static Node delete(Node root, int key) {
        if (root == null) {
            return root;
        }
        // Recursive calls for left and right subtrees
        if (key < root.data) {
            // Left Subtree
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            // Right Subtree
            root.right = delete(root.right, key);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.data = minValue(root.right);
            // Delete the inorder successor
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    // Main function
    public static void main(String[] args) {
        int[] values = { 5, 3, 6, 2, 4, 7 };
        Node root = null;
        for(int num:values) {
            root = insert(root, num);
        }
        System.out.print("Preorder Traversal: ");
        preOrder(root);
        int key = 3;
        root = delete(root, key);
        System.out.print("\nPreorder Traversal after Deletion of " + key + ": ");
        preOrder(root);
    }
}
