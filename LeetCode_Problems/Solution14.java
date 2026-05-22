// LeetCode Problem 14: Longest Common Prefix
public class Solution14 {

    // Function to solve the problem of finding the longest common prefix among an array of strings
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        String prefix = strs[0];
        
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }

    // Main function
    public static void main(String[] args) {
        Solution14 solution = new Solution14();
        
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + solution.longestCommonPrefix(strs1)); // Output: "fl"
        
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Longest Common Prefix: " + solution.longestCommonPrefix(strs2)); // Output: ""
    }
}

