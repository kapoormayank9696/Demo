// Delete Node From Binary Tree Algorithm Implementation In Java
import java.util.LinkedList;
import java.util.Queue;

public class DeleteBT {
    // Node class of Binary Tree(BT)
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

    // Class to find the root of Binary Tree
    static class BinaryTree {
        int index = -1;
        public Node buildTree(int[] nodes) {
            index++;
            if(index >= nodes.length || nodes[index] == -1) return null;
            Node newNode = new Node(nodes[index]);
            // Recursive calls of the left and righrt subtrees
            newNode.left = buildTree(nodes); // Left Subtree
            newNode.right = buildTree(nodes); // Right Subtree
            return newNode;
        }
    }

    // Function to display the nodes of Binary Tree
    public static void display(Node root) {
        if(root == null) return;
        System.out.print(root.data + " ");
        display(root.left); // Left Subtree
        display(root.right); // Right Subtree
    }

    // Delete node from a general binary tree
    public static Node deleteNode(Node root, int key) {
        if(root == null) return null;
        if(root.left == null && root.right == null) {
            return (root.data == key) ? null : root;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node keyNode = null;
        Node temp = null;

        // Level-order traversal to find keyNode and deepest node
        while(!q.isEmpty()) {
            temp = q.poll();
            if(temp.data == key) keyNode = temp;
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
        }

        if(keyNode != null && temp != null) {
            keyNode.data = temp.data;      // Replace target with deepest node
            deleteDeepest(root, temp);     // Remove deepest node
        }

        return root;
    }

    // Remove the deepest node
    public static void deleteDeepest(Node root, Node delNode) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node temp;

        while(!q.isEmpty()) {
            temp = q.poll();
            if(temp.left != null) {
                if(temp.left == delNode) {
                    temp.left = null;
                    return;
                } else q.add(temp.left);
            }
            if(temp.right != null) {
                if(temp.right == delNode) {
                    temp.right = null;
                    return;
                } else q.add(temp.right);
            }
        }
    }

    // Main function
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.print("Original Tree: ");
        display(root);

        root = deleteNode(root, 5); // Delete node with value 5

        System.out.print("\nAfter Deletion: ");
        display(root);
    }
}
