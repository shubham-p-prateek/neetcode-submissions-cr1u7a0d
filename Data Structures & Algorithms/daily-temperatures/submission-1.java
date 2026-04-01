class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        for(int i = 0;i<temperatures.length;i++){
            int temp = temperatures[i];
            while(!stack.isEmpty() && stack.peek()[0]<temp){
                int[] prev = stack.pop();
                result[prev[1]] = i - prev[1];
            }
            stack.push(new int[]{temp,i});
        }
        return result; 
    }
}
