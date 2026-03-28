// Synchronished Implementation In Java
class Counter {
    int count=0;
    public void increment() {
        count++; 
    }
}

public class Synchronished {
    @SuppressWarnings("CallToPrintStackTrace")
    // Main function
    public static void main(String[] args) {
        // Create object of the counter class
        Counter c=new Counter();
        // Create object of the thread class
        Thread t1=new Thread(() -> {
            for(int i=0;i<1000;i++) {
                c.increment();
            }
        });
        // Create object of the thread class
        Thread t2=new Thread(() -> {
            for(int i=0;i<1000;i++) {
                c.increment();
            }
        });
        // Run multi-threads
        t1.start();
        t2.start();
        // Use join() keyword
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final count: " + c.count);
    }
}

