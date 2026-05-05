class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();

        int n = word1.length();
        int m = word2.length();

        for(int i = 0;i<n || i < m;i++){
            if(i<n){
                str.append(word1.charAt(i));
            } 
            if(i<m){
                str.append(word2.charAt(i));
            }
        }
        return str.toString();
    }
}