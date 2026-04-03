class TimeMap {

    private HashMap<String,ArrayList<Pair<Integer,String>>> keystore;

       public TimeMap() {
        keystore = new HashMap<>();
       }
        
    
    public void set(String key, String value, int timestamp) {
        if(keystore.containsKey(key)){
            ArrayList<Pair<Integer,String>> arr = keystore.get(key);
            arr.add(new Pair(timestamp,value));
            keystore.put(key, arr);
        }
        else{
            ArrayList<Pair<Integer,String>> arr = new ArrayList<>();
            arr.add(new Pair(timestamp,value));
            keystore.put(key, arr);
        }
    }
    
    public String get(String key, int timestamp) {
        ArrayList<Pair<Integer,String>> value = keystore.getOrDefault(key,new ArrayList<>());
        String result = "";
        int l = 0;
        int h = value.size() - 1;

        while(l<=h){

            int mid = l + (h-l)/2;
            if(value.get(mid).getKey()<=timestamp){
                result = value.get(mid).getValue();
                l = mid + 1;
            }  
            else{
                h = mid -1;
            }
        }
        return result;
    }
}

private static class Pair<K,V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
