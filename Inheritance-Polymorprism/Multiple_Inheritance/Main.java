// Main class
public class Main {
    public static void main(String[] args) {
        // Multiple Inheritance Class object which is child class
        Dog myDog = new Dog();
        myDog.eat();   // from Animal interface
        myDog.play();  // from Pet interface
        myDog.bark();  // own method
    }
}
