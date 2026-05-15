// Cache Thread Pool Implementation In Java

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CacheThread {
    public static void main(String[] args) {
        System.out.println("===== Cached Thread Pool =====");
        ExecutorService cachedPool = Executors.newCachedThreadPool();
        for(int i=1;i<=5;i++) {
            int taskNumber = i;

            cachedPool.execute(() -> {
                System.out.println(
                        "Cached Pool Task "
                        + taskNumber
                        + " executed by "
                        + Thread.currentThread().getName()
                );
            });
        }
        System.out.print("\n");
        
        // Shutdown the cached thread pool after use
        cachedPool.shutdown();
    }    
}
