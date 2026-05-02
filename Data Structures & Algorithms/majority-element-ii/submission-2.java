class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap<Integer,Integer> freq = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        int least = Integer.MAX_VALUE;

        for(int num: nums){
           freq.put(num, freq.getOrDefault(num, 0) + 1);   
           least = Math.min(freq.get(num),least);
        }
        for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
            if(entry.getValue()> nums.length/3){
                result.add(entry.getKey());
            }
        }

        return result;
        
    }
}