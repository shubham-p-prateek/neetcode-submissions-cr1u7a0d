class Solution {
    public int longestConsecutive(int[] nums) {
      int maxSize = 0;
      Set<Integer> set = new HashSet<>();
      for (int num : nums) {
         set.add(num);
       }
      
      for(int i : set){
        if(set.contains(i-1)){
            continue;
        }

        int size = 1;

        while(set.contains(i+1)){
            size++;
            i++;
        }
       maxSize = Math.max(size,maxSize);
      }

      return maxSize;
    }

}
