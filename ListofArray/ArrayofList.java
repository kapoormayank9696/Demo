// Array List Algorithm Implementation In Java 
import java.util.ArrayList;
import java.util.Collections;

public class ArrayofList {

    // Main function
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(5);
        num.add(25);
        num.add(12);
        num.add(20);
        num.add(89);
        num.add(4,35);
        num.add(53);
        num.add(9);
        System.out.println("Print all the elements : "+num);

        //Size of array of list 
        System.out.println("Size of array of list : "+num.size());

        //Set the value at giving index
        num.set(1,101);
        System.out.println("Print change the new elements in an array of list : "+num);

        //Remove an element from array of list
        num.remove(5);
        System.out.println("List of an array elements : "+num);

        //Get the value of array of list
        System.out.println("Value get from array of list : "+num.get(3));

        //Check array of list is an empty
        System.out.println("True or False : "+num.isEmpty());

        //Cut the wastes memory 
        num.trimToSize();
        System.out.println("Actual size of list of array : "+num.size());

        // Sort arraylist
        Collections.sort(num);
        System.out.println("Sorting arraylist: "+num);
    }
}
