// Java Demonstrate The Task 1
public class Task1 extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Task1: "+i);
        }
        System.out.println();
    }
}
