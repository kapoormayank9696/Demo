// Java program to demonstrate Function Overloading
public class Overloading {
    public static void main(String[] args) {
        int a=5,b=2;
        add(a,b);
        float x=34.5f,y=19.1f;
        add(x,y);
        double d=96.89f,d1=89.28f;
        add(d,d1);
        long l=80547568L,l1=98547848L;
        add(l,l1);
        char s='M',s1='a';
        add(s,s1);
        String str="Mayank Roy",str1=" Kapoor";
        add(str,str1);
    }
    // Function which are overload again by again
    // Function for integer
    public static void add(int a,int b){
        System.out.println("Sum of two integers: "+(a+b));
    }
    // Function for float
    public static void add(float a,float b){
        System.out.println("Sum of two floats: "+(a+b));
    }
    // Function for double
    public static void add(double a,double b){
        System.out.println("Sum of two double: "+(a+b));
    }
    // Function for long
    public static void add(long a,long b){
        System.out.println("Sum of two long: "+(a+b));
    }
    // Function for character
    public static void add(char a,char b){
        System.out.println("Sum of two charcter: "+a+b);
    }
    // Function for Strings
    public static void add(String a,String b){
        System.out.println("Sum of two strings: "+(a+b));
    }
}
