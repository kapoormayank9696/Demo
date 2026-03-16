// Instance Operator Implementation In Java

import java.util.ArrayList;
import java.util.Scanner;

class Student {}
class Rockstar {}
class Hacker {}

public class InstanceOperator {
    // Function to count the instances of each type
    static String count(ArrayList<Object> mylist){
      int a = 0,b = 0,c = 0;
      for(int i = 0; i < mylist.size(); i++){
         Object element=mylist.get(i);
         if(element instanceof Student)
            a++;
         if(element instanceof Rockstar)
            b++;
         if(element instanceof Hacker)
            c++;
      }
      String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
      return ret;
   }

   // Main function
   public static void main(String []args){
      ArrayList<Object> mylist = new ArrayList<>();
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number of terms: ");
      int t = sc.nextInt();
      // Store the string values in arraylist in which type is objective
      System.out.print("Enter a string: ");
      for(int i=0; i<t; i++){
         String s=sc.next();
         if(s.equals("Student"))mylist.add(new Student());
         if(s.equals("Rockstar"))mylist.add(new Rockstar());
         if(s.equals("Hacker"))mylist.add(new Hacker());
      }
      System.out.println(count(mylist));
   }
}

