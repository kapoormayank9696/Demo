// LeetCode Problem 459 : Repeated Substring Pattern
public class Solution459 {

    // Function Of Repeated Substring Pattern
    public static boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        return str.substring(1,str.length()-1).contains(s);
    }

    // Main function
    public static void main(String[] args) {
        String s = "abab";
        System.out.println("Print a String: "+s);
        if(repeatedSubstringPattern(s)) {
            System.out.println("Repeated Substring Pattern: true");
        } else {
            System.out.println("Repeated Substring Pattern: false");
        }
    }
}
