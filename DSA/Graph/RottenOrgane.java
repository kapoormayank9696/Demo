// Rotten Oranges Algorithm Implement In Java

import java.util.LinkedList;
import java.util.Queue;

public class RottenOrgane {

    // Graph Class
    public static class Graph {

        // Orange Rotting Function
        public static int orangesRotting(int[][] grid) {
            if (grid == null || grid.length == 0 || grid[0].length == 0) {
                return 0;
            }

            int rows = grid.length;
            int cols = grid[0].length;

            Queue<int[]> queue = new LinkedList<>();
            int fresh = 0;

            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    if (grid[row][col] == 2) {
                        queue.add(new int[]{row, col});
                    } else if (grid[row][col] == 1) {
                        fresh++;
                    }
                }
            }

            int minutes = 0;
            int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

            while(queue.size() > 0) {

                int u =queue.poll()[0];
                int v =queue.poll()[1];
                for(int neighbor: grid[u][v]) {
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
