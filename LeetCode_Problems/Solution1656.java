// LeetCode Problem : Design an Ordered Stream
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution1656 {

    // Ordered Stream Class
    public static class OrderedStream {
        // Data Members
        String[] arr;
        int ptr = 1;
        
        // Parameterized Constructor
        public OrderedStream(int n) {
            arr = new String[n+1];
        }
    
        // Insert Operation
        public List<String> insert(int idKey, String value) {
            arr[idKey] = value;
            List<String> list = new ArrayList<>();
            while (ptr < arr.length && arr[ptr] != null) {
                list.add(arr[ptr]);
                ptr++;
            }
            return list;
        }

        // Display
        public void display() {
            for(String num:arr) {
                System.out.print(num+"-->");
            }
        }
    }

    // Main function
    @SuppressWarnings ("ConvertToTryWithResources")
    public static void main(String[] args) {
        int n = 5;
        OrderedStream orderedStream = new OrderedStream(n);

        System.out.println("Enter the elments to insert into Ordered Stream: ");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++) {
            int idKey = sc.nextInt();
            String value = sc.next();
            orderedStream.insert(idKey, value);
        }

        System.out.print("Display the Ordered Stream: ");
        orderedStream.display();

        sc.close();
    }
}
