// Sum of Two Primes Algorithm Implementation In Java

import java.io.*;
public class Sum_Of_Two_Primes {
    // Function to check number is prime or not
    public static boolean isPrime(int temp) {

        if(temp < 2) {
            return false;
        }

        for(int i=2;i<=temp/2;i++) {
            if(temp%i ==0) {
                return false;
            }
        }

        return true;
    }

    // Function to find the primes sum
    public static void primes(int n) {

        boolean found=false;
        int temp1,temp2;

        for(int i=2;i<=n/2;i++) {
            temp1=i;
            temp2=n-i;
            if(isPrime(temp1) && isPrime(temp2)) {
                System.out.println(n+" = "+temp1+" + "+temp2);
                found=true;
            }
        }
        
        if (!found) {
            System.out.println("No combination of two prime numbers found.");
        }
    }

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Input a positive integer: ");
            int n=Integer.parseInt(reader.readLine());
            primes(n);
        }
    }
}
