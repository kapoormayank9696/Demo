// Sudoku (9x9) Algorithm Implementation In Java
public class Sudoku {
    // Function to check if it's safe to place a number in the given cell
    public static boolean isSafe(int[][] board,int row,int col,int num) {
        for(int i=0;i<9;i++) {
            if(board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }
        int boxRowStart = row - row % 3;
        int boxColStart = col - col % 3;
        for(int i=boxRowStart;i<boxRowStart+3;i++) {
            for(int j=boxColStart;j<boxColStart+3;j++) {
                if(board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    // Function to solve the Sudoku board using backtracking
    public static boolean solveSudoku(int[][]board) {
        for(int row=0;row<9;row++) {
            for(int col=0;col<9;col++) {
                if(board[row][col] == 0) {
                    for(int i=1;i<=9;i++) {
                        if(isSafe(board,row,col,i)) {
                            board[row][col]=i;
                            if(solveSudoku(board)) {
                                return true;
                            }
                            board[row][col]=0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    // Function to print sudoku board
    public static void printBoard(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
                if ((j + 1) % 3 == 0 && j < 8) System.out.print("| ");  // Add vertical separator
            }
            System.out.println();
            if ((i + 1) % 3 == 0 && i < 8) System.out.println("- - - - - - - - - - -");  // Add horizontal separator
        }
    }

    // Main function
    public static void main(String[] args) {
        int[][] board= {
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0 ,5},
            {  0 ,  0 ,  0 ,  0 ,  8 ,  0 ,  0 ,  7 , 9 }
        };
        System.out.println("Original Sudoku Board:");
        printBoard(board);  // Print the original board
        if(solveSudoku(board)) {
            System.out.println("\nSolved Sudoku Board:");
            printBoard(board);
        } else {
            System.out.println("\nNo solution exists");
        }
    }
}
