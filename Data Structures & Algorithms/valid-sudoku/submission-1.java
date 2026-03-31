class Solution {
    public boolean isValidSudoku(char[][] board) {
       Map<Integer, HashSet<Character>> row = new HashMap<>();
       Map<Integer, HashSet<Character>> col = new HashMap<>();
       Map<String, HashSet<Character>> srqSet = new HashMap<>();

       for(int r = 0;r < 9; r++) {
        for(int c = 0;c < 9; c++) {

            if(board[r][c]=='.'){
                continue;
            }
            String srqKey = (c/3) +","+ (r/3);
            if(row.computeIfAbsent(r, k -> new HashSet<>()).contains(board[r][c])
            || col.computeIfAbsent(c, k -> new HashSet<>()).contains(board[r][c])
            || srqSet.computeIfAbsent(srqKey, k -> new HashSet<>()).contains(board[r][c])){
                return false;
            } 
            else {
                row.get(r).add(board[r][c]);
                col.get(c).add(board[r][c]);
                srqSet.get(srqKey).add(board[r][c]); 
            }
            
       }
    }



        return true;
    }
}
