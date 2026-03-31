class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) return false;

        int freq[] = new int[26]; 
        

        for(char sChar: s.toCharArray()){
            int ascii = (int) sChar;
            freq[ascii-97]++;
        }

        for(char tChar: t.toCharArray()){
            int ascii = (int) tChar;
            freq[ascii-97]--;
        }


        for(int i:freq){
           if(i!=0){
            return false;
           }
        }
        return true;
    }
}
