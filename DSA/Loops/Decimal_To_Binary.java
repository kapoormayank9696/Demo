// Decimal to Binary Algorithm Implementation In Java
import java.io.*;
public class Decimal_To_Binary {
    // Function to convert decimal to binary
    public static void decimalToBinary(int decimal) {
        int i = 0;
        int arr[] = new int[32];
        while (decimal != 0) {
            arr[i] = decimal % 2;
            decimal /= 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(arr[j]);
        }
    }
    
    // Main function
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter a decimal number: ");
            int decimal = Integer.parseInt(br.readLine());
            System.out.print("Binary value: ");
            decimalToBinary(decimal);
        }
    }
}
