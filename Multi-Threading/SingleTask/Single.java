// Java Demonstrate The Multi Threading By A Single Task
public class Single {
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static void task1(){
        for(int i=1;i<=5;i++){
            System.out.println("Task1: "+i);
        }
        System.out.println();
    }
    public static void task2(){
        for(int i=1;i<=5;i++){
            System.out.println("Task2: "+i);
        }
    }
}
