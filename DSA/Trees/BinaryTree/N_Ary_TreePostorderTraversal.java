// N-ary Tree Preorder Traversal Algorithm Implementation In Java
import java.util.ArrayList;
import java.util.List;

public class N_Ary_TreePostorderTraversal {

    // Node class for N-ary Tree
    public static class Node {
        public int val;
        public List<Node> children;

        // Parameterized Constructor
        Node(int x) {
            this.val = x;
            this.children = new ArrayList<>();
        }
    }

    // Function to print N-ary Tree preorder
    public static void printPreOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");

        for (Node child : root.children) {
            printPreOrder(child);
        }
    }

    // Post order Method
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        for (Node child : root.children) {
            result.addAll(postorder(child));
        }
        result.add(root.val);

        return result;
    }

    // Main function
    public static void main(String[] args) {

        // Create N-ary Tree
        Node root = new Node(1);

        root.children.add(new Node(3));
        root.children.add(new Node(2));
        root.children.add(new Node(4));

        root.children.get(0).children.add(new Node(5));
        root.children.get(0).children.add(new Node(6));

        // Print preorder
        System.out.print("Preorder Traversal: ");
        printPreOrder(root);
        System.out.println();

        // Get preorder list
        N_Ary_TreePostorderTraversal obj =
                new N_Ary_TreePostorderTraversal();

        System.out.println("Preorder List: " + obj.postorder(root));
    }
}
