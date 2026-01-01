import java.util.Scanner;
public class Atm {
    String username;
    private int age;
    private long accno;
    private int pin;
    protected int balance;
    public Atm(String username,int age,long accno,int pin,int balance)
    {
        this.accno = accno;
        this.age = age;
        this.balance = balance;
        this.pin = pin;
        this.username = username;
    }
    
    //User wants to debit the money from his/her account
    public void debit(int amount)
    {
        this.balance = this.balance + amount;
        System.out.println("Succesfully Debit the money");
        System.out.println("Balance : "+this.balance);
    }
     
    //User want to withdrawl the money from her/his account
    public void withdrawl(int pin,int amount)
    {
        if(this.pin == pin)
        {
            if(this.balance >= amount)
            {
            this.balance = this.balance - amount;
            System.out.println("Succesfully Withdrawl the money");
            System.out.println("Balance : "+this.balance);
            }
            else
            {
                System.out.println("Insufficient money in your account");
            }
        }
        else{
            System.out.println("Wrong pin");
        }
    }

    //User only wants to check the balance
    public void bal(int pin)
    {
        System.out.println("Balance : "+this.balance);
    }

    //User wants to change the pin
    public void pinchange(int pin)
    {
        if(this.pin == pin)
        {
            int k = 0 ;
            System.out.print("Enter your new pin : ");
            Scanner sc = new Scanner(System.in);
            k = sc.nextInt();
            this.pin = k;
            this.pin = pin;
            System.out.println("Sucessfully change your pin");
        }
        else{
            System.out.println("Wrong pin enter");
        }
    }
}

