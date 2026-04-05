
import java.util.ArrayList;

// Root to Leaf Paths Algorithm Implemented In Java

public class Root_Leaf {
    // Node class of Binary Search Tree(BST)
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

    // Insert node in Binary Search Tree(BST)
    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        }
        if(data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // Function to print the path from root to leaf
    public static void printPath(ArrayList<Integer> path) {
        for(int i : path) {
            System.out.print(i + "->");
        }
        System.out.println("null");
    }

    // Function to find root to leaf paths in a binary tree
    public static void printRootLeaf(ArrayList<Integer> path,Node root) {
        if(root == null) return;
        path.add(root.data);
        if(root.left == null && root.right == null) {
            printPath(path);
        }else {
            printRootLeaf(path, root.left);
            printRootLeaf(path, root.right);
        }
        path.remove(path.size() - 1);
    }

    // Function to pre order traverse the binary tree
    public static void preOrder(Node root) {
        if(root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left); // Left Subtree
        preOrder(root.right); // Right Subtree
    }

    // Main function
    public static void main(String[] args) {
        int[] nodes={8,5,10,3,6,11,14};
        Node root=null;
        for(int node : nodes) {
            root = insert(root, node);
        }
        System.out.print("Pre Order Traversal: ");
        preOrder(root);
        System.out.println();
        ArrayList<Integer> path = new ArrayList<>();
        printRootLeaf(path, root);
    }
}

