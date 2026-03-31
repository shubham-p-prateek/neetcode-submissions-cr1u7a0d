class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap<>();

        for(int i: nums){
            freqMap.put(i, freqMap.getOrDefault(i,0)+1);
        }

        ArrayList<int[]> freq = new ArrayList<>();
        for(Map.Entry<Integer,Integer> ent : freqMap.entrySet()){
            freq.add(new int[]{ent.getValue(),ent.getKey()});
        }

        freq.sort((a,b) -> b[0] - a[0]);
        // for(int[] ent : freq){
        // System.out.println(ent[0]+" "+ent[1]);
        // }
        int[] result = new int[k];
        for(int i = 0; i<k; i++){
            result[i] = freq.get(i)[1];
        }

        return result;
    }
}
