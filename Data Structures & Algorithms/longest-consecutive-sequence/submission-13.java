class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int max = 0;
         for(int num:set){
            if(!set.contains(num - 1)){
                int size = 1;
                while(set.contains(num + size)){
                    size++;
                }
                max = Math.max(size,max);
            }
        }

        return max;
    }
}
