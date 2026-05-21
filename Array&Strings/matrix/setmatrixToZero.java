// better approach
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;      
                }
               
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }
               
            }
        } 
    }
}
// brute force approach
class Solution {
    public void solve(int[][] matrix, int row, int col) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            matrix[i][col] = 0;
        }
        for(int i=0;i<n;i++){
            matrix[row][i] = 0;
        }
        return;
    }

    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    ArrayList<Integer> list = new ArrayList<>();
                     list.add(i);
                     list.add(j);
                     res.add(list);
                }
               
            }
        }
        for(int i=0;i<res.size();i++){
             ArrayList<Integer> list1 = res.get(i);
             int x = list1.get(0);
             int y= list1.get(1);
             solve(matrix,x,y);
        }
    }
}