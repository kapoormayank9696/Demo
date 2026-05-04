// Highest Common Factor (HCF) or Greatest Common Divisor (GCD) of two numbers
import java.io.*;
public class HCF {
    // Function to find the HCF from two numbers
    public static int hcf(int num,int num1) {
        int hcf=1;
        int k=(num<num1)?num:num1;
        for(int i=1;i<=k;i++) {
            if(num % i == 0 && num1 % i == 0) {
                hcf=i;
            }
        }
        return hcf;
    }

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Input 1st number for HCF:");
            int num=Integer.parseInt(reader.readLine());
            System.out.print("Input 2nd number for HCF:");
            int num1=Integer.parseInt(reader.readLine());
            int result = hcf(num,num1);
            System.out.println("The HCF of "+num+" and "+num1+" is: "+result);
        }
    }
}
