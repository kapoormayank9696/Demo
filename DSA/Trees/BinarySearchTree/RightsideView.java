// Right Side View From Binary Search Tree(BST) Algorithms Implementation In Jav

public class RightsideView {

    // Node class of Binary Search Tree(BST)
    @SuppressWarnings("unused")
    public static class Node {
        // Default Access Modifier And Data Members
        int data;
        Node left;
        Node right;
        // Parameterized Constructor
        public Node(int data) {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    // Function to insert nodes in BSt
    public static Node insert(Node root,int val) {
        if(root == null) {
            return new Node(val);
        }
        if(root.data > val) {
            // Left Subtree
            root.left=insert(root.left,val);
        }
        if(root.data < val) {
            // Right Subtree
            root.right=insert(root.right,val);
        }
        return root;
    }

    // Function to display all nodes of Binary Search Tree(BST)
    public static void print(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data+" ");
        // Recursive Function
        print(root.left); // Left Subtree
        print(root.right); // Right Subtree
    }

    // Function to print all right side values of nodes from BST
    public static void rightSide_View(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data+" ");
        // Recursive Function
        rightSide_View(root.right);
    }
    // Main function
    public static void main(String[] args) {
        int[] values={50,30,80,20,70,75,100,110,90,25,65};
        Node root=null;
        for (int val:values) {
            root=insert(root, val);
        }
        System.out.print("Print nodes of Binary Search Tree(BST): ");
        print(root);
        System.out.print("\nRight Side View From Binary Search Tree(BST): ");
        rightSide_View(root);
    }
}
