// Sum of all leafs Nodes Algorithm Implementation In Java
// Time complexity: O(n)
// Space complexity: O(h)
public class SumOf_LeafsNode {
    // Node class of Binary Search Tree(BST)
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

    // Function to insert the nodes in BST
    public static Node insert(Node root,int val) {
        if(root == null) {
            return new Node(val);
        }
        if(root.data > val) {
            // Left Subtree
            root.left=insert(root.left, val);
        }
        if(root.data < val) {
            // Right Subtree
            root.right=insert(root.right, val);
        }
        return root;
    }

    // Function to perform th sum of all nodes of BST
    public static int sumOfLeafsNodes(Node root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null) {
            return root.data;
        }
        return sumOfLeafsNodes(root.left)+sumOfLeafsNodes(root.right);
    }

    // Function to print the BST nodes
    public static void print(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data+" ");
        print(root.left);
        print(root.right);
    }

    // Main function
    public static void main(String[] args) {
        int[] nums={50,30,25,20,70,80,110,100,65,75,90};
        Node root=null;
        for(int num:nums) {
            root=insert(root,num);
        }
        System.out.print("Print Nodes of Binary Search Tree(BST): ");
        print(root);
        System.out.println("\nSum of all leafs nodes of Binary Search Tree(BST): "+sumOfLeafsNodes(root));
    }
}
