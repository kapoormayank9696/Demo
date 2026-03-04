//  4 4 4 4 4 4 4  
//  4 3 3 3 3 3 4   
//  4 3 2 2 2 3 4   
//  4 3 2 1 2 3 4   
//  4 3 2 2 2 3 4   
//  4 3 3 3 3 3 4   
//  4 4 4 4 4 4 4  
// Algorithm Implementation In Java

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class PatternPrint{

    // Main function
    public static void main(String[] args) throws Exception{
        @SuppressWarnings("unused")
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of terms: ");
        int n=Integer.parseInt(br.readLine());
        int size=2*n-1;
        System.out.println("Print the pattern");
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                int top=i;
                int left=j;
                int bottom=size-1-i;
                int right=size-1-j;
                int min=top;
                if(left < min) {
                    min=left;
                }
                if(right < min) {
                    min=right;
                }
                if(bottom < min) {
                    min=bottom;
                }
                System.out.print(n-min);
            }
            System.out.print("\n");
        }
        br.close();
    }
}


