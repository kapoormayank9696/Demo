// Probal Prime Implementation In Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class ProbalPrime {
    // Main function
    
    public static void main(String[] args) throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));){
            System.out.print("Enter number: ");
            String n = bufferedReader.readLine();
            BigInteger bigNumber = new BigInteger(n);
            if (bigNumber.isProbablePrime(10)) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
            bufferedReader.close();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
