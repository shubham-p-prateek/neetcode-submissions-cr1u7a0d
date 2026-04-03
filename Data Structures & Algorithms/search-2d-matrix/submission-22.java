class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length;
        int col = matrix[0].length;

        int low = 0;
        int high = row * col - 1;

        while(low<=high){
            int mid = low + (high-low)/2;

            int val = matrix[mid/col][mid%col];

            if(val>target){
                high = mid - 1;
            } else if(val<target){
               low = mid + 1;
            } else {
                return true;
            } 
        }

        return false;
    }
}

