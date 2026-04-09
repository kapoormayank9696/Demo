// Simple Sudoku Solver Using Backtracking Algorithm Implementation In Java
public class SimpleSudoku {
    // Function to check if it's safe to place a number in the given cell
    public static boolean isSafe(int[][] board, int row, int col, int num) {
        // Check the row and column for the same number
        for (int i = 0; i < 3; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }
        return true;  // It's safe to place the number
    }

    // Function to solve the Sudoku board using backtracking
    public static boolean solveSudoku(int[][] board) {
        // Try to fill empty cells
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == 0) {  // If the cell is empty
                    for (int num = 1; num <= 3; num++) {  // Try numbers 1-3
                        if (isSafe(board, row, col, num)) {
                            board[row][col] = num;  // Place the number
                            if (solveSudoku(board)) {
                                return true;  // If the solution works, return true
                            }
                            board[row][col] = 0;  // Backtrack if no solution
                        }
                    }
                    return false;  // If no valid number is found, backtrack
                }
            }
        }
        return true;  // Puzzle is solved
    }

    // Function to print the Sudoku board
    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");  // Print each number
            }
            System.out.println();
        }
    }

    // Main function
    public static void main(String[] args) {
        int[][] board = {
            {1, 0, 0},
            {0, 0, 3},
            {0, 2, 0}
        };
        // Display original board
        System.out.println("Display Original board: ");
        printBoard(board);
        // Solve the Sudoku puzzle
        if (solveSudoku(board)) {
            System.out.println("\nSolved 3x3 Sudoku:");
            printBoard(board);  // Print solved board
        } else {
            System.out.println("\nNo solution exists.");
        }
    }
}