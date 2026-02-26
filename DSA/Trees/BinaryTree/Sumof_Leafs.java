// Sum of all leaf nodes in a binary tree Algorithm Implementation In Java
// Time Complexity: O(n) where n is the number of nodes in the

public class Sumof_Leafs {
    // Node class of Binary Tree(BT)
    @SuppressWarnings("unused")
    static class Node{
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
        if(root.left == null && root.right == null){
            return root.data;
        }
        // Recursive function
        return sumOfLeafs(root.left) + sumOfLeafs(root.right);
    }

    // Main function
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println("Root of Binary Tree(BT): "+root.data);
        System.out.println("Sum of leaf nodes in a binary tree: "+sumOfLeafs(root));
    }
}
