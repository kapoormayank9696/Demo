// sleep() keyword Algrothim Impelmentation In Java

public class LifeCycle {
    // Main function
    public static void main(String[] args) {
        // Create object of the thread class
        Thread t1=new Thread(() -> {
            for(int i=0;i<5;i++) {
                System.out.println("Number: "+i);
                try {
                    // Use sleep life cycle thread keyword
                    Thread.sleep(1000); // 1 second delay
                }catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
            }
        } );
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
