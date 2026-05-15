// Deadlock Prevention Thread example Implementation In Java
class Resource {
    // Data Member
    String name;

    // Parameterized Constructor
    public Resource(String name) {
        this.name=name;
    }
}

public class DeadlockPrevention {
// Main function
@SuppressWarnings({"CallToPrintStackTrace", "static-access"})
    public static void main(String[] args) {
        // Create Resources Objects of the Resource class
        Resource r1 = new Resource("Resource 1");
        Resource r2 = new Resource("Resource 2");

        // Create Threads
        // Thread 1 locks r1 then tries r2
        Thread t1 = new Thread(() ->  {

            // Locking r1
            synchronized (r1) {
                System.out.println("Thread 1 locked " + r1.name);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                // Trying to lock r2
                synchronized (r2) {
                    System.out.println("Thread 1 acquired lock on " + r2.name);
                }
            }
        });

        // Thread 2 locks r2 then tries r1
        Thread t2 = new Thread(() ->  {

            // Locking r2
            synchronized (r1) {
                System.out.println("Thread 1 locked " + r1.name);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                // Trying to lock r1
                synchronized (r2) {
                    System.out.println("Thread 2 acquired lock on " + r2.name);
                }
            }
        });

        // Running the threads
        t1.start();
        t2.start();
    }
}
