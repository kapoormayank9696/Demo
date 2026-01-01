// Java demonstrate with Exception Handling 
import java.util.Scanner;
public class Exception_Handling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number(Dividend): ");
        int dividend=sc.nextInt();
        System.out.print("Enter Divisor: ");
        int divisor=sc.nextInt();
        try {
            if(divisor==0){
                throw new ArithmeticException("Wrong Divisor");
            }
            else{
                int quotient=(dividend%divisor);
                System.out.println("Quotient: "+quotient);
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
