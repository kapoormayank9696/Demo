
//Child Class of Species Class

public class Human extends Species{
    int graduationyear;
    int marks;
    public Human(String name, int age,String gender ,int graduationyear,int marks)
    {
        super(name,age,gender);
        this.graduationyear = graduationyear;
        this.marks = marks;
    }
    @Override
    public void details()
    {
        System.out.println("Name of human is : "+this.name);
        System.out.println("Age of human is : "+this.age);
        System.out.println("Gender of human is : "+this.gender);
        System.out.println("GraduationYear of human is : "+this.graduationyear);
        System.out.println("Marks of human is : "+this.marks);
    }
}
