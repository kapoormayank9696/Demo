// LeetCode Problem 204: Count Primes
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution204 {
    // Function to count prime numbers
    public static int isPrime(int num) {
        if(num < 2) return 0;
        boolean[] isPrime = new boolean[num + 1];
        for(int i=2;i<=num;i++) {
            isPrime[i]=true;
        }
        for(int i=2;i*i<=num;i++) {
            if(isPrime[i]) {
                for(int j=i*i;j<=num;j+=i) {
                    isPrime[j]=false;
                }
            }
        }
        int count=0;
        for(int i=2;i<=num;i++) {
            if(isPrime[i]) {
                count++;
            }
        }
        return count;
    }
    // Main function
    public static void main(String[] args) throws Exception {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter the number n: ");
            int n = Integer.parseInt(br.readLine());
            System.out.println("Number of prime numbers less than or equal to " + n + " is: " + isPrime(n));
        }
    }
}
