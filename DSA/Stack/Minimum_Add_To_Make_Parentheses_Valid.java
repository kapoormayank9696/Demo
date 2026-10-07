// Minimum Add to Make Parentheses Valid Algorithm Implement In Java
public class Minimum_Add_To_Make_Parentheses_Valid {

    // Function to calculate the minimum number of parentheses to add
    public static int minAddToMakeValid(String s) {
        int open = 0;
        int add = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            } else {
                if (open > 0) {
                    open--;
                } else {
                    add++;
                }
            }
        }
        
        return add + open;
    }

    // Main function
    public static void main(String[] args) {
        String s = "(((";
        System.out.println("Minimum parentheses to add: " + minAddToMakeValid(s));
    }
}
