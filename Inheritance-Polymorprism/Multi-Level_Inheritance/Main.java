// Main class
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        // Methods from all levels of inheritance
        myDog.eat();   // from Animal
        myDog.walk();  // from Mammal
        myDog.bark();  // from Dog
    }
}
