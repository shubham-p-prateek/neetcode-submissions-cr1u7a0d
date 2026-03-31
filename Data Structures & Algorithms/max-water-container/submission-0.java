class Solution {
    public int maxArea(int[] heights) {

        int left = 0; 
        int right = heights.length - 1;

        int capacity = 0;

        while (left<right){

            capacity = Math.max(capacity, Math.min(heights[left],heights[right])* (right - left));

            if(heights[left] <= heights[right]){
                left++;
            }
            else{
                right--;
            }

        }

        return capacity;
        
    }
}
