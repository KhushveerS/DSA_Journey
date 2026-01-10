import java.util.*;
public class NQUEENS {
    public static void main(String[] args) {

    }
    public List<List<String>> solveNQueens(int n){

        List<List<String>> result=new ArrayList<>();
        char[][] board=new char[n][n];

        //Initalize the board with '.'
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='.';
            }
        }
        backtrack(result,board,0,n);
        return result;

    }
    public void backtrack(List<List<String>> result,char [][]board,int row,int n)
    {
        //BASE CASE
        if(row== n)
        {
            result.add(ConstructSolution(board));
            return;
        }
        for(int col=0;col<n;col++)
        {
            if(isValid(board,row,col,n))
            {
                //Place queen
                board[row][col]='Q';
                //backtrack
                backtrack(result,board,row+1,n);

                // Remove queen(backtrack)
                board[row][col]='.';
            }
        }
    }
    public boolean  isValid(char [][]board,int row,int col,int n)
    {

        //check for colum
        for(int i=0;i<row;i++)
        {
            if(board[i][col]=='Q'){
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
    public List<String> ConstructSolution(char[][]board)
    {
        List<String> sol=new ArrayList<>();
        for(char [] row:board)
        {
            sol.add(new String(row));
        }
        return sol;
    }
}
