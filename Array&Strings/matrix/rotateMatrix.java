// 48. Rotate Image using Transpose and Reverse Method
class Solution {
    // this transpose will only work for square matrix
    public void transpose(int[][] matrix){
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
               int temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;
            }
        }
    }
    public void reverse(int[] arr){
        int l = 0; int h = arr.length-1;
        while(l<=h){
             int temp = arr[l];
              arr[l] = arr[h];
              arr[h] = temp;
              l++;
              h--;
        }
    }
    public void rotate(int[][] matrix) {
        transpose(matrix);
     for(int i=0;i<matrix.length;i++){
        reverse(matrix[i]);
     }
    }
}
// 48. Rotate Image using Brute Force Method
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] res = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res[j][n-1-i] = matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = res[i][j];
            }
        }
    }
}