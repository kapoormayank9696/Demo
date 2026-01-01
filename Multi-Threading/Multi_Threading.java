// Java To Demonstrate The Multi Threading
public class Multi_Threading {
    public static void main(String[] args) {
        Task1 t1=new Task1();
        Task2 t2=new Task2();
        t1.start();
        t2.start();
    }
}
