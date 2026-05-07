// Decimal to Hexa-Decimal Algorithm Implementation In Java
import java.io.*;
public class Decimal_To_HexaDecimal {
    // Function to Convert a Decimal To Hexa Decimal
    public static void decimalToHexa(int n) {
        String result="";
        if(n == 0) {
            System.out.println("The equivalent Hexadecimal Number : 0");
            return;
        }
        
        char[] hexaDecimal= {
            '0','1','2','3',
            '4','5','6','7',
            '8','9','A','B',
            'C','D','E','F'
        };

        while(n != 0) {
            int remainder=n%16;
            result=hexaDecimal[remainder]+result;
            n=n/16;
        }
        System.out.println("The equivalent Hexadecimal Number : "+result);
    }

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Input  any Decimal number: ");
            int n=Integer.parseInt(reader.readLine());
            decimalToHexa(n);
        }
    }
}

