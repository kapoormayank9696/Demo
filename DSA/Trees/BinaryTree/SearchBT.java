// Searching In Binary Tree(BT) Algorithm Implementation In Java
// Time & space complexity O(n)
public class SearchBT{
    
    // Node class of Binary Tree(BT)
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

    // Class to find the root of Binary Tree(BT)
    public static class BinaryTree{
        int index=-1;
        public Node buildTree(int[] values) {
            index++;
            if(index >= values.length || values[index] == -1){
                return null;
            }
            // Store the data in new node variable
            Node newNode=new Node(values[index]);
            // Recursion Function
            newNode.left=buildTree(values); // Left Subtree
            newNode.right=buildTree(values); // Right Subtree
            return newNode;
        }
    } 

    // Function to search the target node from Binary Tree(BT)
    public static boolean search(Node root,int target) {
        if(root == null) {
            return false;
        }
        if(root.data == target) {
            return true;
        }
        // Search in left and right subtree
        return search(root.left, target) || search(root.right, target);
    }

    // Function to print nodes of Binary Tree(BT)
    public static void print(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data+" ");
        print(root.left); // Left Subtree
        print(root.right); // Right Subtree
    }

    // Main function
    public static void main(String[] args) {
        int[] values={5,12,23,-1,-1,37,-1,-1,18,42,-1,-1,56,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(values);
        System.out.println("Root of Binary Tree(BT): "+root.data);
        System.out.print("Print Binary Tree(BT) nodes: ");
        print(root);
        int target=12;
        if(search(root,target)) {
            System.out.println("\nTarget "+target+" node is exist in Binary Tree(BT)...");
        }else{
            System.out.println("\nTarget "+target+" node does n't exist in Binary Tree(BT)...");
        }
    }
}

