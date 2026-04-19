class Solution {
    public int removeElement(int[] nums, int val) {
        int k  = 0;
        int n  = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==val) {
               k++;
            } else {
                nums[n] = nums[i];
                n++;
            }
        }
        return n;
    }
}