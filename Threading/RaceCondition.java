// Race Condition Example Implementation In Java
class Counter {
    int count = 0;
    // without synchronization, this method can lead to a race condition
    public void increment() {
        count++;
    }
}

public class RaceCondition {
    // Main function
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {

        // Create a Counter object
        Counter c = new Counter();
        // Create Threads
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // The final count may not be
        System.out.println("Final count: " + c.count);        
    }
}
