// Single Thread Pool Implementation In Java

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThread {
    public static void main(String[] args) {
        System.out.println("===== Single Thread Executor =====");
        ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();
        for(int i=1;i<=5;i++) {
            int taskNumber = i;

            singleThreadPool.execute(() -> {
                System.out.println(
                        "Single Thread Pool Task "
                        + taskNumber
                        + " executed by "
                        + Thread.currentThread().getName()
                );
            });
        }
        System.out.print("\n");
        
        // Shutdown the single thread pool after use
        singleThreadPool.shutdown();
    }
}
