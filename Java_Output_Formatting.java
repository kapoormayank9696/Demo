// Java Output Formatting Implementation In Java
// %-15s--->(s → string),(15 → width of 15 characters),(- → left-justified)
// %03d--->(d → integer),(3 → width of 3 digits),(0 → pad with leading zeros)
// %n--->newline (better than \n in Java)


import java.util.Scanner;
public class Java_Output_Formatting {
    // Main function
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
    }
}
