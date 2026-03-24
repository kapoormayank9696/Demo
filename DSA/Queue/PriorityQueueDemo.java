// Prirotiy Queue Algorithm Implementation In Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

// Custom Class
class Student {
    // Default Access Modifier And Data Members
    String name;
    int marks;
    // Parameterized Constructor
    public Student(String name,int marks) {
        this.name=name;
        this.marks=marks;
    }
}

public class PriorityQueueDemo {
    // Main function
    public static void main(String[] args) throws Exception{
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) {
            // ---------------------------
            // 1. MIN HEAP (DEFAULT)
            // ---------------------------
            System.out.print("Enter number of elements for Min Heap: ");
            int n=Integer.parseInt(br.readLine());
            // Create Object Of Priority Queue Class && Integer DataType
            PriorityQueue<Integer> minHeap=new PriorityQueue<>();
            int values;
            System.out.print("Enter elements in min heap: ");
            for(int i=0;i<n;i++) {
                values=Integer.parseInt(br.readLine());
                minHeap.add(values);
            }
            System.out.print("Min Heap (ascending): ");
            // Check min heap is an empty or not
            while(!minHeap.isEmpty()) {
                // poll() keyword
                System.out.print(minHeap.poll() + " ");
            }System.out.print("\n");
            // ---------------------------
            // 2. MAX HEAP (DEFAULT)
            // ---------------------------
            System.out.print("Enter number of elements for Max Heap: ");
            int m=Integer.parseInt(br.readLine());
            // Create Object Of Priority Queue Class && Integer DataType but store value reverse order
            PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
            System.out.print("Enter elements in max heap: ");
            for(int i=0;i<m;i++) {
                values=Integer.parseInt(br.readLine());
                maxHeap.add(values);
            }
            System.out.print("Max Heap (descending): ");
            // Check max heap is an empty or not
            while(!maxHeap.isEmpty()) {
                System.out.print(maxHeap.poll() + " ");
            }
            System.out.print("\n");
            // ---------------------------
            // 3. CUSTOM OBJECT (Student)
            // ---------------------------
            System.out.println("\nCustom Object Example (Highest Marks First):");
            // Create Object Of Priority Queue Of Class Student class DataType Store
            PriorityQueue<Student> studentPQ=new PriorityQueue<>((a,b)-> b.marks - a.marks);
            studentPQ.add(new Student("Kia",85));
            studentPQ.add(new Student("Roy",99));
            studentPQ.add(new Student("Dev", 101));
            while (!studentPQ.isEmpty()) {
                Student s=studentPQ.poll();
                System.out.println(s.name+" - "+s.marks);
            }
        }
    }
}
