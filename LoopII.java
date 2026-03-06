// LoopII Algorithm Implementation In Java
import java.util.*;

class LoopII{

    // Main function
    public static void main(String []argh){
        @SuppressWarnings("unused")
        Scanner in = new Scanner(System.in);
        System.out.print("Enter nuber of times: ");
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            System.out.print("First value: ");
            int a = in.nextInt();
            System.out.print("Power : ");
            int b = in.nextInt();
            System.out.print("Number of terms: ");
            int n = in.nextInt();
            int sum=a;
            for(int j=0;j<n;j++) {
                sum=sum+(int)Math.pow(2,j)*b;
                System.out.print(sum+" ");
            }
            System.out.print("\n");
        }
        in.close();
    }
}