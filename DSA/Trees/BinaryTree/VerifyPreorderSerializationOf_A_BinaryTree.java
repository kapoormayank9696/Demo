// Verify Preorder Serialization of a Binary Tree Algorithm Implementation In Java
public class VerifyPreorderSerializationOf_A_BinaryTree {
    
    // Solution class
    public static class Solution {

        // Function to check is Valid Serialization
        public boolean isValidSerialization(String preorder) {
            String[] nodes = preorder.split(",");
            int slots = 1;

            for(String node : nodes) {
                if(slots <= 0) return false;
                if(node.equals("#")) slots --;
                else slots++;
            }
            return slots == 0;
        }
    }

    // Main function
    public static void main(String[] args) {
        Solution sol = new Solution();
        String preorder = "9,3,4,#,#,1,#,#,2,#,6,#,#";
        System.out.println("Preorder Serialization: " + preorder);

        if (sol.isValidSerialization(preorder)) {
            System.out.println("Valid Serialization: true");
        }
        else {
            System.out.println("Valid Serialization: false");
        }
    }
}
