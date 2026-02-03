// HashSet Algorithm Implementation In Java

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class Hash_Set{

    // Main function
    @SuppressWarnings("rawtypes")
    public static void main(String[] args){
        HashSet<Integer> set=new HashSet<>();
        @SuppressWarnings("unused")
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter element: ");
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            set.add(value);
        }

        // Size of set
        System.out.println("Size of set is: "+set.size());
        
        // Print all set data
        System.out.println("Print all set elements: "+set);

        // Check set contains this value or not
        System.out.print("Enter value for checking: ");
        int value=sc.nextInt();
        if(set.contains(value)){
            System.out.println("Set contains :"+value);
        }

        // Remove the value from set
        System.out.print("Enter remove: ");
        int k=sc.nextInt();
        if(set.remove(k)){
            System.out.println("Successfully value "+k+" from hashset...");
        }
        
        // Print all values of set again
        System.out.println("After remove the value from set: "+set);

        // Iterator
        Iterator it =set.iterator();

        // hasNext check set has a next value (true or false)
        while(it.hasNext()){
            // next() carry the next value of set
            System.out.print(it.next()+" ");
        }
        sc.close();
    }
}

