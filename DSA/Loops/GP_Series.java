// G.P. Series Algorithm Implementation In Java

import java.io.*;
public class GP_Series {

    // Function to perform G.P. Series
    public static void gpSeries(int n1,int n,int r) {
        System.out.println("The numbers for the G.P. series: ");

        double sum=0,result=n1;
        for(int i=1;i<=n;i++) {
            System.out.print(result+" ");
            sum=sum+result;
            result=result*r;
        }
        System.out.println("\nThe Sum of the G.P. series : "+sum);
    }

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("Input the first number of the G.P. series: ");
            int n1=Integer.parseInt(reader.readLine());

            System.out.print("Input the number of terms in the G.P. series: ");
            int n=Integer.parseInt(reader.readLine());

            System.out.print("Input the common ratio of G.P. series: ");
            int r=Integer.parseInt(reader.readLine());

            gpSeries(n1,n,r);
        }
    }
}
