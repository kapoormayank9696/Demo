// Priority Thread Implementation In Java
public class PriorityExample {
    // Main function
    public static void main(String[] args) {
        Thread t1=new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        Thread t2=new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        Thread t3=new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        // Thread priorities are set using setPriority() method
        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5 default
        t3.setPriority(Thread.MAX_PRIORITY); // 10
        // Set the names of all threads
        t1.setName("Low");
        t2.setName("Normal");
        t3.setName("High");
        // Run the threads
        t1.start();
        t2.start();
        t3.start();
    }
}
