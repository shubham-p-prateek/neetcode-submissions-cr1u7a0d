class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap<Character,Integer> map = new HashMap<>();
       int max = 0; int l = 0;
       for(int i = 0;i<s.toCharArray().length;i++){
        if(map.containsKey(s.charAt(i))){
            l = Math.max(map.get(s.charAt(i)) + 1, l);
        }
        map.put(s.charAt(i),i);
        max = Math.max(max, i - l + 1);
       }
       return max; 
    }
}
