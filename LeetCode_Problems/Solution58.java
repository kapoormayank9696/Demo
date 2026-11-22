// LeetCode Problem 58 : Length of Last Word
public class Solution58 {
    
    // Length Of Last World
    public static int lengthOfLastWord(String s) {
        int length = 0;
        for(int i=s.length()-1;i >= 0; i--) {
            if(s.charAt(i) != ' ') {
                length++;
            } else {
                if(length > 0) return length;
            }
        }
        return length;
    }

    // Main function
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println("String s: "+s);

        System.out.println("Length Of Last World From A String: "+lengthOfLastWord(s));
    }    
}
