// A.P Series Algorithm Implementation In Java
import java.io.*;

public class A_P_Series {
    // Function to perform A.P Series
    public static void apSeries(int n,int m,int diff) {
        int sum=0,term=n;
        for(int i=n;i<=m;i++) {
            System.out.print(term+" ");
            sum=sum+term;
            term=term+diff;
        }
        System.out.println("\nSum of the series: "+sum);
    }

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Input the starting number of the A.P. series: ");
            int n=Integer.parseInt(reader.readLine());
            System.out.print("Input the number of items for the A.P. series: ");
            int m=Integer.parseInt(reader.readLine());
            System.out.print("Input the common difference of A.P. series: ");
            int diff=Integer.parseInt(reader.readLine());
            System.out.println("The A.P. series is: ");
            apSeries(n,m,diff);
        }
    }
}
