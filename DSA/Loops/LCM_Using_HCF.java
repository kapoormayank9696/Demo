// LCM using HCF Algorithm Implementation In Java
import java.io.*;
public class LCM_Using_HCF {
    // Function to find the lcm by using the hcf
    public static int lcm(int a,int b) {
        int lcm,hcf=0;
        int k=(a>b)?a:b;
        for(int i=1;i<=k;i++) {
            if(a%i==0 && b%i==0) {
                hcf=i;
            }
        }
        lcm=(a*b)/hcf;
        return lcm;
    }

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Input 1st number for LCM: ");
            int n=Integer.parseInt(reader.readLine());
            System.out.print("Input 2nd number for LCM: ");
            int m=Integer.parseInt(reader.readLine());
            int result=lcm(n,m);
            System.out.println("The LCM of "+n+" and "+m+" is : "+result);
        }
    }
}
