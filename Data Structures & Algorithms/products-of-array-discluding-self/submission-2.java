class Solution {
    public int[] productExceptSelf(int[] nums) {

        int numZero = nums[0]==0?1:0;
        int product = nums[0];
        int result[] = new int[nums.length];
        for(int i = 1;i<nums.length;i++){
            if(nums[i]==0){ numZero++;}
            else {
            product*=nums[i];
            }
        }
        if (numZero > 1) {
            return new int[nums.length];
        }

        for(int i = 0;i<nums.length;i++){

            if(numZero>0){
                result[i] = (nums[i]==0) ? product: 0;
            } else  {
                result[i] = product/nums[i];
            }
        }

        return result;
        
    }
}  
