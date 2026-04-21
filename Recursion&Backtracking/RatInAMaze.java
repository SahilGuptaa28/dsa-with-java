class Solution {
    public void solve(int i, int j, int[][] maze, int n,
                      ArrayList<String> ans, String path, int[][] vis) {

        // reached destination
        if (i == n - 1 && j == n - 1) {
            ans.add(path);
            return;
        }

        // mark visited
        vis[i][j] = 1;

        // Down
        if (i + 1 < n && vis[i + 1][j] == 0 && maze[i + 1][j] == 1) {
            solve(i + 1, j, maze, n, ans, path + "D", vis);
        }

        // Left
        if (j - 1 >= 0 && vis[i][j - 1] == 0 && maze[i][j - 1] == 1) {
            solve(i, j - 1, maze, n, ans, path + "L", vis);
        }

        // Right
        if (j + 1 < n && vis[i][j + 1] == 0 && maze[i][j + 1] == 1) {
            solve(i, j + 1, maze, n, ans, path + "R", vis);
        }

        // Up
        if (i - 1 >= 0 && vis[i - 1][j] == 0 && maze[i - 1][j] == 1) {
            solve(i - 1, j, maze, n, ans, path + "U", vis);
        }

        // backtrack
        vis[i][j] = 0;
    }

    public ArrayList<String> findPath(int[][] maze, int n) {
        ArrayList<String> ans = new ArrayList<>();

        if (maze[0][0] == 0) {
            return ans;
        }

        int[][] vis = new int[n][n];

        solve(0, 0, maze, n, ans, "", vis);

        return ans;
    }
}