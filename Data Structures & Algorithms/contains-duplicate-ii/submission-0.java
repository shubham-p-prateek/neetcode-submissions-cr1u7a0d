class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> set = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(set.containsKey(nums[i])){
                int key = set.get(nums[i]);
                if(Math.abs(key-i) <= k){
                    return true;
                }
            }
            set.put(nums[i],i);
        }
        return false;
    }
}