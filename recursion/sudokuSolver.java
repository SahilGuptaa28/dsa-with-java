class Solution {
     public boolean isValid(char[][] board, int row, int col, char c){
         for (int i = 0; i < 9; i++) {
            if (board[i][col] == c) return false;  // for checking same column;
            if(board[row][i] == c) return false;  // for checking same row;
            if(board[3*(row/3) + i / 3][3*(col/3)+i % 3] == c) return false; // for checking 3 by 3 grid;
        }
        return true;
     }
     public boolean solve(char[][] board){
      for(int i=0;i<9;i++){
            for(int j= 0 ;j<9;j++){
                if(board[i][j] == '.'){

                    for(char c = '1';c<= '9';c++){
                        if(isValid(board,i,j,c)){
                        board[i][j] = c;

                        if(solve(board) == true){
                            return true;
                        }else{
                            board[i][j] = '.';
                        }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
     }
    public void solveSudoku(char[][] board) {
      solve(board);
    }
}