// SubRoot of Root Binary Tree Check it is true/false Algorithm Implementation In Java
// Time Complexity: O(m*n) where m and n are the number of nodes in the root and subRoot trees respectively.
// Space Complexity: O(h) where h is the height of the tree.

public class SubRootOf_Root {
    
    // Node class
    @SuppressWarnings("unused")
    public static class Node{
        // Default Access Modifier And Data Members
        int data;
        Node left;
        Node right;
        // Parameterized Constructor
        public Node (int data){
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

    // Function to check if two Binary Trees are identical
    public static boolean isIdentical(Node root, Node subRoot){
        // Base Cases
        if(root == null && subRoot == null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }
        if(root.data != subRoot.data){
            return false;
        }
        // Recursive function
        return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
    }

    // Function to check the SubRoot of Root Binary Tree(BT) is true/false
    public static boolean isSubtree(Node root, Node subRoot){
        // Base Cases
        if(subRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }
        // Recursive function
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    // Main function
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,-1};
        Node root = tree.buildTree(nodes);
        System.out.println("Root of Binary Tree(BT): "+root.data);
        int[] subNodes = {2,4,-1,-1,5,-1,-1};
        BinaryTree tree2 = new BinaryTree();
        Node subRoot = tree2.buildTree(subNodes);
        System.out.println("SubRoot of Binary Tree(BT): "+subRoot.data);
        System.out.println("Subtree check result: "+isSubtree(root, subRoot));
    }
}
