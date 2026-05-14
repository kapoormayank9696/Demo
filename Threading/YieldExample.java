// yield() keyword Threading Implementation In Java
public class YieldExample {
    @SuppressWarnings("static-access")
    // Main Function
    public static void main(String[] args) {
        // Create Threads
        Thread t1=new Thread(() -> {
            for(int i=1;i<=5;i++) {
                System.out.println(Thread.currentThread().getName() + " -> T1: " + i);
                // yield() should be invoked on current thread
                Thread.currentThread().yield();
            }
        });

        Thread t2=new Thread(() -> {
            for(int i=1;i<=5;i++) {
                System.out.println(Thread.currentThread().getName() + " -> T2: " + i);
                // yield() keyword use
                Thread.currentThread().yield();
            }
        });
        
        // Run t1 Thread ,t2 Thread
        t1.start();
        t2.start();
    }
}
