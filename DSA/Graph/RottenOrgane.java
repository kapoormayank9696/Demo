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

            Queue<int[]> queue = new LinkedList<>();
            boolean[][] visited = new boolean[rows][cols];

            queue.add(new int[]{0, 0}); // Add the initial rotten orange position
            visited[0][0] = true;

            while(queue.size() > 0) {
                int u =queue.poll()[0];
                for(int neighbor: grid[u]) {
                    if(!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.add(new int[]{neighbor});
                    }
                }
            }
            return -1;
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
        int result = g.orangesRotting(grid);

        System.out.println("Minimum minutes: " + result);
    }    
}
