// HashMap Algorithm Implementation In Java 

import java.util.HashMap;
import java.util.Scanner;

public class HashMapping {

    // Main function
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            int key=sc.nextInt();
            String value=sc.nextLine();
            map.put(key, value);
        }
        
        // Print the hash map
        System.out.println("Print hash map data: "+map);

        sc.close();
    }
}
