// sleep() keyword Algrothim Impelmentation In Java

public class LifeCycle {
    // Main function
    public static void main(String[] args) {
        // Create object of the thread class
        Thread t1=new Thread(() -> {
            for(int i=0;i<5;i++) {
                System.out.println("Number: "+i);
                try {
                    Thread.sleep(1000); // 1 second delay
                }catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
            }
        } );
        System.out.println("Main thread finished");
        t1.start();
    }
}
