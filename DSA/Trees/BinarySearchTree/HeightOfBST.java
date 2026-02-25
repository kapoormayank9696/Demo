// Height Of BST Algorithm Implementation In Java

public class HeightOfBST{

    // Node class of BST
    public static class Node{
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

    // Function to insert a nodes of BSt
    public static Node insert(Node root,int val) {
        if(root == null) {
            return new Node(val);
        }
        // Recursive function
        if(root.data > val) {
            // Left Subtree
            root.left=insert(root.left,val);
        }
        if(root.data < val){
            // Right Subtree
            root.right=insert(root.right, val);
        }
        return root;
    }

    // Function to print the BST tree
    public static void print(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data+" ");
        // Recursive Function
        print(root.left); // Left Subtree
        print(root.right); // Right Subtree
    }

    // Function to find the Height of Binary Search Tree(BST)
    public static int heightOfBST (Node root) {
        if(root == null) {
            return 0;
        }
        // Recursive Function
        int leftheight=heightOfBST(root.left); // Left Subtree
        int rightheight=heightOfBST(root.right); // Right Subtree
        return Math.max(leftheight,rightheight)+1;
    }

    // Main function
    public static void main(String[] args) {
        int[] values = { 5, 3, 6, 2, 4, 7 };
        Node root=null;
        for(int num:values){
            root=insert(root, num);
        }
        System.out.print("Print BST : ");
        print(root);
        System.out.println("\nHeight of Binary Search Tree(BST): "+heightOfBST(root));
    }
}


