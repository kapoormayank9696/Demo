// Print All The Nodes In A Given Range In A Binary Search Tree Algorithm Implementation In Java
public class Print_In_Range {
    // Node class of Binary Search Tree
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

    // Method to insert the values in Binary Search Tree
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        // Recursive calls for left and right subtree
        if (root.data > val) {
            // Left Subtree
            root.left = insert(root.left, val);
        } else {
            // Right Subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Method to print the values in form of pre order traversal
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Method to print the nodes in a given range
    public static void printInRange(Node root,int low,int high) {
        if(root == null) return;
        if(root.data >= low && root.data <= high) {
            printInRange(root.left, low, high); // Left Subtree
            System.out.print(root.data+" ");
            printInRange(root.right, low, high); // Right Subtree
        } 
        else if(root.data >= high) {
            printInRange(root.left, low, high); // Left Subtree
        }
        else {
            printInRange(root.right, low, high); // Right Subtree
        }
    }

    // Main function
    public static void main(String[] args) throws Exception {
        int[] values = {10, 5, 15, 3, 7, 12, 18};
        Node root=null;
        for(int val:values){
            root=insert(root, val);
        }
        System.out.print("Preorder Traversal of the Binary Search Tree: ");
        preOrder(root);
        System.out.print("\nNodes in the range: ");
        printInRange(root, 5, 15);
    }
}
