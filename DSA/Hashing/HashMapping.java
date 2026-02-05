// HashMap Algorithm Implementation In Java 

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class HashMapping {

    // Main function
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India",190);
        map.put("China",180);
        map.put("Russia",100);
        map.put("America",90);
        map.put("Irak",72);
        map.put("Colombia",80);
        map.put("Iran",79);
        map.put("Spain",77);

        // Print the hash map
        System.out.println("\nPrint hash map data: "+map);

        // Search operation
        if (map.containsKey("china")) {
            System.out.println("Yes,This key exist in the hash map.....");
        }else{
            System.out.println("No,This key doesn't exist in the hash map!!!");
        }

        // Print the value which exist in the hash map
        System.out.println("Value of exist key in the hash map: "+map.get("India")); // Key exists
        System.out.println("Value of doesn't exist key in the hash map: "+map.get("k")); // key doesn't exists

        // Iteration Operation in hash map (Entry Set Method)
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.print(e.getKey()+"="+ e.getValue()+" ");
        }
        System.out.print("\n");

        // Method to print all keys with his values(Key Set Method)
        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.print(key+"="+map.get(key)+" ");
        }

        // Remove the key-value from the hash map
        map.remove("China");
        System.out.println("\nPrint hash map: "+map);
    }
}

