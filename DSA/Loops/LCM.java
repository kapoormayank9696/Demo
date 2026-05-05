// LCM ALgorithms Implementation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class LCM {
    // Function to find the lcm of two numbers
    public static int lcm(int a,int b) {
        int lcm;
        int k=(a>b)?a:b;
        for(int i=k;;i+=k) {
            if(i%a == 0 && i%b == 0) {
                lcm=i;
                break;
            }
        }
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


