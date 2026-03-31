class Solution {
    public int longestConsecutive(int[] nums) {
       if (nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int max = 0;
        if (set.size() == 1) return 1;
         for(int num:set){
            if(!set.contains(num - 1)){
                int curr = num;
                int size = 1;

                while(set.contains(curr + 1)){
                    size++;
                    curr++;
                }
                max = Math.max(size,max);
            }
        }

        return max;
    }
}
