
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

    public void solve(int row, char[][] board, int n, List<List<String>> ans) {

        // Base case: all rows filled
        if (row == n) {
            List<String> temp = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }

            ans.add(temp);
            return;
        }

        // Try placing queen in every column of current row
        for (int col = 0; col < n; col++) {

            if (isSafe(row, col, board, n)) {

                // Place queen
                board[row][col] = 'Q';

                // Move to next row
                solve(row + 1, board, n, ans);

                // Backtrack
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];

        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        solve(0, board, n, ans);

        return ans;
    }
}




class Solution {
    // Function to solve N-Queens
    public void solve(int col, char[][] board, int n,
            int[] leftRow, int[] upperDiagonal, int[] lowerDiagonal,
            List<List<String>> res) {
        // If all queens are placed
        if (col == n) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }
            res.add(temp);
            return;
        }

        // Iterate through rows
        for (int row = 0; row < n; row++) {
            // Check safety
            if (leftRow[row] == 0 && lowerDiagonal[row + col] == 0 &&
                    upperDiagonal[n - 1 + col - row] == 0) {

                // Place queen
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[n - 1 + col - row] = 1;

                // Recurse
                solve(col + 1, board, n, leftRow, upperDiagonal, lowerDiagonal, res);

                // Backtrack
                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[n - 1 + col - row] = 0;
            }
        }
    }

    // Main function
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row : board)
            Arrays.fill(row, '.');
        int[] leftRow = new int[n];
        int[] lowerDiagonal = new int[2 * n - 1];
        int[] upperDiagonal = new int[2 * n - 1];
        solve(0, board, n, leftRow, upperDiagonal, lowerDiagonal, res);
        return res;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution obj = new Solution();
        List<List<String>> ans = obj.solveNQueens(4);
        for (List<String> board : ans) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}