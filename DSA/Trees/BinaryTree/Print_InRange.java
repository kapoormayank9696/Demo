

public class Print_InRange {
    // Node class of Binary Tree
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

    // class to insert the values in Binary Tree
    public static class BinaryTree {
        public int index=-1;
        public Node buildTree(int[] values) {
            index++;
            if(index >= values.length || values[index] == -1) {
                return null;
            }
            Node newNode = new Node(values[index]);
            newNode.left = buildTree(values);
            newNode.right = buildTree(values);
            return newNode;
        }
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
    public static void main(String[] args) {
        int[] values = {10,5,3,-1,-1,7,-1,-1,15,12,-1,-1,18,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(values);
        System.out.print("Pre Order Traversal Of Binary Tree:");
        preOrder(root);
        System.out.print("\n\nNodes In The Range [6,13]:");
        printInRange(root, 6, 13);
    }
}
