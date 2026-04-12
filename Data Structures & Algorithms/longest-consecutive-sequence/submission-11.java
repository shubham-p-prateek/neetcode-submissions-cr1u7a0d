class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<1){return 0;}
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i<nums.length;i++){
            set.add(nums[i]);
        }
        int max = 1;
        for(int i : set){
            if(!set.contains(i-1)){
                continue;
            }
            int count = 1;
            int num = i-1;
            while(set.contains(num)){
                count++;
                num--;
            }
            max = Math.max(count, max);
        }
      return max;
    }

}
