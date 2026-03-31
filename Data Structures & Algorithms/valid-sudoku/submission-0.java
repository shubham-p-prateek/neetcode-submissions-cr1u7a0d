class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                 char temp = board[i][j];
                if(temp=='.'){
                    continue;
                }
                //Check Row
                for(int k = 0;k<9;k++){
                    if(j!=k && board[i][k]==temp){
                        return false;
                    }
                }
                //Check column
                for(int l = 0;l<9;l++){
                     if(i!=l && board[l][j]==temp){
                        return false;
                    }
                }

               // Check in Inner Block
               int innerM = (i/3) * 3;
               int innerN = (j/3) * 3;
               for(int m = innerM ;m<innerM+3;m++){
                 for(int n = innerN;n<innerN+3;n++){
                     if((i!=m || j!=n) && board[m][n]==temp){
                        return false;
                    }
                }
               }
            }
        }
        return true;
    }
}
