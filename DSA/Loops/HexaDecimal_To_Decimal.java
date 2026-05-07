// HexaDecimal To Decimal Algorithm Implementation In Java
import java.io.*;
public class HexaDecimal_To_Decimal {
    
    // Function to Convert Hexa Decaiml To Decimal
    public static void hexaToDecimal(String hex) {
        int result = Integer.parseInt(hex, 16);
        System.out.println("The equivalent Decimal Number : "+result);
    }

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Input  any Hexa-Decimal number: ");
            String n=reader.readLine();
            hexaToDecimal(n);
        }
    }
}

