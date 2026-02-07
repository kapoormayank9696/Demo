// Binary Tree(BT) Algorithm Implementation In Java

public class PreOrder_BinaryTree {
    
    // Node class
    @SuppressWarnings("unused")
    static class Node{
        // Default Access Modifier And Data Members
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

    // BinaryTree builder
    static class BinaryTree{
        static int index = -1;
        public Node buildTree(int nodes[]){
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node newNode =new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    // Method to print the Binary Tree(BT) values
    public static void preOrder (Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Main function
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Root value of Binary Tree(BT): "+root.data);
        System.out.print("PreOrder Traversal: ");
        preOrder(root);
    }
}
