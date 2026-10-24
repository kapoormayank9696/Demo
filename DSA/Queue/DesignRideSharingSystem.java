// Design Ride Sharing System Algorithm Implementation In Java
import java.util.LinkedList;
import java.util.Queue;
public class DesignRideSharingSystem {
   
    // Ride sharing system class
    public static class RideSharingSystem {
        Queue<Integer> queueRider;
        Queue<Integer> queueDriver;
        
        // Parameterized Constructor
        public RideSharingSystem() {
            queueRider = new LinkedList<>();
            queueDriver = new LinkedList<>();
        }
    
        // Add Rider
        public void addRider(int riderId) {
            queueRider.add(riderId);
        }

        // Add Driver
        public void addDriver(int driverId) {
            queueDriver.add(driverId);
        }
    
        // Match Driver With Rider
        public int[] matchDriverWithRider() {
            if(queueRider.isEmpty() || queueDriver.isEmpty()) {
                return new int[]{-1,-1};
            }

            int rider = queueRider.poll();
            int driver = queueDriver.poll();

            return new int[]{driver,rider};
        }
    
        // Cancel Rider
        public void cancelRider(int riderId) {
            queueRider.remove(riderId);
        }

        // Display Riders and Drivers
        public void display() {
            System.out.println("Riders: " + queueRider);
            System.out.println("Drivers: " + queueDriver);
        }
    }
    
    // Main function
    public static void main(String[] args) {
        RideSharingSystem rideSharingSystem = new RideSharingSystem();
        rideSharingSystem.addRider(3);
        rideSharingSystem.addDriver(2);

        rideSharingSystem.addRider(1);
        rideSharingSystem.addDriver(5);

        System.out.println("Before Matching:");
        rideSharingSystem.display();

        int[] result = rideSharingSystem.matchDriverWithRider();

        System.out.println("\nMatched Driver: " + result[0]);
        System.out.println("Matched Rider: " + result[1]);

        System.out.println("\nAfter Matching:");
        rideSharingSystem.display();

        rideSharingSystem.cancelRider(1);

        System.out.println("\nAfter Cancelling Rider 1:");
        rideSharingSystem.display();
    }
}
