// LeetCode Problem 2424 : Longest Uploaded Prefix
public class Solution2424 {

    // Class Of LUPrefix
    public static class LUPrefix {

        // Public Specifier And Data Members
        public boolean[] uploaded;
        public int longestPrefix;
        
        // Parameterized Constructor
        public LUPrefix(int n) {
            uploaded = new boolean[n + 1];
            longestPrefix = 0;
        }
    
        // Insert Elements
        public void upload(int video) {
            uploaded[video] = true;
        }
    
        // Return total number of elements
        public int longest() {
            while (longestPrefix + 1 < uploaded.length && uploaded[longestPrefix + 1]) {
                longestPrefix++;
            }
            return longestPrefix;
        }

        // Display
        public void display() {
            for(int i=0;i<uploaded.length;i++) {
                if(uploaded[i]) {
                    System.out.print(i+" ");
                }
            }
        }
    }

    // Main function
    public static void main(String[] args) {
        LUPrefix lUPrefix = new LUPrefix(3);
        lUPrefix.upload(1);
        lUPrefix.upload(2);
        lUPrefix.upload(3);

        System.out.println("Total number of elements into uploaded array: "+lUPrefix.longest());
        
        System.out.print("Print LUPrefix: ");
        lUPrefix.display();
    }
}
