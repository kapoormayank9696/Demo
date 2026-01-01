
public class Runner{
    public static void main(String[] args) {
        
        //Inheritance

        Species human = new Species("Micahel", 57, "Male");
        human.details();

        System.out.println();

        Human human1 = new Human("Tyson",53,"Male",2025,95);
        human1.details();
        
        System.out.println();
        
        //Polymoriprism

        Species human2 = new Human("Kia",55,"Male",2025,99);
        human2.details();
    }
}
