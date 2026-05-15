// Executor Service Thread Implementation In Java

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AllThreadPoolMethods {
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {

        // =========================================================
        // 1. Fixed Thread Pool
        // =========================================================

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
        
        // =========================================================
        // 2. Cached Thread Pool
        // =========================================================

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
            System.out.print("\n");
        }
        
        // Shutdown the cached thread pool after use
        cachedPool.shutdown();

        // =========================================================
        // 3. Single Thread Executor
        // =========================================================

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

        // =========================================================
        // 4. Submitted Thread Pool
        // =========================================================
        
        System.out.println("\n===== submit() Method =====");
        ExecutorService submitPool = Executors.newFixedThreadPool(2);

        Future<Integer> result = submitPool.submit(() -> {

            System.out.println(
                    "Callable task executed by "
                            + Thread.currentThread().getName()
            );

            return 10 + 20;
        });

        try {
            System.out.println("Result from Future: " + result.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shutdown the submit thread pool after use
        submitPool.shutdown();

        // =========================================================
        // 5. Scheduled Thread Pool
        // =========================================================
        
        System.out.println("===== Scheduled Thread Pool =====");
        ExecutorService scheduledPool = Executors.newScheduledThreadPool(3);
        for(int i=1;i<=5;i++) {
            int taskNumber = i;

            ((java.util.concurrent.ScheduledExecutorService) scheduledPool).schedule(() -> {
                System.out.println(
                        "Scheduled Pool Task "
                        + taskNumber
                        + " executed by "
                        + Thread.currentThread().getName()
                );
            }, 2, java.util.concurrent.TimeUnit.SECONDS); // Schedule with a delay of 2 seconds
        }
        System.out.print("\n");

        // Shutdown the scheduled thread pool after use
        scheduledPool.shutdown();
    }
}
