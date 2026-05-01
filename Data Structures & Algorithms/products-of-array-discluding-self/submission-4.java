class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zero = 0;
        int product = 1;
        int[] products = new int[nums.length];

        for(int i = 0;i<nums.length; i++){
            if(nums[i]==0){
                zero++;
            }
            if(nums[i]!=0){
                product = product * nums[i];
            }
        }

        for(int i = 0;i<nums.length; i++){
            if(nums[i]!=0 && zero<1){
               products[i] = product/nums[i];
            } else if(nums[i]==0 && zero==1){
                products[i] = product;
            } else{
                products[i] = 0;
            }
        }
        return products;
    }
}  
