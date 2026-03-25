// Lamba Threading Implementation In Java
// It is cleaner and modern world technology
public class LambdaThreading {
    // Main Function
    public static void main(String[] args) {
        // -> is called a Lambda Operator && use for write lambda expressions(short way of writing functions)
        Thread t1=new Thread(() -> {
            System.out.println("Lambda Thread1: " + Thread.currentThread().getName());
        });
        // {} Method body, () No parameter
        Thread t2 = new Thread(() -> {
            System.out.println("Lambda Thread2: " + Thread.currentThread().getName());
        });
        t1.start();
        t2.start();
    }
}
