class MinStack {
    private Stack<Integer> stack;

    MinStack(){
        stack = new Stack<Integer>();
    }

    public void push(int i){
        stack.push(i);
    }

    public void pop(){
        stack.pop();
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        int min = Integer.MAX_VALUE;
        Iterator<Integer> it = stack.iterator();
        while (it.hasNext()) {
           min = Math.min(min,it.next());
        }
        return min;
    }
}
