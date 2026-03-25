// Multi Thread Implementation In Java
// Class which inheritance the thread class and override
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Child thread: " + Thread.currentThread().getName());
    }
}

public class Multi_Thread {
    // Main function
    public static void main(String[] args) {
        System.out.println("Main started");
        // Create Object Of Class MyThread
        MyThread t1=new MyThread();
        // start() Operation
        t1.start(); // Creates new thread
        MyThread t2=new MyThread();
        t2.start();
        System.out.println("Main ended");
    }
}
