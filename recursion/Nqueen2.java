class Solution {
     public boolean isSafe(int row, int col, char[][] board, int n) {

        // Check same column upward
        for (int i = row - 1, j = col; i >= 0; i--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public int solve(int row, char[][] board, int n) {

        // Base case: all rows filled
        if (row == n) {
            return 1;
        }
         int count = 0;

        // Try placing queen in every column of current row
        for (int col = 0; col < n; col++) {

            if (isSafe(row, col, board, n)) {

                // Place queen
                board[row][col] = 'Q';

                // Move to next row
              count +=  solve(row + 1, board, n);

                // Backtrack
                board[row][col] = '.';
            }
        }
        return count;
    }

    public int totalNQueens(int n) {
       int count = 0;
        char[][] board= new char[n][n];
          for (char[] row : board) {
            Arrays.fill(row, '.');
        }

      return  solve(0, board, n);
    }
}