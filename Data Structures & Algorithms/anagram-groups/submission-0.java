class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, ArrayList<String>> map = new HashMap<>();


        for(String s: strs){
            char[] array = s.toCharArray();
            Arrays.sort(array);
            String temp = new String(array);
            ArrayList<String> list = map.getOrDefault(temp,new ArrayList<String>());
            list.add(s);
            map.put(temp,list);
        }

        List<List<String>> result = new ArrayList<>();

        for(Map.Entry<String,ArrayList<String>> i : map.entrySet()){
            result.add(i.getValue());
        }
        return result;
    }
}
