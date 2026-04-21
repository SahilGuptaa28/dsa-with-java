class Solution {
    public boolean isTrue(char[][] board,int row,int col,char c){
        for(int i=0;i<9;i++){
            if( i!= col && board[row][i] == c){
                return false;
            }
            if(i!= row && board[i][col] == c){
                return false;
            }
            int newRow = 3*(row/3)+i/3;
            int newCol = 3*(col/3)+i%3;
            if( (newRow != row || newCol != col) && board[newRow][newCol] == c){
                return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] != '.'){
                    char c = board[i][j];
                    if(!isTrue(board,i,j,c)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}