class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();


        for(String s: strs){
            char[] array = s.toCharArray();
            Arrays.sort(array);
            String temp = new String(array);
            map.putIfAbsent(temp, new ArrayList<>());
            map.get(temp).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
