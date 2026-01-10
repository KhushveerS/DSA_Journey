import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NQUEEN2 {

    public int totalNQueens(int n) {
        return solveNQueensCount(n);
    }

    public static int solveNQueensCount(int n) {
        char[][] board = new char[n][n];

        // Initialize the board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        return backtrackCount(board, 0, n);
    }

    public static int backtrackCount(char[][] board, int row, int n) {
        // BASE CASE: if we've placed queens in all rows
        if (row == n) {
            return 1; // Found one valid solution
        }

        int count = 0;
        for (int col = 0; col < n; col++) {
            if (isValid(board, row, col, n)) {
                // Place queen
                board[row][col] = 'Q';

                // Count solutions from this placement
                count += backtrackCount(board, row + 1, n);

                // Remove queen (backtrack)
                board[row][col] = '.';
            }
        }
        return count;
    }

    // Your isValid method remains the same
    public static boolean isValid(char[][] board, int row, int col, int n) {
        // check for column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // Check upper left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // Check upper right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
