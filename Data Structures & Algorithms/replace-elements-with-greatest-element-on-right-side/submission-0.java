class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int max = Integer.MIN_VALUE;

        result[n - 1] = -1;

        for (int i = 1; i < n; i++) {
            max = Math.max(max,arr[n-i]);
            result[n-1-i] = max;
        }

        return result;
    }
}