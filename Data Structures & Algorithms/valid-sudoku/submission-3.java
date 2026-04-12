 class Solution {
        public boolean isValidSudoku(char[][] board) {
            HashMap<Integer, Set<Character>> row = new HashMap<>();
            HashMap<Integer, Set<Character>> col = new HashMap<>();
            HashMap<String, Set<Character>> sqr = new HashMap<>();

            for (int r = 0; r < board.length; r++) {
                for (int c = 0; c < board.length; c++) {
                    if (board[r][c] == '.') continue;
                    String sqrKey = r / 3 + "," + c / 3;
                    if (row.computeIfAbsent(r, (k) -> new HashSet<>()).contains(board[r][c]) ||
                            col.computeIfAbsent(c, (k) -> new HashSet<>()).contains(board[r][c]) ||
                            sqr.computeIfAbsent(sqrKey, (k) -> new HashSet<>()).contains(board[r][c])
                    ) {
                        return false;
                    }
                   row.get(r).add(board[r][c]);
                    col.get(c).add(board[r][c]);
                    sqr.get(sqrKey).add(board[r][c]);
                }
            }
            return true;
        }
    }