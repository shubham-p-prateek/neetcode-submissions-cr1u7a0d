class Solution {

    public String encode(List<String> strs) {
        if (strs == null || strs.isEmpty()) {return "";}
        StringBuilder result = new StringBuilder();

        for(String str : strs){
            // size.add(str.length());
            result.append(str.length()).append(",");
        }

        // for(int i : size){
           
        // }

        result.append("#");
        for(String str : strs){
            result.append(str).append(",");
        }
        return result.toString();

    }


     public List<String> decode(String strs) {
        List<String> result = new ArrayList<>();
        if(strs.isEmpty()){
            return result;
        }
       int i = 0;
        while(strs.charAt(i) != '#'){
            i++;
        }
        String[] sizeSplit = strs.substring(0,i).split(",");
        i++;
        for (String s : sizeSplit) {
            result.add(strs.substring(i, i+Integer.parseInt(s)));
            i += Integer.parseInt(s)+1;
        }

        return result;
    }
}
