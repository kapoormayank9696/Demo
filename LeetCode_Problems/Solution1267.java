// LeetCode Problem 1267: Count Servers that Communicate
public class Solution1267 {

    // Count Servers Function
    public int countServers(int[][] grid) {
        int count = 0;
        for (int[] grid1 : grid) {
            for (int j = 0; j < grid1.length; j++) {

                // Check if the server is present
                if (grid1[j] == 1) {
                    boolean found = false;

                    // Check row
                    for (int k = 0; k < grid1.length; k++) {
                        if (grid1[k] == 1) {
                            found = true;
                            break;
                        }
                    }

                    // Check column
                    for (int[] grid2 : grid) {
                        if (grid2[j] == 1) {
                            found = true;
                            break;
                        }
                    }
                    
                    if(found) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    // Main Function
    public static void main(String[] args) {
        int[][] grid = {
            {1, 0},
            {0, 1}
        };

        Solution1267 solution = new Solution1267();
        int result = solution.countServers(grid);
        System.out.println("Number of servers that communicate: " + result);
    }
}
