// Class implementing both interfaces
class Dog implements Animal, Pet {
    @Override
    public void eat() {
        System.out.println("Dog eats food");
    }

    @Override
    public void play() {
        System.out.println("Dog plays with owner");
    }

    // Additional method
    void bark() {
        System.out.println("Dog barks");
    }
}
