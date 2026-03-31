class MinStack {
    private Stack<Integer> stack;

    public MinStack() {
      stack = new Stack<>(); 
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
         stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
    int min = Integer.MAX_VALUE;
    Iterator<Integer> it = stack.iterator();

    while (it.hasNext()) {
        min = Math.min(min, it.next());
    }

    return min;
}
}
