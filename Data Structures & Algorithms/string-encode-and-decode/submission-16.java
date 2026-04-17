class Solution {

    public String encode(List<String> strs) {
        if(strs.size()==0){
            return "";
        }
        StringBuilder str = new StringBuilder();
        for(String st : strs){
            str.append(st.length()).append(",");
        }
        str.append("#");

        for(String st : strs){
            str.append(st).append(",");
        }
       System.out.println(str.toString());
        return str.toString();
    }


     public List<String> decode(String strs) {
        List<String> result = new ArrayList<>();
        if(strs.length()==0){
            return result;
        }

        String[] arr = strs.split("#")[0].split(",");
    
        int j = 0;
        while(strs.charAt(j)!='#'){
            j++;
        }
        j++;

        for(int i = 0; i < arr.length; i++){
            result.add(strs.substring(j,j+Integer.parseInt(arr[i])));
            j=j+Integer.parseInt(arr[i])+1;
        }
       

        return result;
    }
}
