// N-ary Tree Preorder Traversal Algorithm Implementation In Java
import java.util.ArrayList;
import java.util.List;

public class N_Ary_TreePreorderTraversal {

    // Node class for N-ary Tree
    public static class Node {
        int val;
        List<Node> children;

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

    // Preorder Method
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        result.add(root.val);

        for (Node child : root.children) {
            result.addAll(preorder(child));
        }

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
        N_Ary_TreePreorderTraversal obj =
                new N_Ary_TreePreorderTraversal();

        System.out.println("Preorder List: " + obj.preorder(root));
    }
}
