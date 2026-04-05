// User Input for Build BST Algorithms Implementation In Java

import java.util.Scanner;

public class User_Input {
    // Node class of Binary Search Tree
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

    // Function to insert into binary search tree(BST)
    public static Node insert(Node root,int data) {
        if(root == null) {
            return new Node(data);
        }
        else{
            // Recursive Calls
            if(data <= root.data) {
                root.left=insert(root.left,data); // Left Subtree
            }else {
                root.right=insert(root.right,data); // Right Subtree
            }
            return root;
        }
    }
    
    // Function to print the Binary Search Tree
    public static void preOrder(Node root) {
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        // Recursive Calls
        preOrder(root.left); // Left Subtree
        preOrder(root.right); // Right Subtree
    }
    
    // Main Function
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        Node root=null;
        System.out.print("Enter number of terms: ");
        int t=sc.nextInt();
        System.out.print("Enter nodes: ");
        while(t-- > 0) {
            int value=sc.nextInt();
            root=insert(root,value);
        }
        System.out.print("Traversal Binary Search Tree root to leafs: ");
        preOrder(root);
        sc.close();
    }
}
