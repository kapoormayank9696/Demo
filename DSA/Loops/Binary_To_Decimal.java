// Binary To Decimal Algorithm Implementation In Java
import java.io.*;
public class Binary_To_Decimal {
    // Function to convert binary to decimal integer
    public static int binaryToDecimal(int binaryStr) {
        int decimal=0,i=0,remainder;
        while(binaryStr != 0) {
            remainder = binaryStr % 10;
            decimal += remainder * Math.pow(2, i);
            i++;
            binaryStr = binaryStr / 10;
        }
        return decimal;
    }

    // Main function
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter a binary number: ");
            int binaryStr = Integer.parseInt(br.readLine());
            int decimalValue = binaryToDecimal(binaryStr);
            System.out.println("Decimal value: " + decimalValue);
        }
    }
}
