// Number of Recent Calls Algorithm Implementation In Java
import java.util.LinkedList;
import java.util.Queue;

public class Number_OfRecentCalls {
    
    // Class Of Recent counter
    public static class RecentCounter {
        Queue<Integer> queue;
        
        // Parametrized Constructor
        public RecentCounter() {
            queue = new LinkedList<>();
        }
        
        // Ping Operation
        public int ping(int t) {
            queue.add(t);
            while(!queue.isEmpty() && queue.peek() < t - 3000) {
                queue.poll();
            }
            return queue.size();
        }

        // Display Operation
        public void display() {
             System.out.println("Recent timestamps: " + queue);
        }
    }

    // Main function
    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();

        System.out.println(recentCounter.ping(1));
        System.out.println(recentCounter.ping(100));
        System.out.println(recentCounter.ping(3001));
        System.out.println(recentCounter.ping(3002));

        recentCounter.display();
    }
}
