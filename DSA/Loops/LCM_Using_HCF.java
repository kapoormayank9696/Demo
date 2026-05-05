// LCM using HCF Algorithm Implementation In Java
import java.io.*;
public class LCM_Using_HCF {
    // Function to find the lcm by using the hcf
    // Main function
    public static void main(String[] args) {
        try(BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Input 1st number for LCM: ");
            int n=Integer.parseInt(reader.readLine());
            System.out.print("Input 2nd number for LCM: ");
            int m=Integer.parseInt(reader.readLine());
            int result=lcm(n,m);
            System.out.println("The LCM of "+" and "+" is : "+result);
        }
    }
}
