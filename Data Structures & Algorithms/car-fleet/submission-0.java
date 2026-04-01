class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        ArrayList<int[]> pair = new ArrayList<>();

        for(int i = 0;i<position.length;i++){
            pair.add(new int[]{position[i],speed[i]});
        }

        pair.sort((a,b)-> b[0]-a[0]);


        int fleets = 1;
        double prevTime = (double)(target - pair.get(0)[0]) / pair.get(0)[1];
        for (int i = 1; i < pair.size(); i++) {
            double currTime = (double)(target - pair.get(i)[0]) /pair.get(i)[1];
            if (currTime > prevTime) {
                fleets++;
                prevTime = currTime;
            }
        }
        return fleets;
        
    }
}
