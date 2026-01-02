// Java program to demonstrate Function Overriding
public class Overriding {
    
    // Parent class
    public static class Parent{
        String name; // Data Members
        String gender;
        // Constructor
        public Parent(String name,String gender){
            this.name=name;
            this.gender=gender;
        }
        // Function Of Parent class
        public void detail(){
            System.out.println("Parent Name: "+this.name);
            System.out.println("Parent Gender: "+this.gender);
            System.out.println();
        }
    }
    // Child class
    public static class Child extends Parent{
        int age;
        // Constructor
        public Child(String name,String gender,int age){
            super(name,gender);
            this.age=age;
        }
        // Override The Parent Class Function of Method
        @Override
        public void detail(){
            System.out.println("Child Name: "+this.name);
            System.out.println("Child Gender: "+this.gender);
            System.out.println("Child Age: "+this.age);
            System.out.println();
        }
    }

    // Main function
    public static void main(String[] args) {

        // Parent Class Details Print
        System.out.println("\nParent Information: ");
        Parent p1=new Parent("Mayank", "Male");
        p1.detail();

        // Child Class Details Print
        System.out.println("Child Information: ");
        Child c1=new Child("Dev", "Male", 19);
        c1.detail();
        
        // Overriding 
        System.out.println("Overriding: ");
        Parent user=new Child("Roy", "Male", 20);
        user.detail();
    }
}
