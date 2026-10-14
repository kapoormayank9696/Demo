// LeetCode Problem 116 : Populating Next Right Pointers in Each Node
public class Solution116 {

    // TreeNode class
    public static class Node {

        // Public Access Specifier
        public int val;
        public Node left;
        public Node right;
        public Node next;

        // Parameterized Constructor
        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
            this.next = null;
        }
    }
    
    // Solution Class
    public static class Solution {
        public int index = -1;

        // Insert Algorithm
        public Node insert(int[] nums) {
            index++;
            if(index >= nums.length || nums[index] == -1) {
                return null;
            }
            Node newNode = new Node(nums[index]);

            // Recursive Calls
            newNode.left = insert(nums);
            newNode.right = insert(nums);

            return newNode;
        }

        // Connect Algorithm
        public Node connect(Node root) {
            if(root == null) return root;

            if(root.left != null) {
                root.left.next = root.right;
            }
            if(root.right != null && root.next != null) {
                root.right.next = root.next.left;
            }

            connect(root.left);
            connect(root.right);
            return root;
        }

        // Display Algorithm
        public void printTreee(Node root) {
            if(root == null) return;
            System.out.print(root.val+" ");
            printTreee(root.left);
            printTreee(root.right);
        }

        // Print Next Pointer Binary Tree
        public void printNextPointers(Node root) {
            Node levelStart = root;
            
            while (levelStart != null) {
                Node current = levelStart;
                
                while (current != null) {
                    System.out.print(current.val + " -> ");
                    current = current.next;
                }
                System.out.println("NULL");
                levelStart = levelStart.left;
            }
        }
    }

    // Main function
    public static void main(String[] args) {
        int[] nums= {
            1,2,4,-1,-1,5,-1,-1,
            3,6,-1,-1,7,-1,-1
        };
        Solution solution = new Solution();
        Node root = solution.insert(nums);

        System.out.print("Print the Binary Tree: ");
        solution.printTreee(root);

        Node newRoot = solution.connect(root);
        System.out.println("\nNext Pointers:");
        solution.printNextPointers(newRoot);
    }
}
