 class Solution {
        public boolean isValidSudoku(char[][] board) {
            HashMap<Integer, HashSet<Character>> col = new HashMap<>();
            HashMap<Integer, HashSet<Character>> row = new HashMap<>();
            HashMap<String, HashSet<Character>> sqr = new HashMap<>();

            for (int c = 0; c < 9; c++) {
                for (int r = 0; r < 9; r++) {
                    String sqrKey = r / 3 + "," + c / 3;
                    if (board[r][c] == '.') {
                        continue;
                    }
                    if (col.computeIfAbsent(c, (k) -> new HashSet<>()).contains(board[r][c]) ||
                            row.computeIfAbsent(r, (k) -> new HashSet<>()).contains(board[r][c]) ||
                            sqr.computeIfAbsent(sqrKey, (k) -> new HashSet<>()).contains(board[r][c])
                    ) {
                        return false;
                    }
                    col.get(c).add(board[r][c]);
                    row.get(r).add(board[r][c]);
                    sqr.get(sqrKey).add(board[r][c]);
                }
            }
            return true;
        }
    }