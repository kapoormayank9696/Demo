import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        while(true)
        { 
            System.out.print("Enter number : ");
            Scanner x = new Scanner(System.in);
            if(!x.hasNextDouble())
            {
                break;
            }
            double n = x.nextDouble();
            System.out.print("Enter your operator (+,-,*,/,%,=) = ");
            char sc = x.next().charAt(0);
            System.out.print("Enter number : ");
            double n1 = x.nextDouble();
            double result = 0;
            if(sc== '+')
            {
                result = n + n1;
            }
            else if(sc == '-')
            {
                result = n - n1;
            }
            else if(sc== '*')
            {
                result = n * n1;
            }
            else if(sc == '/')
            {
                result = n / n1;
            }
            else if( sc == '%')
            {
                result = n % n1;
            }
            double n2;
            n2 = result; 
            System.out.println("Result of numbers : "+result);
        }
    }
}
}
