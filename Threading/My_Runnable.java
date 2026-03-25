// Runnable Interface Implementation In Java
class Demo implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread using Runnable: " + Thread.currentThread().getName());
    }
}

public class My_Runnable {
    // Main function
    public static void main(String[] args) {
        // Create Object of class Demo
        Demo d1=new Demo();
        Thread t1=new Thread(d1);
        t1.start();
    }
}
