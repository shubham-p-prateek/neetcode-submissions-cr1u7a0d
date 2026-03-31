class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) return false;

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for(char sChar: s.toCharArray()){
            sMap.put(sChar,sMap.getOrDefault(sChar,0)+1);
        }

        for(char tChar: t.toCharArray()){
            tMap.put(tChar,tMap.getOrDefault(tChar,0)+1);
        }


        for(char sChar:sMap.keySet()){
            if(tMap.containsKey(sChar) && tMap.get(sChar).equals(sMap.get(sChar))){
               continue;
            } else{
                return false;
            }
        }
        return true;
    }
}
