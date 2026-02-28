// Buffered Reader Implementation In Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferReader {
    // Main function
    public static void main(String[] args) throws IOException {
        @SuppressWarnings("unused")
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));        
        System.out.print("Enter number : ");
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i=1;i<=10;i++) {
            System.out.println(N+" x "+i+" = "+N*i);
        }
        bufferedReader.close();
    }
}

