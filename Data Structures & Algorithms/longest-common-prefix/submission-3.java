class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = "";
        int n = 1;

        while(true){
         for(int i = 0; i<strs.length;i++){
           if(n>strs[i].length() || !strs[i].substring(0,n).equals(strs[0].substring(0,n))){
            return str;
           }
        }
        str = strs[0].substring(0,n);
        n++;
        }
    }
}