// Rotten Oranges Algorithm Implement In Java

import java.util.LinkedList;
import java.util.Queue;

public class RottenOrgane {

    // Graph Class
    public static class Graph {

        // Orange Rotting Function
        public static int orangesRotting(int[][] grid) {
            int rows = grid.length;
            int cols = grid[0].length;
            int ans = 0;

            Queue<int[]> queue = new LinkedList<>();

            // Push all sources in the queue

            return ans;
        }
    }

    // Main function
    public static void main(String[] args) {
        int[][] grid = {
            {2, 1, 1},
            {1, 1, 0},
            {0, 1, 1}
        };

        Graph g = new Graph();
        @SuppressWarnings("static-access")
        int result = g.orangesRotting(grid);

        System.out.println("Minimum minutes: " + result);
    }    
}
