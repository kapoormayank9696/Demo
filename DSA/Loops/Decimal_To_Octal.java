// Decimal To Octal Algorithm Implementation In Java
import java.io.*;
public class Decimal_To_Octal {
    // Function to perform the decimal to octal
    public static void decimalToOctal(int n) {
        int sum=0,remainder,place=1;
        while (n > 0) {
            remainder=n%8;
            sum=sum+remainder*place;
            place=place*10;
            n=n/8;
        }
        System.out.println(sum);
    }

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter a number to convert : ");
            int n=Integer.parseInt(reader.readLine());
            System.out.print("The Octal of "+n+" is ");
            decimalToOctal(n);
        }
    }
}

