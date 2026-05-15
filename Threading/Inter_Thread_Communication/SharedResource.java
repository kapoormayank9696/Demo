// SharedResource class for inter-thread communication example

@SuppressWarnings("CallToPrintStackTrace")
public class SharedResource {
    // Data Member
    private int data;
    private boolean isProduced = false;

    // Synchronized method to produce data
    
    // only one thread can enter method at a time
    // object lock acquired
    public synchronized void produce(int value){
        while(isProduced){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = value;
        System.out.println("Produced: " + data);
        isProduced = true;
        notify();
    }

    // Synchronized method to consume data
    public synchronized void consume(){
        while(!isProduced){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + data);
        isProduced = false;
        notify();
    }
}
