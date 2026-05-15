// Scheduled Thread Pool Implementation In Java

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThread {
    public static void main(String[] args) {
        System.out.println("===== Scheduled Thread Pool =====");
        ScheduledExecutorService scheduledPool = Executors.newScheduledThreadPool(3);
        for(int i=1;i<=5;i++) {
            int taskNumber = i;

            scheduledPool.schedule(() -> {
                System.out.println(
                        "Scheduled Pool Task "
                        + taskNumber
                        + " executed by "
                        + Thread.currentThread().getName()
                );
            }, 2, TimeUnit.SECONDS); // Schedule with a delay of 2 seconds
        }
        System.out.print("\n");
        
        // Shutdown the scheduled thread pool after use
        scheduledPool.shutdown();
    }
}
