// Fixed Thread Pool Implementation In Java

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThread {
    public static void main(String[] args) {
        System.out.println("===== Fixed Thread Pool =====");
        ExecutorService fixedPool = Executors.newFixedThreadPool(3);
        for(int i=1;i<=5;i++) {
            int taskNumber = i;

            fixedPool.execute(() -> {
                System.out.println(
                        "Fixed Pool Task "
                        + taskNumber
                        + " executed by "
                        + Thread.currentThread().getName()
                );
            });
            System.out.print("\n");
        }
        
        // Shutdown the fixed thread pool after use
        fixedPool.shutdown();
    }    
}
