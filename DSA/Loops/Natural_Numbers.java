// Natural Numbers Algorithm Implementation In Java

import java.io.*;
public class Natural_Numbers {

    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Input number of terms: ");
            int n=Integer.parseInt(reader.readLine());

            for(int i=1;i<=n;i++) {
                System.out.print(i+" ");
            }
        }
    }
}

