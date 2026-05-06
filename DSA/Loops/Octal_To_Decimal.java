// Octal To Decimal Algorithm Implementation In Java
import java.io.*;
public class Octal_To_Decimal {
    // Function to perform the octal to decimal
    public static void decimalToOctal(int n) {
        int sum=0,remainder,place=1;
        while (n != 0) {
            remainder=n%10;
            sum=sum+remainder*place;
            place=place*8;
            n=n/10;
        }
        System.out.println(sum);
    }

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter a number to convert : ");
            int n=Integer.parseInt(reader.readLine());
            System.out.print("The Decimal of "+n+" is ");
            decimalToOctal(n);
        }
    }
}

