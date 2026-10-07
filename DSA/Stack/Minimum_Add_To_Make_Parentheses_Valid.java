// Minimum Add to Make Parentheses Valid Algorithm Implement In Java
public class Minimum_Add_To_Make_Parentheses_Valid {
    
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

    public static void main(String[] args) {
        String s = "())";
        System.out.println(minAddToMakeValid(s));
    }
}
