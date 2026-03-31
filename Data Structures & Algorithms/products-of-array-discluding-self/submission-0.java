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

        for(int i = 0;i<nums.length;i++){

            if(nums[i]==0 && numZero==1){
                result[i] = product;
            }
            else if(numZero>1 || numZero==1){ 
                result[i] = 0;
            }
            else  {
                result[i] = product/nums[i];
            }
        }

        return result;
        
    }
}  
