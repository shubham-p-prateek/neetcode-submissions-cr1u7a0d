class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int top = 0;
        int bot = matrix.length - 1;
        
        while(top<bot){
            int mid = top + (bot - top)/2;
            if(matrix[mid][0] > target){
                bot = mid - 1;
            } else if(matrix[mid][matrix[mid].length - 1]< target){
               top = mid + 1;
            } else{
                break; 
            }
        } 
        
        if(top>bot){
            return false;
        }
        int row = top + (bot - top)/2;
        int low = 0;
        int high = matrix[row].length - 1;
      
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] > target) {
                high = mid - 1;
            } else if (matrix[row][mid] < target) {
                low = mid + 1;
            }
        }


        return false;
    }
}

