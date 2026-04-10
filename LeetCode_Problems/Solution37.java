// LeetCode Problem 37: Sudoku Solver
public class Solution37 {
    // Function to check if it's safe to place a number in the given cell
    public static boolean isSafe(char[][] board,int row,int col,char num) {
        for(int i=0;i<9;i++) {
            if(board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }
        int boxRowStart=row - row%3;
        int boxColStart=col - col%3;
        for(int i=boxRowStart;i<boxRowStart+3;i++){
            for(int j=boxColStart;j<boxColStart+3;j++) {
                if(board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    // Function to solve the Sudoku board using backtracking
    public static boolean solveSudoku(char[][] board) {
        for(int row=0;row<9;row++) {
            for(int col=0;col<9;col++) {
                if(board[row][col] == '.') {
                    for(char i='1';i<='9';i++) {
                        if(isSafe(board,row,col,i)) {
                            board[row][col]=i;
                            if(solveSudoku(board)) {
                                return true;
                            }
                            board[row][col]='.';
                        }
                    }
                return false;
                }
            }
        }
        return true;
    }

    // Function to print the Sudoku board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
                if ((j + 1) % 3 == 0 && j < 8) System.out.print("| ");
            }
            System.out.println();
            if ((i + 1) % 3 == 0 && i < 8) System.out.println("- - - - - - - - - - -");
        }
    }

    // Main function
    public static void main(String[] args) {
        char[][] board= {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println("Original board:");
        printBoard(board);
        if(solveSudoku(board)) {
            System.out.println("\nSolved Sudoku:");
            printBoard(board);
        } else {
            System.out.println("\nNo solution exists.");
        }
    }
}