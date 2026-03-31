class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        List<int[]> freq = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entity : map.entrySet() ){
            freq.add(new int[]{entity.getValue(), entity.getKey()});
        }

        freq.sort((a,b) -> b[0] - a[0]);

        int[] result = new int[k];

        for(int i = 0;i < k;i++){
            result[i] = freq.get(i)[1];
        }

        return result;

    }
}
