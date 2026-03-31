class Solution {
    public int trap(int[] height) {
        int size = height.length;
        int[] leftMax = new int[size];
        int[] rightMax = new int[size];

        int leftmax = 0;
        int rightmax = 0;
    

        for(int i = 0;i<size;i++){
            leftmax = Math.max(leftmax,height[i]);
            leftMax[i] = leftmax;

            rightmax = Math.max(rightmax,height[size-i-1]);
            rightMax[size-i-1] = rightmax;
        }
        int maxWater = 0;
       for(int i = 0;i<size;i++){
           maxWater += Math.max(Math.min(rightMax[i],leftMax[i])-height[i],0);
        }

       return maxWater; 
    }
}
