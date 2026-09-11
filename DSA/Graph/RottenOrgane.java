// Rotten Oranges Algorithm Implement In Java

import java.util.LinkedList;
import java.util.Queue;

public class RottenOrgane {

    @SuppressWarnings("SizeReplaceableByIsEmpty")
    // Graph Class
    public static class Graph {

        // Orange Rotting Function
        public static int orangesRotting(int[][] grid) {
            int rows = grid.length;
            int cols = grid[0].length;
            int ans = 0;

            boolean[][] visited = new boolean[rows][cols];
            Queue<int[]> queue = new LinkedList<>();

            // Push all sources in the queue
            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {
                    if(grid[i][j] == 2) {
                        queue.add(new int[]{i, j, 0});
                        visited[i][j] = true;
                    }
                }
            }

            while(queue.size() > 0) {
                int i = queue.peek()[0];
                int j = queue.peek()[1];
                int time = queue.peek()[2];
                queue.remove();

                ans = Math.max(ans, time);

                if(i-1 >= 0 && !visited[i-1][j] && grid[i-1][j] == 1) {
                    queue.add(new int[]{i-1, j, time+1});
                    visited[i-1][j] = true;
                }

                if(i+1 < rows && !visited[i+1][j] && grid[i+1][j] == 1) {
                    queue.add(new int[]{i+1, j, time+1});
                    visited[i+1][j] = true;
                }

                if(j-1 >= 0 && !visited[i][j-1] && grid[i][j-1] == 1) {
                    queue.add(new int[]{i, j-1, time+1});
                    visited[i][j-1] = true;
                }

                if(j+1 < cols && !visited[i][j+1] && grid[i][j+1] == 1) {
                    queue.add(new int[]{i, j+1, time+1});
                    visited[i][j+1] = true;
                }
            }
            
            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {
                    if(grid[i][j] == 1 && !visited[i][j]) {
                        return -1;
                    }
                }
            }

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

        // Create a graph object and call the orangesRotting function
        int result = Graph.orangesRotting(grid);

        System.out.println("Minimum minutes: " + result+" minutes");
    }    
}
