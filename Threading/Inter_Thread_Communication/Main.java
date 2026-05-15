// Main class for inter-thread communication example

public class Main {
    public static void main(String[] args) {
        // Create Shared Resource Object
        SharedResource resource = new SharedResource();
        
        // Create Producer and Consumer Threads
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);
        
        // Start the Threads
        producer.start();
        consumer.start();
    }
}
