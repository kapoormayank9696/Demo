// LeetCode Problem 4092 : Binary Digit Score
public class Solution4092 {
    
    // Function of calculate score
    public static int calculateScore(int a, int b) {
        int s1 = 0;
        int s2 = 0;
        while(a > 0) {
            int r = a % 2;
             if (r == 1) {
                s1++;
            }
            a = a / 2;
        }

        while(b > 0) {
            int r = b % 2;
             if (r == 1) {
                s2++;
            }
            b = b / 2;
        }

        if(s1 >= s2) {
            return s1 * s2;
        }
        return s1 == 0 ? 0 : s2 / s1;
    }

    // Main function
    public static void main(String[] args) {
        int a = 14, b = 6;
        System.out.println("A is : "+a);
        System.out.println("B is : "+b);
        System.out.println("Calcuate Score is : "+calculateScore(a, b));
    }
}
