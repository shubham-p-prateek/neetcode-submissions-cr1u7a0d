class Solution {
public int largestRectangleArea(int[] heights) {

    int max = 0;
    Stack<int[]> stack = new Stack<>();

    for (int i = 0; i < heights.length; i++) {
        int height = heights[i];
        int start = i;

        while (!stack.isEmpty() && height < stack.peek()[1]) {
            int[] pop = stack.pop();
            int area = pop[1] * (i - pop[0]);
            max = Math.max(max, area);
            start = pop[0]; 
        }

        stack.push(new int[]{start, height});
    }

    int n = heights.length;
    while (!stack.isEmpty()) {
        int[] a = stack.pop();
        int area = a[1] * (n - a[0]);
        max = Math.max(max, area);
    }

    return max;
}

}
