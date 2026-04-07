// Deadlock example Algorithm in Java
class Recource {
    // Empty class representing a resource
}

public class DeadLock {
    // Main function
    public static void main(String[] args) {
        Recource r1 = new Recource();
        Recource r2 = new Recource();
        Thread t1=new Thread(() ->  {
            synchronized (r1) {
                System.out.println("Thread 1 acquired lock on r1");
                synchronized (r2) {
                    System.out.println("Thread 1 acquired lock on r2");
                }
            }
        });
        Thread t2=new Thread(() ->  {
            synchronized (r2) {
                System.out.println("Thread 2 acquired lock on r2");
                synchronized (r1) {
                    System.out.println("Thread 2 acquired lock on r1");
                }
            }
        });
        t1.start();
        t2.start();
    }
}

