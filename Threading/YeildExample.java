// yeild() keyword Algorithm Implementation In Java
public class YeildExample {
    // Main Function
    public static void main(String[] args) {
        Thread t1=new Thread(() -> {
            for(int i=1;i<=5;i++) {
                System.out.println(Thread.currentThread().getName() + " -> T1: " + i);
                // yield() keyword use
                Thread.yield();
            }
        });
        Thread t2=new Thread(() -> {
            for(int i=1;i<=5;i++) {
                System.out.println(Thread.currentThread().getName() + " -> T2: " + i);
            }
        });
        // Run t1 Thread ,t2 Thread
        t1.start();
        t2.start();
    }
}
