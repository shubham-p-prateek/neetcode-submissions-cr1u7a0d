class Solution {
    public int minEatingSpeed(int[] piles, int hour) {

    
        int maxPile = Arrays.stream(piles).max().getAsInt();

        int l = 1;
        int h = maxPile;
        int ans = h;

        while(l<=h){
            int m = l + (h -l)/2;
       double totalTime = Arrays.stream(piles)
               .mapToDouble(p -> Math.ceil((double) p / m))
               .sum();

        if(totalTime<=hour){
            ans = m;
            h = m - 1;
        } else {
            l = m + 1;
        }

        }
        return ans;
    }
}
