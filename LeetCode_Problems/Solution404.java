// LeetCode Problem 404: Sum of Left Leaves

public class Solution404 {
    // Node class of Binary Tree(BT)
    @SuppressWarnings("unused")
    static class Node{
        // Default Access Modifier And Data Members of Node class
        int data;
        Node left;
        Node right;
        // Parameterized Constructor
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    // class to find the root of Binary Tree(BT)
    static class BinaryTree{
        int index=-1;
        public Node buildTree(int[] nodes){
            index++;
            if(index >= nodes.length || nodes[index] == -1){
                return null;
            }
            Node newNode=new Node(nodes[index]);
            // Recursive function
            newNode.left=buildTree(nodes); // for left side of Binary Tree
            newNode.right=buildTree(nodes); // for right side of Binary Tree
            return newNode;
        }
    }
    
    // Function to calculate the sum of leaf nodes in a binary tree
    static int sumOfLeafs(Node root){
        if(root == null){
            return 0;
        }
        int sum=0;
        if(root.left != null && root.left.left == null && root.left.right == null){
            sum += root.left.data;
        }
        // Recursive function
        return sum+sumOfLeafs(root.left) + sumOfLeafs(root.right);
    }
    
    // Main function
    public static void main(String[] args) {
        int[] nodes={3,9,-1,-1,20,15,-1,-1,7,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println("Root of Binary Tree(BT): "+root.data);
        System.out.println("Sum of leaf nodes in a binary tree: "+sumOfLeafs(root));
    }
}

