class NumMatrix {

    int[][] prefixSum;

    public NumMatrix(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        int sum = 0;
        prefixSum = new int[row+1][col+1];
        for(int r = 0; r < row; r++){
            int prefix = 0;
            for(int c = 0; c < col; c++){
               prefix+=matrix[r][c];
               int above = prefixSum[r][c+1];
               prefixSum[r+1][c+1] = prefix + above;
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++; col1++; row2++; col2++;
        int bottomRight = prefixSum[row2][col2];
        int above = prefixSum[row1 - 1][col2];
        int left = prefixSum[row2][col1 - 1];
        int topLeft = prefixSum[row1 - 1][col1 - 1];
        return bottomRight - above - left + topLeft;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */