// Life Cycle Of Threading Impelmentation In Java
import java.util.concurrent.TimeUnit;

public class LifeCycle {
    // Main function
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {

        // Create object of the Thread class
        @SuppressWarnings("Convert2Lambda")
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++) {
                    System.out.println("Number: "+i);
                    try {
                        // Thread.sleep(1000); // 1 second delay
                        TimeUnit.SECONDS.sleep(1); // 1 second delay
                    }catch (InterruptedException e) {
                        System.out.println("Thread interrupted");
                        
                        // Restores interrupted status.
                        // Good practice after catching interruption.
                        Thread.currentThread().interrupt();
                        break;
                    }
                }
            }
        });

        t1.start();
        
        // Use join life cycle thread keyword
        try {
            t1.join(); // main waits for t1
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished");
    }
}
