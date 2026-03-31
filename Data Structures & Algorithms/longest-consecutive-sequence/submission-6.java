class Solution {
    public int longestConsecutive(int[] nums) {
      int left = 0;
      int right = nums.length - 1;

      int size = 0;

      Set<Integer> set = new HashSet<Integer>();

      for(int i : nums){
        set.add(i);
      }

      for(int num : set){

        if(set.contains(num-1)){
            left++;
            continue;
        }

        int curr = num;
        int currSize = 1;
        while(set.contains(curr+1)){
            curr++;
            currSize++;
        }

        size = Math.max(size,currSize);

      }

      return size;
    }

}
