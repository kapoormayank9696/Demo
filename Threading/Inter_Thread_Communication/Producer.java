// Producer class for inter-thread communication example

class Producer extends Thread{
    
    // Shared Resource Object
    SharedResource resource;
    // Parameterized Constructor
    public Producer(SharedResource resource){
        this.resource = resource;
    }

    @SuppressWarnings("CallToPrintStackTrace")
    @Override
    public void run() {
        for(int i=0; i<5; i++){
            resource.produce(i);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
