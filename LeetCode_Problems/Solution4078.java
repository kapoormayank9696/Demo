// LeetCode Problem 4078 : Three Fibonacci Sum    
public class Solution4078 {
    // Function to check 3 Fibonaaci Series Numbers Sum Is Equal To N Or Not
    public static boolean threeFibonacciSum(int n) {
        int a = 0,b=1, c=1;
        while(a+b+c <= n) {
            if(a+b+c == n) {
                return true;
            }
            int k = b+c;
            b = a;
            a = k;
            c = k;
        }
        return false;
    }

    // Main function
    public static void main(String[] args) {
        int n = 16;
        System.out.println("Check three Fibonacci sum: "+threeFibonacciSum(n));
    }
}
