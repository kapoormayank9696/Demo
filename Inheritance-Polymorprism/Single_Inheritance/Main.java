// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create an object of Dog
        Dog myDog = new Dog();

        // Call method from parent class
        myDog.eat();  // inherited from Animal

        // Call method from child class
        myDog.bark(); // own method
    }
}
