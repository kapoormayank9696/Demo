// Check if All A's Appears Before All B's Algorithm IMplementation IN Java
public class Check_If_All_A_AppearsBeforeAll_B {

    // Solution Class
    public static class Solution {
        
        // Function to check String All A's Appears Before All B's
        public boolean checkString(String s) {
            return !s.contains("ba");
        }
    }

    // Main function
    public static void main(String[] args) {
        String s = "aaabbb";

        System.out.println("Print a string: "+s);
        Solution solution = new Solution();
         if (solution.checkString(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
